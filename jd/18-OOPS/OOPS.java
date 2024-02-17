public class OOPS {
    public static void main(String args[]) {
        System.out.println("Hello World!");

        Pen p1 = new Pen();

        p1.setColor("Green");
        p1.setTip(4);

        // class property is default, directly accessing
        System.out.println(p1.color);
        System.out.println(p1.tip);

        // class property is default, directly assign value
        p1.color = "Teal";
        p1.tip = 5;
        System.out.println(p1.color);
        System.out.println(p1.tip);

        p1.tax = 10;
        System.out.println(p1.tax);

    }

}

class Pen {
    String color;
    int tip;
    int tax;

    void setColor(String newColor) {
        color = newColor;
        // this.color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
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