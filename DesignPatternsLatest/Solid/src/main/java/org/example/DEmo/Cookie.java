package org.example.DEmo;

public class Cookie {
    private String name;
    private String value;
    private int maxAge;

    public Cookie(){

    }

    public Cookie(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    @Override
    public String toString(){
        return "Cookie name: "+this.name+", "+"Cookie Value: "+this.value+" !";
    }

}
