package org.example.DEmo;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if(p1.getAge()>p2.getAge())return -1;
        else if(p1.age<p2.age)return 1;
        else {
         int x=p1.name.compareTo(p2.name);
         if(x>0)return 1;
         else if(x<0)return -1;
         else return 0;
        }
    }
}
