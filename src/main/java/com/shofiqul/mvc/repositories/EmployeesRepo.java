package com.shofiqul.mvc.repositories;

import com.shofiqul.mvc.models.EmployeesModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface EmployeesRepo extends JpaRepository<EmployeesModel, Long> {
}
