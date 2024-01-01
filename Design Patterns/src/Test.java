 class Test{
     public Test(){
         System.out.println("super Class constructor is called...");
     }
 }
 class Testing extends Test{
     public Testing(){
         System.out.println("subclass constructor is called...");
     }
}

 class Main{
     public static void main(String[] args) {
         Test t1=new Testing();
     }
 }





