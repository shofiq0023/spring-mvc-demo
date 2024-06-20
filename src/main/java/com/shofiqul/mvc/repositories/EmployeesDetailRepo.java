package com.shofiqul.mvc.repositories;

import com.shofiqul.mvc.models.EmployeesDetailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesDetailRepo extends JpaRepository<EmployeesDetailModel, Long> {
}
