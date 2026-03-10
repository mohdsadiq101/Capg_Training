package com.cg.entity.EmployeeCriteria;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="emp")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpDept {
    @Id
    private int eid;
    private String name;
    private String dept;
}
