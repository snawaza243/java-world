public class OOPH_Inherit1 {
    public static void main(String[] args) {

        Mammal m1 = new Mammal();

        String c1 = m1.color = "Orange";
        String n1 = m1.name = "Human";
        int l1 = m1.legs = 2;

        System.out.println(n1);
        System.out.println(c1);
        System.out.println(l1);
        m1.breathe();
        m1.eats();
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
    int legs;

}