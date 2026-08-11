
class Car {
    String owner;

    Car(String owner) {
        this.owner = owner;
    }

    void displayOwner() {
        System.out.println("Owner: " + owner);
    }
}

interface Diesel {
    void dieselCar();
}

interface Petrol {
    void petrolCar();
}

interface EV {
    void electricCar();
}

class Tata extends Car implements Petrol, EV {

    Tata(String owner) {
        super(owner);
    }

    public void petrolCar() {
        System.out.println("Tata Petrol Car");
    }

    public void electricCar() {
        System.out.println("Tata Electric Car");
    }
}

class TataNano extends Tata {

    TataNano(String owner) {
        super(owner);
    }

    void nano() {
        System.out.println("Tata Nano");
    }
}

public class Vehicle {
    public static void main(String[] args) {

        TataNano car = new TataNano("Pitambar");

        car.displayOwner();
        car.nano();
        car.petrolCar();
        car.electricCar();
    }
}