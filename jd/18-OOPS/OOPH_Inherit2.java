public class OOPH_Inherit2 {
    public static void main(String[] args) {
        Bird b1 = new Bird();

        b1.name = "Birds";
        b1.color = "Brown";
        b1.fly = true;

        System.out.println(b1.name);
        System.out.println(b1.color);
        b1.breathe();
        b1.eats();
        System.out.println("Flying " + b1.fly);

    }
}

class Animal {
    String color, name;

    void eats() {
        System.out.println("Animal  is Eating");
    }

    void breathe() {
        System.out.println("Animal  is Breathing");
    }
}

class Mammal extends Animal {
    int weight;
    int legs;

}

class Bird extends Animal {
    boolean fly;

}