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
@Table(name = "company")
public class CompanyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String code;
    private String name;

    @OneToMany(mappedBy = "company", cascade = CascadeType.REMOVE)
    private Set<DepartmentsModel> departments;

    @OneToMany(mappedBy = "company", cascade = CascadeType.REMOVE)
    private Set<EmployeesModel> employees;
}
