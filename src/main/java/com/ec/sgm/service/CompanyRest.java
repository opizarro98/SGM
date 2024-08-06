package com.ec.sgm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ec.sgm.controller.CompanyController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/companyRest")
public class CompanyRest {

    public Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CompanyController companyController;

    @CrossOrigin(origins = "*")
    @PostMapping("/companySearch")
    @ResponseBody
    public ResponseBody SearchCompanyToIdentification(@RequestBody String entity) {
        companyController.serchCompanyByid();

        return null;
    }

}
