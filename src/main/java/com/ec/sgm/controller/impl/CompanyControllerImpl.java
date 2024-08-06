package com.ec.sgm.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.sgm.controller.CompanyController;
import com.ec.sgm.model.Company;
import com.ec.sgm.repository.CompanyRepo;

@Service
public class CompanyControllerImpl implements CompanyController {

    @Autowired
    CompanyRepo companyRepo;

    @Override
    public Company serchCompanyByid() {
        companyRepo.findAllById(null);
        return null;
    }

}
