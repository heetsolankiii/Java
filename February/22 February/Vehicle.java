// Question: Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
public class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double fuelEfficiency() {
        return 0.0;
    }

    public double distanceTraveled() {
        return 0.0;
    }

    public int maxSpeed() {
        return 0;
    }

    public static void main(String[] args) {
        Truck truck = new Truck("RAM", "1500", 2024, "Octane 89");
        Car car = new Car("Porsche", "918 Spyder", 2013, "Hybrid");
        Motorcycle motorcycle = new Motorcycle("BMW", "F 900 XR", 2022, "Petrol");

        displayVehicleInfo(truck);
        displayVehicleInfo(car);
        displayVehicleInfo(motorcycle);
    }

    private static void displayVehicleInfo(Vehicle vehicle) {
        System.out.println("Vehicle Information:");
        System.out.println("Make: " + vehicle.getMake());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Year: " + vehicle.getYear());
        System.out.println("Fuel Type: " + vehicle.getFuelType());
        System.out.println("Fuel Efficiency: " + vehicle.fuelEfficiency());
        System.out.println("Distance Traveled: " + vehicle.distanceTraveled());
        System.out.println("Max Speed: " + vehicle.maxSpeed());
        System.out.println();
    }
}

class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public double fuelEfficiency() {
        return 20.0; 
    }

    public double distanceTraveled() {
        return 2500; 
    }

    public int maxSpeed() {
        return 118; 
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public double fuelEfficiency() {
        return 22; 
    }

    public double distanceTraveled() {
        return 3500; 
    }

    public int maxSpeed() {
        return 345; 
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public double fuelEfficiency() {
        return 23.8; 
    }

    public double distanceTraveled() {
        return 654;
    }

    public int maxSpeed() {
        return 200; 
    }
}
