package com.shofiqul.mvc.servicesImpl;

import com.shofiqul.mvc.models.CompanyModel;
import com.shofiqul.mvc.repositories.CompanyRepo;
import com.shofiqul.mvc.services.CompanyServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CompanyServicesImpl implements CompanyServices {
    private final CompanyRepo companyRepo;

    @Override
    public void getCompanyList(Model model) {
        List<CompanyModel> companies = new ArrayList<CompanyModel>(companyRepo.findAll());
        model.addAttribute("companies", companies);
    }

    @Override
    public void createCompany(CompanyModel company) {
        companyRepo.save(company);
    }

    @Override
    public void deleteCompany(Long id) {
        companyRepo.deleteById(id);
    }

    @Override
    public CompanyModel findCompany(Long id) {
        return companyRepo.findById(id).get();
    }


}
