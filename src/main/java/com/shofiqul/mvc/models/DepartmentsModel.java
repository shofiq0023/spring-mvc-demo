package com.shofiqul.mvc.models;

import jakarta.annotation.Priority;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "departments")
public class DepartmentsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idd;
    private String code;
    private String name;

    @ManyToOne
    private CompanyModel company;

    @OneToMany(mappedBy = "department")
    private Set<EmployeesModel> employees;
}
