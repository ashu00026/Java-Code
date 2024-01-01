package org.example.Builders;

public class IndividualAddressBuilder extends InvidualBuilder {

    public IndividualAddressBuilder(Individual individual){
        this.individual=individual;
    }

    public IndividualAddressBuilder at(String streeAddress){
        individual.streetAddress=streeAddress;
        return this;
    }

    public IndividualAddressBuilder withPostCode(String postCode){
        individual.postcode=postCode;
        return this;
    }

    public IndividualAddressBuilder in(String city){
        individual.city=city;
        return this;
    }

}
