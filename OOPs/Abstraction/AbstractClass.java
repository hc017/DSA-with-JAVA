package Abstraction;

abstract class Remote{
    abstract void powerOn();
}

class Tv extends Remote{
    void powerOn(){
        System.out.println("On the TV");
    }
}

public class AbstractClass {

   public static void main(String[] args) {
    
    Tv tv = new Tv();
    tv.powerOn();

   }

}
