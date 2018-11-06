package com.hesc.booweb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "lastcustomer")
public class LastCustomer implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String agentKey;
    private String scn;
    private String companyName;
    private String salutationCode;
    private String firstName;
    private String lastName;
    private String zipCode;
    private String city;
    private Date lastSearch;
    private String customerPhoneNumber;



}
