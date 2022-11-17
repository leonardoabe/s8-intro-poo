package entities;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public String getName() {
        return name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double netSalary() {
        return getGrossSalary() - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += (getGrossSalary() * percentage / 100);
    }

}
