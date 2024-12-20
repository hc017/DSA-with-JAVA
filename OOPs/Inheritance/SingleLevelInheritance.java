package Inheritance;

class A {  //Parent class

    void fly(){
        System.out.println("This is class A");
    }
}

class B extends A{  //Child Class

    void SparRoww(){
        System.out.println("This is class B");
    }


}

public class SingleLevelInheritance {

// In single level inheritance  child class inherits the behavior & properties of parent class

    public static void main(String[] args) {

        A a1 = new A();
        System.out.println("This is parent");
        a1.fly();
        // a1.SparRoww();  this cant happen as its paren tand it cant have child properties

        System.out.println("");

        B b1 = new B();
        System.out.println("This is child has both self and parent properties");
        b1.SparRoww();
        b1.fly(); // Inherited from parent class
        


    }

    
}



