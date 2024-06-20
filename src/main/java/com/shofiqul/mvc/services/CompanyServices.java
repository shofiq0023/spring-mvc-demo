package com.shofiqul.mvc.services;

import com.shofiqul.mvc.models.CompanyModel;
import org.springframework.ui.Model;

import java.util.List;

public interface CompanyServices {
    void getCompanyList(Model model);

    void createCompany(CompanyModel company);

    void deleteCompany(Long id);

    CompanyModel findCompany(Long id);
}
