public class OOPN_Constructor {
    public static void main(String[] args) {
        // Creating an instance of the Car class using the constructor
        // Car myCar = new Car("Toyota", "Camry", 2022);

        new Car();
        // Displaying details of the car
        // myCar.displayDetails();
    }
}

class Car {

    Car(){
        System.out.println("Car constructor called");

    }
    // Attributes of the Car class
    String brand;
    String model;
    int year;

    // Constructor for the Car class
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

}
