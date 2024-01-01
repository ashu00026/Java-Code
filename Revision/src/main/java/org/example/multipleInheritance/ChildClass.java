package org.example.multipleInheritance;

public class ChildClass implements FatherClass,MotherClass{
    @Override
    public void height() {
        Class<?>[] superclass = ChildClass.class.getInterfaces();
        System.out.println("Height of "+superclass[0].getSimpleName());
    }

    @Override
    public void color() {
        Class<?>[] superclass = ChildClass.class.getInterfaces();
        System.out.println("Color of "+superclass[1].getSimpleName());
    }
}
