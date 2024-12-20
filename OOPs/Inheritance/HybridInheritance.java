package Inheritance;

class A{

    void disp1(){
        System.out.println("this class A");
    }

}

class B extends A{

    void disp2(){
        System.out.println("this class B inherits parent A");
    }

}

class C extends A{

    void disp3(){
        System.out.println("this is class c inherits parent A ");
    }

}

public class HybridInheritance {

    A a1 = new A();

    // a1.disp1();

    B b1 = new B();

    // b1.disp1();

    C c1 = new C();

    // c1.disp1();





}
