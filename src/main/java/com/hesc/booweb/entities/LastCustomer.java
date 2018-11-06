package com.hesc.booweb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

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


    public LastCustomer() {
    }


    public LastCustomer(String agentKey, String scn, String companyName, String salutationCode, String firstName, String lastName, String zipCode, String city, Date lastSearch, String customerPhoneNumber) {
        this.agentKey = agentKey;
        this.scn = scn;
        this.companyName = companyName;
        this.salutationCode = salutationCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
        this.city = city;
        this.lastSearch = lastSearch;
        this.customerPhoneNumber = customerPhoneNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LastCustomer that = (LastCustomer) o;
        return lastSearch == that.lastSearch &&
                Objects.equals(id, that.id) &&
                Objects.equals(agentKey, that.agentKey) &&
                Objects.equals(scn, that.scn) &&
                Objects.equals(companyName, that.companyName) &&
                Objects.equals(salutationCode, that.salutationCode) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(zipCode, that.zipCode) &&
                Objects.equals(city, that.city) &&
                Objects.equals(customerPhoneNumber, that.customerPhoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, agentKey, scn, companyName, salutationCode, firstName, lastName, zipCode, city, lastSearch, customerPhoneNumber);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgentKey() {
        return agentKey;
    }

    public void setAgentKey(String agentKey) {
        this.agentKey = agentKey;
    }

    public String getScn() {
        return scn;
    }

    public void setScn(String scn) {
        this.scn = scn;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSalutationCode() {
        return salutationCode;
    }

    public void setSalutationCode(String salutationCode) {
        this.salutationCode = salutationCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getLastSearch() {
        return lastSearch;
    }

    public void setLastSearch(Date lastSearch) {
        this.lastSearch = lastSearch;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
