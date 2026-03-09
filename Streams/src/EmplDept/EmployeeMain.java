package EmplDept;

import java.time.LocalDate;
import java.time.Period;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeService es = new EmployeeService();
//        System.out.println(es.sumOfsalary());

//        System.out.println(es.getEmployeeCountByDept());
//        System.out.println(es.getSeniorEmp());

//        LocalDate ld = LocalDate.now();
//        System.out.println(ld);
//
//        LocalDate ld1 = LocalDate.of(2026,1,26);
//        Period p = Period.between(ld1,ld);
//        System.out.println(p.getDays()+"Days "+p.getMonths()+"Months"+p.getYears());

//        es.getEmpWithoutDept().forEach(s-> System.out.println(s));

        es.getNameAndDuration().forEach(s-> System.out.println(s));

    }
}
