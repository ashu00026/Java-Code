package org.example.DEmo;

public class Person {
    int age;
    String name;
    int salary;

    public Person(){

    }

    public Person(String name,int age,int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
