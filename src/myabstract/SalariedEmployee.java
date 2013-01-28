/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author chrisgeiser
 */
public class SalariedEmployee extends Employee {
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
