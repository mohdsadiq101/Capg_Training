package EmplDept;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {
    public double sumOfsalary(){
        double total = EmployeeRepository.getEmployees().stream().map(e->e.getSalary()).collect(Collectors.summingDouble(e->e));
        return total;
    }

    public Map<String,Long> getEmployeeCountByDept(){
        Map<String, Long> m = EmployeeRepository.getEmployees().stream().filter(e->e.getDepartment() != null)
                .map(e -> e.getDepartment().getDepartmentName()).collect(Collectors.groupingBy(e->e,Collectors.counting()));
        return m;
    }

    public String getSeniorEmp(){
        String s = EmployeeRepository.getEmployees().stream().min((x,y)->x.getHireDate().compareTo(y.getHireDate())).get().getFirstName();
        return s;
    }

    public List<String> getNameAndDuration(){
        List<String> li = EmployeeRepository.getEmployees().stream().map(e->{
            Period p = Period.between(e.getHireDate(), LocalDate.now());
            int totalMonth = p.getYears()*12+p.getMonths();
            return e.getFirstName()+"\t"+"Total Month "+totalMonth+"  Days  "+p.getDays();
        }).toList();
        return li;
    }

    public List getEmpWithoutDept(){
        List s = EmployeeRepository.getEmployees().stream().filter(e->e.getDepartment() == null).collect(Collectors.toList());
        return s;
    }
}
