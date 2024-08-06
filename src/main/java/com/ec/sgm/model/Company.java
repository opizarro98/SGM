package com.ec.sgm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Getter
@Setter
@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(name = "phone_number1", nullable = false)
    private String phone1;

    @Column(name = "phone_number2", nullable = false)
    private String phone2;

    @Column(nullable = false)
    private String identification;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String web;

    @Column(nullable = false)
    private String logo;

}
