package org.example.Builders;

public class Individual {
    //address
    public String streetAddress,postcode,city;
    //employment
    public String companyName,position;
    public int annualIncome;

    @Override
    public String toString() {
        return "Individual{" +
                "streetAddress='" + streetAddress + '\'' +
                ", postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                ", companyName='" + companyName + '\'' +
                ", position='" + position + '\'' +
                ", annualIncome=" + annualIncome +
                '}';
    }
}
