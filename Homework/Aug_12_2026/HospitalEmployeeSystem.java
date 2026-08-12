package Homework.Aug_12_2026;

abstract class Employee {
    private int id;
    private String name;
    private double basicSalary;

    public Employee(int id, String name) {
        this(id, name, 0.0);
    }

    public Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBasicSalary() { return basicSalary; }
    public void setBasicSalary(double basicSalary) { this.basicSalary = basicSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID            : " + id);
        System.out.println("Name          : " + name);
        System.out.println("Basic Salary  : ₹" + basicSalary);
        System.out.println("Final Salary  : ₹" + calculateSalary());
    }
}

class Doctor extends Employee {
    private double consultationAllowance;

    public Doctor(int id, String name, double basicSalary) {
        this(id, name, basicSalary, 0.0);
    }

    public Doctor(int id, String name, double basicSalary, double consultationAllowance) {
        super(id, name, basicSalary);
        this.consultationAllowance = consultationAllowance;
    }

    public double getConsultationAllowance() { return consultationAllowance; }
    public void setConsultationAllowance(double c) { this.consultationAllowance = c; }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + consultationAllowance;
    }

    @Override
    public void displayDetails() {
        System.out.println("---- Doctor ----");
        super.displayDetails();
    }
}

class Nurse extends Employee {
    private double nightShiftAllowance;

    public Nurse(int id, String name, double basicSalary) {
        this(id, name, basicSalary, 0.0);
    }

    public Nurse(int id, String name, double basicSalary, double nightShiftAllowance) {
        super(id, name, basicSalary);
        this.nightShiftAllowance = nightShiftAllowance;
    }

    public double getNightShiftAllowance() { return nightShiftAllowance; }
    public void setNightShiftAllowance(double n) { this.nightShiftAllowance = n; }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + nightShiftAllowance;
    }

    @Override
    public void displayDetails() {
        System.out.println("---- Nurse ----");
        super.displayDetails();
    }
}

class LabTechnician extends Employee {
    private double labAllowance;

    public LabTechnician(int id, String name, double basicSalary) {
        this(id, name, basicSalary, 0.0);
    }

    public LabTechnician(int id, String name, double basicSalary, double labAllowance) {
        super(id, name, basicSalary);
        this.labAllowance = labAllowance;
    }

    public double getLabAllowance() { return labAllowance; }
    public void setLabAllowance(double l) { this.labAllowance = l; }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + labAllowance;
    }

    @Override
    public void displayDetails() {
        System.out.println("---- Lab Technician ----");
        super.displayDetails();
    }
}

public class HospitalEmployeeSystem {

    static Employee findHighestPaid(Employee[] employees) {
        Employee highest = employees[0];
        for (Employee e : employees) {
            if (e.calculateSalary() > highest.calculateSalary()) {
                highest = e;
            }
        }
        return highest;
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Doctor(1, "Dr. Arjun", 50000, 15000),
            new Nurse(2, "Nurse Priya", 25000, 5000),
            new LabTechnician(3, "Tech Karthik", 22000, 3000)
        };

        System.out.println("== All Employees (Runtime Polymorphism) ==");
        for (Employee e : employees) {
            e.displayDetails();
            System.out.println();
        }

        Employee topEarner = findHighestPaid(employees);
        System.out.println("Highest Paid Employee: " + topEarner.getName()
                + " (₹" + topEarner.calculateSalary() + ")");
    }
}