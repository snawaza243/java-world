public class OOPH_Inherit4 {
    public static void main(String[] args) {

    }
}

class Animal {
    String color, name;

    void eats() {
        System.out.println("The animal is eating.");

    }

    void breath() {
        System.out.println("The animal is breathing");
    }
}

class Fish extends Animal {

}

class Bird extends Animal {

}

class Mammal extends Animal {

}

class Shark extends Fish {

}

class Whale extends Mammal {

}

class Dog extends Mammal {

}

class Cat extends Mammal {

}

class Human extends Mammal {

}