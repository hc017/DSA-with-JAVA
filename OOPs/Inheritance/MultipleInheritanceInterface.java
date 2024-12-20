package Inheritance;

interface A{
    void disp();
}

interface B{
    void disp();
}

class childC implements A, B{

    public void disp(){

        System.out.println("this is A, B");

    }



}

public interface MultipleInheritanceInterface {

}
