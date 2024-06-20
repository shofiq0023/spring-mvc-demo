package com.shofiqul.mvc.repositories;

import com.shofiqul.mvc.models.CompanyModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface CompanyRepo extends JpaRepository<CompanyModel, Long> {
}
