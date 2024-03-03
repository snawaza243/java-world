public class OOPO_QNA6 {

    public static void main(String[] args) {

        Vehicle obj1 = new Car();
        // obj1.print1();

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}

class Vehicle {
    void print() {
        System.out.println("Base class V");
    }
}

class Car extends Vehicle {
    void print1() {
        System.out.println("Derived class C");
    }
}