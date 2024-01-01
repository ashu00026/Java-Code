 interface Bike{
    void run();
}
class Honda4 implements Bike{
    public void run(){
        System.out.println("running safely") ;
    }
    public static void main(String args[]){
        Bike obj = new Honda4();
        obj.run();
    }
}
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.print(System.lineSeparator());
//        System.out.print("this is done!!");
//        System.out.println("not our business");
//        System.out.print("come to your basics");
//    }
//}