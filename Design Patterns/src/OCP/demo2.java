package OCP;
//Specification Pattern
//open closed principle
//open for extensions and closed for modifications

import java.util.List;
import java.util.stream.Collectors;

interface Specification<T>{
    boolean isSatisfied(T item);
}
interface Filter<T>{
    List<T> filter(List<T> items, Specification<T>Spec);
}

class BetterFilter implements Filter<Productt>{

    @Override
    public List<Productt> filter(List<Productt> items, Specification<Productt> Spec) {
        return items.stream().filter(p -> Spec.isSatisfied(p)).collect(Collectors.toList());
    }
}
class AndSpecification<T> implements Specification<T>{
    private Specification<T> first,second;
    public AndSpecification(Specification<T>first,Specification<T>second){
        this.first=first;
        this.second=second;
    }
    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item)&& second.isSatisfied(item);
    }
}
class ColorSpecification implements Specification<Productt>{
    private Colorr color;
    public ColorSpecification(Colorr c){
        this.color=c;
    }
    @Override
    public boolean isSatisfied(Productt item) {
        return this.color == item.color;
    }
}
class SizeSpecification implements Specification<Productt>{
    private Sizee size;
    public SizeSpecification(Sizee size){
        this.size= size;
    }
    @Override
    public boolean isSatisfied(Productt item) {
        return item.size==this.size;
    }
}
enum Colorr{
    RED,BlUE,GREEEN
}
enum Sizee {
    SMALL,MEDIUM,LARGE
}
class Productt{
    public String name;
    public Sizee size;
    public Colorr color;
    public Productt(String name,Sizee s,Colorr c ){
        this.name=name;
        this.color=c;
        this.size=s;
    }
    public String toString(){
        return this.name;
    }
}

public class demo2 {
    public static void main(String[] args) {
        Productt p1= new Productt("pen", Sizee.SMALL,Colorr.BlUE);
        Productt p2= new Productt("house", Sizee.LARGE,Colorr.RED);
        Productt p3= new Productt("bike", Sizee.MEDIUM,Colorr.GREEEN);
        List<Productt> products= List.of(p1,p2,p3);
        BetterFilter bf1= new BetterFilter();
        System.out.println("new Method: ");
        bf1.filter(products,new ColorSpecification(Colorr.GREEEN)).forEach(p-> System.out.println(p.name));
        System.out.println("Large Red Objects: ");
        bf1.filter(products,new AndSpecification<>(new ColorSpecification(Colorr.RED),new SizeSpecification(Sizee.LARGE)))
                .forEach(p-> System.out.println(p.name));
    }
}
