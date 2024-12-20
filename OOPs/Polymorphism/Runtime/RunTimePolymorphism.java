package Polymorphism.Runtime;

class A{

    void add(int a , int b){
        System.out.println(a);
    }

}

class B extends A{
    
    void add(int a , int b){
        System.out.println(a);
        System.out.println(b);

    }

}

public class RunTimePolymorphism {
    public static void main(String[] args) {

        A a1 = new A();
        a1.add(1, 4);

        System.out.println("");
        
        B b1 = new B();
        b1.add(5, 5);


        
    }

}
