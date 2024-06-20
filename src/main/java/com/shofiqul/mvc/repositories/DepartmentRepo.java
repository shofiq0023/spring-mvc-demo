package com.shofiqul.mvc.repositories;

import com.shofiqul.mvc.models.DepartmentsModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface DepartmentRepo extends JpaRepository<DepartmentsModel, Long> {
}
