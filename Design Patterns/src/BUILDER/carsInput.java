package BUILDER;

import java.util.*;
class insuranceCalculator{
    int val1,val2;
    double res;
    public void perform() {

        res=(val2/100.00)*val1;
    }

}
public class carsInput {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        insuranceCalculator obj=new insuranceCalculator();
        System.out.println("Enter your car choice");
        String carType= sc.nextLine();
        switch(carType ) {
            case "HATCHBACK":
                System.out.println("Enter your price");
                obj.val1=sc.nextInt();
                obj.val2=8;
                obj.perform();
                System.out.println(obj.res);
                break;

        }

    }

}