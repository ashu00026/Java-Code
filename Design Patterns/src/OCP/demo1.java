package OCP;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

//OCP +Specification
enum Color{
    RED,BlUE,GREEEN
}
enum Size {
    SMALL,MEDIUM,LARGE
}

class Product{
    public String name;
    public Size size;
    public Color color;

    public Product(String name,Size s,Color c ){
        this.name=name;
        this.color=c;
        this.size=s;
    }
    public String toString(){
        return this.name;
    }
}

class ProductFilter{
    public List<Product> filterByColor(List<Product> products,Color color){
        return products.stream().filter(p-> p.color==color).collect(Collectors.toList());
    }

    public List<Product> filterBySize(List<Product> products,Size size){
        return products.stream().filter(p->p.size==size).collect(Collectors.toList());
    }

    public List<Product> filterBySizeAndColor(List<Product> products,Size s,Color c){
        return products.stream().filter(p->p.size==s && p.color==c).collect(Collectors.toList());
    }

}

public class demo1{
    public static void main(String[] args) {
        Product p1= new Product("pen", Size.SMALL,Color.BlUE);
        Product p2= new Product("house", Size.LARGE,Color.RED);
        List<Product> products= List.of(p1,p2);

        ProductFilter filter1= new ProductFilter();
        List<Product> p3 = filter1.filterByColor(products, Color.BlUE);

        List<Product> p4= filter1.filterBySize(products,Size.LARGE);

        List<Product> p5= filter1.filterBySizeAndColor(products,Size.SMALL,Color.BlUE);

        Iterator itr2= p5.iterator();

        Iterator itr= p3.iterator();
        Iterator itr1= p4.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        while(itr2.hasNext()){
            System.out.println("for the both size and color condition: ");
            System.out.println(itr2.next());
        }
    }
}


