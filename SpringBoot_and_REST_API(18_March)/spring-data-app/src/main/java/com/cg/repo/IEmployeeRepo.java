package com.cg.repo;

import com.cg.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee,Integer> {
//    public List<Employee> findByName(String name);
// here in method name 'findBy' is a keyword and 'Name' should be same as the property name in the employee class

    @Query("select e from Employee e where e.name=:n")
    public List<Employee> findByNa(@Param("n") String name);

    public List<Employee> findBySalaryLessThan(double salary);
    public List<Employee> findByNameAndSalary(String name, double salary);

    public List<Employee> findByDobBetween(LocalDate start, LocalDate end);
}
