package org.example.SRP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Journal {
    private List<String> Journals=new ArrayList<>();
    private int count=0;

    public void createJournal(String JournalName){
        Journals.add(" "+ ++count +" "+ JournalName);
    }

    public void appendAJournal(){
        String [] prependSomeJournals=new String[5];
        prependSomeJournals[0]="Waking up at 5am";
        prependSomeJournals[1]="Making BreakFast!";
//        List<String>x=Arrays.stream(prependSomeJournals).toList();

        int breakpoint=-1;
        for(int i=0;i<5;i++){
            if(prependSomeJournals[i]==null){
                breakpoint=i;
                break;
            }
        }
        for(String x:Journals){
            prependSomeJournals[breakpoint]=x;
            breakpoint++;
        }

//        String [] journals=Journals.toArray(prependSomeJournals);
        System.out.println("from append jounals method");
        for(String x:prependSomeJournals){
            if(x!=null)System.out.println(x);
        }
        Journals= Arrays.stream(prependSomeJournals).toList();
    }

    public void removeJournal(int index){
        Journals.remove(index);
    }


    @Override
    public String toString() {
        List<String> ans= Journals.stream().filter(j->j!=null).toList();
        return String.join(System.lineSeparator(),ans);
    }
}
