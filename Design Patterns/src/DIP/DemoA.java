package DIP;
//A.high level modules shouldnot depend on low level modules.
//both should depend on abstractions

import java.util.ArrayList;
import java.util.List;

//B.Abstractions should not depend on details
//details should depend on abstractions
enum relationship{
    PARENT,
    CHILD,
    SIBLING
}

class person{
    private String name;
    public person(String name){
        this.name=name;
    }
}

class Relationships{
    private List<Triplet<person,relationship,person>> relations= new ArrayList<>();

    public List<Triplet<person, relationship, person>> getRelations() {
        return relations;
    }

    public Relationships(){

    }
    public  Relationships(person parent,person child){
//        this.pe

    }
}

public class DemoA {
    public static void main(String[] args) {

    }
}
