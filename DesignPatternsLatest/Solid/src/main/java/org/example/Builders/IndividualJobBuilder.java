package org.example.Builders;

public class IndividualJobBuilder extends InvidualBuilder {
    public IndividualJobBuilder(Individual individual){
        this.individual=individual;
    }

    public IndividualJobBuilder at(String company){
        individual.companyName=company;
        return this;
    }

    public IndividualJobBuilder with(int annualIncome){
        individual.annualIncome=annualIncome;
        return this;
    }

    public IndividualJobBuilder as(String position){
        individual.position=position;
        return this;
    }


}
