package org.example.DEmo;

import java.io.Serializable;

public class MyClass implements Serializable {
    private static final long serialVersionUID=1L;
    private String message;

    public MyClass(String message){
        this.message=message;
    }

    public String getMessage(){
        return this.message;
    }
}
