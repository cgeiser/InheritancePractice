
package myinterface;

public class HourlyEmployee implements Employee {
    String name;
    double rate, hours;
    
    public HourlyEmployee(String n, double r, double h) {
        name = n;
        rate = r;
        hours = h;
    }
    public double getGrossPay() {
        return (rate*hours);
    }
}
