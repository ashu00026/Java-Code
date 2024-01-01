package org.example.OCP;

public class AndSpecification<T> implements Specification<T>{

    private Specification<T> first;
    private Specification<T> second;
    private Specification<T> third;

    public AndSpecification(Specification<T> first,Specification<T> second,Specification<T> third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
    public AndSpecification(Specification<T> first,Specification<T> second){
        this.first=first;
        this.second=second;
    }


    @Override
    public boolean isSatisfied(T item) {
        if(this.third==null){
            return first.isSatisfied(item)&&second.isSatisfied(item);
        }
        return first.isSatisfied(item) && second.isSatisfied(item) && third.isSatisfied(item);
    }
}
