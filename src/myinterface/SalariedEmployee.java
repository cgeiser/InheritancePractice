
package myinterface;

public class SalariedEmployee implements Employee {
    String name;
    double salary;
    
    public SalariedEmployee(String n, double s) {
        name = n;
        salary = s;
    }
    public double getGrossPay() {
        return (salary/26);
    }
}
