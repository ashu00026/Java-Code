package org.example.Synco;

public class MyThreadClass implements Runnable{

    private Counter counter;

    public MyThreadClass(Counter c){
        this.counter=c;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            counter.increment();
        }
    }

}
