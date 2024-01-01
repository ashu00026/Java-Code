package org.example.OCP;

public class VolumeSpecification implements Specification<Product>{

    private Volume volume;

    public VolumeSpecification(Volume volume){
        this.volume=volume;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return this.volume==item.getVol();
    }
}
