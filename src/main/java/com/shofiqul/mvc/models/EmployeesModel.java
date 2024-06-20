package com.shofiqul.mvc.models;

import jakarta.annotation.Priority;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class EmployeesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(mappedBy = "employee")
    private EmployeesDetailModel empDetail;

    @ManyToOne
    private CompanyModel company;

    @ManyToOne
    private DepartmentsModel department;
}
