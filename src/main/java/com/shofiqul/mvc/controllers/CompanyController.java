package com.shofiqul.mvc.controllers;

import com.shofiqul.mvc.models.CompanyModel;
import com.shofiqul.mvc.services.CompanyServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class CompanyController {
    private final CompanyServices companyServices;

    @PostMapping("/create/company")
    public String createCompany(@ModelAttribute("company") CompanyModel company) {
        companyServices.createCompany(company);
        return "redirect:/";
    }

    @GetMapping("/delete/company/{id}")
    public String deleteCompany(@PathVariable("id") Long id) {
        companyServices.deleteCompany(id);
        return "redirect:/";
    }
}
