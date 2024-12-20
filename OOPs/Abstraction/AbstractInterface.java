package Abstraction;

abstract interface A {

   abstract void add();


    
}

class B {

    void add(){
        System.out.println("dodo");
    }
}



public abstract interface AbstractInterface {

    public static void main(String[] args) {

        B b1 = new B();
        b1.add();
        
        
    }

    

}
