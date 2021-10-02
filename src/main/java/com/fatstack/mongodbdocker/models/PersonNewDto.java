package com.fatstack.mongodbdocker.models;

import com.fatstack.mongodbdocker.constants.Gender;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonNewDto {
    @NotEmpty
    @Size(min = 6, max = 10)
    private String username;

    @NotEmpty
    private String fullName;

    @NotEmpty
    private String password;

    @Min(100L)
    private Long dateOfBirth;

    @NotNull
    private Gender gender;

    @NotNull
    @Valid
    private Address address;

    @NotNull
    @Valid
    private WorkDetails workDetails;

    public PersonNewDto(String username,
                        String fullName,
                        String password,
                        Long dateOfBirth,
                        Gender gender,
                        Address address,
                        WorkDetails workDetails) {
        this.username = username;
        this.fullName = fullName;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.workDetails = workDetails;
    }

    public WorkDetails getWorkDetails() {
        return workDetails;
    }

    public void setWorkDetails(WorkDetails workDetails) {
        this.workDetails = workDetails;
    }

    public PersonNewDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
