package com.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
 // add comments
public class Policy extends Object {
    private String number, holderName;
    private LocalDate startDate, expiryDate;

    Policy(String number, String holderName, String startDate, long durationInYears) {
        this.number = number;
        this.holderName = holderName;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.startDate = LocalDate.parse(startDate, dateFormat);
        this.expiryDate = this.startDate.plusYears(durationInYears);
    }

    public String getPolicyNumber() {
        return this.number;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}
