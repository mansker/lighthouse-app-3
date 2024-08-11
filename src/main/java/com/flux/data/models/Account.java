package com.flux.data.models;

import com.flux.data.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Account extends AbstractEntity {

//    Table columns
    private String accountNumber;
    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String phone;
    private Date dateOfBirth;
    private boolean isVIP;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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

    public @Email String getEmail() {
        return email;
    }

    public void setEmail(@Email String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public boolean isVIP() {
        return isVIP;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }


}
