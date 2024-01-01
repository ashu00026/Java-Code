package org.example.Builders;

public class InvidualBuilder {
    protected Individual individual=new Individual();

    public IndividualAddressBuilder lives(){
        return new IndividualAddressBuilder(individual);
    }

    public IndividualJobBuilder works(){
        return new IndividualJobBuilder(individual);
    }

    public Individual build(){
        return individual;
    }
}
