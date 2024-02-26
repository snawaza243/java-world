public class OOPH_Inherit3 {
    public static void main(String[] args) {

        Pirana p1 = new Pirana();

        p1.name = "Pirana";

        p1.color = "brown";

        System.out.println(p1.name);
        System.out.println(p1.color);

        p1.eats();
        p1.breathe();

    }
}

class Animal {
    String color, name;

    void breathe() {
        System.out.println("Animal breath");
    }

    void eats() {
        System.out.println("Animal eats");
    }
}

class Fish extends Animal {
    int swim;
}

class Pirana extends Animal {
    int swim;
}