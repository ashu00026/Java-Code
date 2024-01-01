package org.example.Synco;

public class Counter {
    public int count;
    public synchronized void increment(){
        count++;
    }
}
