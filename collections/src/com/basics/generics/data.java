package com.basics.generics;

public class data<t> implements IData<t> {
    private t ans;
    public data(t ans){
        this.ans=ans;
    }


    @Override
    public t getAns() {
        return ans;
    }

    @Override
    public void setAns(t ans) {
        this.ans = ans;
    }
    @Override
    public String toString(){
        return "data is:"+this.ans;
    }
}
