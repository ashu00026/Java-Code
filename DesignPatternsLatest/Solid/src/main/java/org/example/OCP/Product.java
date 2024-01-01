package org.example.OCP;

public class Product {
    private String name;
    private Color color;
    private Size size;

    private Volume vol;

    public Volume getVol() {
        return vol;
    }

    public void setVol(Volume vol) {
        this.vol = vol;
    }

    public Product(String name, Color color, Size size, Volume vol){
        this.name=name;
        this.color=color;
        this.size=size;
        this.vol=vol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
