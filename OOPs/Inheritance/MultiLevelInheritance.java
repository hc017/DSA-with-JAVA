package Inheritance;

class GrandFather{

    void grandFather(){
        System.out.println("this is grandfather");
    }
}

class Father extends GrandFather {

    void father(){
        System.out.println("this is father");
    }

}

class Son extends Father{

    void son(){
        System.out.println("this is son");
    }

}

public class MultiLevelInheritance {

    public static void main(String[] args) {

        System.out.println("");
        
        GrandFather g1 = new GrandFather();
        g1.grandFather();
        // g1.father(); cant
        // g1.son();  cant

        System.out.println("");


        Father f1 = new Father();
        f1.grandFather();
        f1.father();
        // f1.son();  cant

        System.out.println("");

        Son s1 = new Son();
        s1.grandFather();
        s1.father();
        s1.son();

    }

}
