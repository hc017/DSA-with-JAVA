package Inheritance;

class A {   //parent 1

    void javaA(){

        System.out.println("this is javaA");
    }

}

class B {   //parent 2

    void javaB(){

        System.out.println("this is javaB child of A");
    }
}

// class C extends B extends A{   //child inherits both B & A

//     void javaC(){
//         System.out.println("this is javaC child of A");
//     }
// }

public class MultipleInheritance {

    A a1 = new A();
    // a1.javaA(); 

    B b1 = new B();
    // b1.javaB();
    // b1.javaA();

    // C c1 = new C();
    // c1.javaC();
    // c1.javaA();

}
