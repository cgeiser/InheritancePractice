/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author chrisgeiser
 */
public class HourlyEmployee extends Employee {
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
