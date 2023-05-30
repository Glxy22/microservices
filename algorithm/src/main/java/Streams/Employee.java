package Streams;

public class Employee {
    private String name;
    private double salary;
    private int id;

    public Employee(int id,String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
