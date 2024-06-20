package com.shofiqul.mvc.controllers;

import com.shofiqul.mvc.models.CompanyModel;
import com.shofiqul.mvc.services.CompanyServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class PageController {
    private final CompanyServices companyServices;

    @GetMapping("/")
    public String getHomePage(Model model) {
        companyServices.getCompanyList(model);
        return "index";
    }

    @GetMapping("/add/company")
    public String addCompanyPage(Model model) {
        CompanyModel companyModel = new CompanyModel();
        model.addAttribute("company", companyModel);
        return "add-company";
    }

    @GetMapping("/company/{id}")
    public String companyDetail(@PathVariable("id") Long id, Model model) {
        CompanyModel existingCompany = companyServices.findCompany(id);
        model.addAttribute("company", existingCompany);

        return "add-company";
    }
}
