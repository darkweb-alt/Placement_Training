import java.util.ArrayList;

abstract class Vehicle {
    String vehicleNumber;
    String brand;
    double baseRate;

    Vehicle(String vehicleNumber, String brand, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    abstract double calculateRentalCost(int days);

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Base Rate: " + baseRate);
    }
}

interface Insurable {
    double getInsuranceCost();
}

class Car extends Vehicle implements Insurable {

    Car(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    double calculateRentalCost(int days) {
        return baseRate * days;
    }

    public double getInsuranceCost() {
        return 500;
    }
}

class Bike extends Vehicle {

    Bike(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    double calculateRentalCost(int days) {
        return baseRate * days * 0.8;
    }
}

class Truck extends Vehicle implements Insurable {

    Truck(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    double calculateRentalCost(int days) {
        return baseRate * days * 1.5;
    }

    public double getInsuranceCost() {
        return 1000;
    }
}

class RentalAgency {
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    void generateBill(String vehicleNumber, int days) {

        for (Vehicle vehicle : vehicles) {

            if (vehicle.vehicleNumber.equals(vehicleNumber)) {

                double rentalCost = vehicle.calculateRentalCost(days);
                double insuranceCost = 0;

                if (vehicle instanceof Insurable) {
                    Insurable insurable = (Insurable) vehicle;
                    insuranceCost = insurable.getInsuranceCost();
                }

                double total = rentalCost + insuranceCost;

                System.out.println("Vehicle Number: " + vehicle.vehicleNumber);
                System.out.println("Brand: " + vehicle.brand);
                System.out.println("Days: " + days);
                System.out.println("Rental Cost: " + rentalCost);
                System.out.println("Insurance Cost: " + insuranceCost);
                System.out.println("Total Cost: " + total);
                System.out.println();

                return;
            }
        }

        System.out.println("Vehicle not found");
    }
}

public class VehicleRental {
    public static void main(String[] args) {

        Car car = new Car("TN01CA1234", "Toyota", 2000);
        Bike bike = new Bike("TN01BI5678", "Honda", 1000);
        Truck truck = new Truck("TN01TR9012", "Tata", 3000);

        RentalAgency agency = new RentalAgency();

        agency.addVehicle(car);
        agency.addVehicle(bike);
        agency.addVehicle(truck);

        agency.generateBill("TN01CA1234", 3);
        agency.generateBill("TN01BI5678", 3);
        agency.generateBill("TN01TR9012", 3);
    }
}