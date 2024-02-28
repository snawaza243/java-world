public class OOPI_PolyAbst {
    public static void main(String[] args) {

        // Cats c1 = new Cats();
        // // c1.eats();

        Dog d1 = new Dog();
        // d1.color = "red";
        System.out.println(d1.color);
        d1.eats();
        d1.walk();

    }
}

abstract class Animal {

    String color;

    Animal() {
        color = "brown";
        System.out.println("Animal class called");

    }

    void eats() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Cats extends Animal {
    Cats() {
        System.out.println("Extend 1 called");
    }

    void walk() {
        System.out.println("Hen walk on two legs");
    }
}

class Dog extends Cats {
    Dog() {
        System.out.println("Extend 2 called");
    }

    void walk() {
        System.out.println("Dog walk on four legs");
    }
}