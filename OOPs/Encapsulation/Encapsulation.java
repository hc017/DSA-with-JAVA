package Encapsulation;

public class Encapsulation {

    private String name = "Harshal";

    private int value = 10;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public int getValue() {
        return this.value;

    }

    public void setValue(int value) {
        this.value = value;
        System.out.println(value);
    }

    public static void main(String[] args) {

        Encapsulation Encapsulation = new Encapsulation();
        Encapsulation.getName();
        Encapsulation.getValue();
        Encapsulation.setName("Chavan");
        Encapsulation.setValue(0);
        

        
    }


}
