public class OOPJ_Abst {
    public static void main(String[] args) {

        // Animal a1 = new Animal();

        // Dog d1 = new Dog();

        // System.out.println(d1.color);
        // d1.eats();
        // d1.walk();

        HenChild nc = new HenChild();

    }
}

abstract class Animal {

    String color;

    Animal() {
        color = "black";
        System.out.println("Animal constructor");
    }

    void eats() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog constructor");

    }

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("Dog walk with four legs");
    }
}

class Hen extends Animal {

    Hen() {
        System.out.println("Hen constructor");

    }

    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("Hen walks with two legs");
    }
}

class HenChild extends Hen {
    HenChild() {
        System.out.println("HenChild constructor called");
    }
}