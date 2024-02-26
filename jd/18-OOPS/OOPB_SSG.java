public class OOPB_SSG {
    public static void main(String args[]) {
        System.out.println("Hello World!");

        Pen p1 = new Pen();

        p1.setColor("Green");
        p1.setTip(4);

        // class restricted , directly cant access
        // System.out.println(p1.color);
        // System.out.println(p1.tip);

        // class restricted , directly cant assign
        // p1.color = "Teal";
        // p1.tip = 5;

        // accessing with class property function
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

        p1.setColor("Orange");
        p1.setTip(3);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

    }

}

class Pen {
    private String color;
    private int tip;

    void setColor(String newColor) {
        color = newColor;
        // this.color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    String getColor() {
        // return this.color;
        return color;

    }

    int getTip() {
        // return this.tip;
        return tip;
    }

}

class Student {
    String name;
    int age;
    float per;

    void calPer(int p, int c, int m) {
        per = (p + c + m) / 3;
    }

}