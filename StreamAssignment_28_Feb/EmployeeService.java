package StreamAssignment_28_Feb;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeService {
    public double getAvgSalary(){
        double avgSal = EmployeeRepository.getEmployees().stream().map(e->e.getSalary()).collect(Collectors.averagingDouble(e->e));
        return avgSal;
    }

    public Map<Department, Optional<Employee>> getMaxSalaryEmployeePerDept() {
        return EmployeeRepository.getEmployees().stream()
                .filter(emp -> emp.getDepartment() != null)
                .collect(Collectors.groupingBy(
                        emp -> emp.getDepartment(),
                        Collectors.maxBy((e1, e2) ->
                                Double.compare(e1.getSalary(), e2.getSalary()))));
    }

    public Map<String,Double> getTotalSalByDept(){
        Map<String, Double> map = EmployeeRepository.getEmployees().stream().filter(e->e.getDepartment() != null)
                .collect(Collectors.groupingBy(e->e.getDepartment().getDepartmentName(),Collectors.summingDouble(e->e.getSalary())));
        return map;
    }

    public void getEmpAndSal(){
        EmployeeRepository.getEmployees().stream().forEach(e-> System.out.println(e.getFirstName()+" "+e.getSalary()));
    }

    public List<Employee> sortSalByDesc(){
        List li = EmployeeRepository.getEmployees().stream().sorted((e1, e2)->Double.compare(e2.getSalary(), e1.getSalary())).collect(Collectors.toList());
        return li;
    }
}
