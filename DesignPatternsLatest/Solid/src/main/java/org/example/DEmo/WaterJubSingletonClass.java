package org.example.DEmo;

public class WaterJubSingletonClass {

    private static WaterJubSingletonClass waterJug=null;
    private int waterQuantity=500;

//    private WaterJubSingletonClass waterJug=null;

    public int getWaterLeft(){
        return this.waterQuantity;
    }
    private WaterJubSingletonClass(){

    }

    public int getWater(int quantity){
        if(waterQuantity<quantity){
            return 0;
        }
        waterQuantity-=quantity;
        return quantity;
    }

    public static WaterJubSingletonClass getInstance(){
        if(waterJug==null)waterJug=new WaterJubSingletonClass();
        return waterJug;
    }


}
