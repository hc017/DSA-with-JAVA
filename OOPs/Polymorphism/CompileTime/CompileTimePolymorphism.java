package Polymorphism.CompileTime;

class A {

    void add(int a, int b) {
        System.out.println("Two integers:");
        System.out.println(a);
        System.out.println(b);
    }

    void add(int a, int b, int c) {
        System.out.println("Three integers:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    void add(float a, int b, double c) {
        System.out.println("Mixed types:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        A a1 = new A();
        a1.add(1, 2);           // Calls the method with two integers
        a1.add(1, 2, 3);        // Calls the method with three integers
        a1.add(1.2f, 4, 5.6);   // Calls the method with float, int, and double
    }
}
