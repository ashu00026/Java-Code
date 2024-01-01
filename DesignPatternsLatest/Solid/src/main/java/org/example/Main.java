package org.example;

import org.example.Builders.*;
import org.example.DEmo.*;
import org.example.DEmo.Person;
import org.example.OCP.*;
import org.example.SRP.Journal;
import org.example.SRP.Persistance;
import org.example.Synco.Counter;
import org.example.Synco.MyThreadClass;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
//    File
    public static void main(String[] args) throws Exception {
//----------------------------------------SRP---------------------------------------------
//        //single Responsibility Principle states that a class should be dealing with a single Principle at a time
//        //this helps refactoring and maintaining the code base ,even helps give better readability
//        Journal j=new Journal();
//        j.createJournal("had Coffee");
//        j.createJournal("Have Done 2 Dsa Problems");
//        System.out.println(j);
//        Persistance p=new Persistance();
//        String fileName="c:\\temp\\journal.txt";
//        p.saveToFile(j,fileName,true);
//        p.appendToFile("appending this to the Text file",fileName);
//        System.out.println("Input from the file :");
//        p.readFile(fileName);
////        p.testing("c:\\temp\\StringOutputStream.txt");
//        j.appendAJournal();
//        System.out.println(j);
////        p.readFile(fileName);
////        Runtime.getRuntime().exec("notepad.exe "+ fileName);
//--------------------------------OCP------------------------------------------------------------
//-----------------------OPEN-CLOSED-PRINCIPLE---------------------------------------------------
//        Product apple=new Product("Apple",Color.RED,Size.SMALL,Volume.HIGH);
//        Product house=new Product("House", Color.BLUE, Size.LARGE,Volume.LOW);
//        Product tree=new Product("Tree",Color.RED,Size.LARGE,Volume.LOW);
//        List<Product> products=List.of(apple,house,tree);
//
//        AOneFilter theFilter=new AOneFilter();
//        theFilter.filter(products,new ColorSpecification(Color.RED))
//                .forEach(p-> System.out.println(p.getName()));
//        theFilter.filter(products,new SizeSpecification(Size.LARGE))
//                .forEach(p-> System.out.println(p.getName()));
//        theFilter.filter(products,new AndSpecification<>(new ColorSpecification(Color.BLUE),new SizeSpecification(Size.LARGE),
//                        new VolumeSpecification(Volume.HIGH)))
//                .forEach(p-> System.out.println(p.getName()));
//----------------------------------Builders----------------------------------------------------------
//        List<String>thingsToBuy= Arrays.asList("Apple","orange","toothpaste","salt");
//        Builders b=new Builders(thingsToBuy);
//        System.out.println(b.buildTheList());
//        --------------
//        HtmlBuilder builder=new HtmlBuilder("ul");
//        builder
//                .addChild("li","apple")
//                .addChild("li","orange")
//                .addChild("li","salt");
//        System.out.println(builder);
//---------------------------------------
//        EmployeeBuilder pb= new EmployeeBuilder();
//        Person ashutosh = pb
//                            .worksAt("Developer")
//                            .withName("ashutosh")
//                            .build();
//        School sc= new School();
//        sc.withName("ashu");
//        sc.inClass("tenth");
//        System.out.println(sc.child);
//        System.out.println(ashutosh);
//        ----------------------------------------------------/
//        InvidualBuilder ib= new InvidualBuilder();
//        Individual ashutosh= ib.lives()
//                    .at("hyderabad")
//                    .in("hafeezpet")
//                    .withPostCode("45d12C")
//                .works()
//                    .as("Developer")
//                    .with(450000)
//                    .at("com")
//                .build();
//        System.out.println(ashutosh);
//        ---------------------------------------------------------------
//        SingletonEnum singleton = SingletonEnum.INSTANCE;
//        System.out.println(singleton);
//        singleton.doSomething();
//        ------------------------------------------------------------------
//    try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("obj.txt"))){
//        MyClass c=new MyClass("Merry chirstmas");
//        oos.writeObject(c);
//    }catch (IOException e){
//        e.printStackTrace();
//    }
//    try(ObjectInputStream oors=new ObjectInputStream(new FileInputStream("obj.txt"))){
//        MyClass restoredObj= (MyClass) oors.readObject();
//        System.out.println(restoredObj.getMessage());
//    }catch (IOException|ClassNotFoundException e){
//        e.printStackTrace();
//    }
//        --------------------------------------------------------------------------------

//        Counter c= new Counter();
//        MyThreadClass th= new MyThreadClass(c);
//        Thread t1= new Thread(th);
//        Thread t2= new Thread(th);
//        t1.start();
//        t2.start();
//
//
//        t1.join();
//        t2.join();
//
//        System.out.println(c.count);
//        String text="hiheyhello";
//        int index=text.lastIndexOf("h",4);
//        System.out.println(index);
//        String s1=new String("Java11");
//        String s2="Java11";
//        String s3=s1.intern();
//        System.out.println(s1==s2);
//        System.out.println(s2==s3);
//        char ch=\u0223;
//        Test t=new Test();
//        int x=t.indexOfFirstNonRepeatingNumber("abcdeafb");
//        System.out.println(x);

//        Immutable m=new Mutable();
//        System.out.println(m.age);
//        System.out.println(m.name);
//        m.sayHello();
//        m.sayHi();
//        m.greet();
//        WaterJubSingletonClass waterJug=WaterJubSingletonClass.getInstance();
////        int x=waterJug.getWater(100);
////        System.out.println(x);
//        System.out.println(waterJug.getWaterLeft());
//        Person p1=new Person("Ashutosh",23,450000);
//        Person p2=new Person("Arun",24,500000);
//        Person p3=new Person("Ashi",23,800000);
//        List<Person>myList=new ArrayList<>();
//        myList.add(p3);
//        myList.add(p2);
//        myList.add(p1);
//        for(Person x:myList){
//            System.out.println(x.getName());
//        }
//        Collections.sort(myList,new PersonComparator());
//        System.out.println("after sorting!!");
//        for(Person x:myList){
//            System.out.println(x.getName());
//        }
//        String s1="ashutosh";
//        s1=s1.concat("panigrahi");
//        String s2="ashutoshpanigrahi";
//        int hashcode=System.identityHashCode(s1);
//        int hashcode2=System.identityHashCode(s2);
//        System.out.println(hashcode);
//        System.out.println(hashcode2);
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1==s2);
//        String name=new String("ashu");
//        changeName(name);
//        Integer x=new Integer(10);
//        change(x);
//        System.out.println(x);
        for (int i=1;i<100;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
//    static int change(Integer x){
//        return 1;
//    }
//    static void change(Integer x){
//        x=30;
//    }
//    static void changeName(String name){
//        name="ashutosh";
//    }
    static boolean isPrime(int n){
        if(n<=1)return false;
        int x=2;
        while(x*x<=n){
            if(n%x==0)return false;
            x++;
        }
        if(x*x>n)return true;
        return false;
    }

}
