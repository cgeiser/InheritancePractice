/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconrete;

/**
 *
 * @author chrisgeiser
 */
public class HourlyEmployee extends Employee {
    public double hourRate, hoursWorked;
    

    public double getGrossPay() {
        return hourRate * hoursWorked;
    }
}
