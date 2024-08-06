package com.ec.sgm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.sgm.model.Company;

@Repository
public interface CompanyRepo extends JpaRepository<Company, Long> {

}
