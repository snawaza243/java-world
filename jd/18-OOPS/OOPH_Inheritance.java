public class OOPH_Inheritance {

    public static void main(String[] args) {
        Fish shark = new Fish();

        shark.eat();
        shark.swim();
        // System.out.println();
    }

}

class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breath");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swim in water");
    }

}