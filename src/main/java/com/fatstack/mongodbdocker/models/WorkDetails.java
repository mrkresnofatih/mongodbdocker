package com.fatstack.mongodbdocker.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class WorkDetails {
    @NotEmpty
    private String position;
    @NotEmpty
    private String companyName;
    @Min(1000L)
    private Long salary;

    public WorkDetails(String position, String companyName, Long salary) {
        this.position = position;
        this.companyName = companyName;
        this.salary = salary;
    }

    public WorkDetails() {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
