package myconrete;

public class SalariedEmployee extends Employee {
    public double salary;
    
    public double getGrossPay() {
        return salary/26;
    }
}
