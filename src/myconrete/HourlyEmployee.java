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
    private double hourRate, hoursWorked, grossPay;
    

    public double getGrossPay() {
        grossPay = hourRate * hoursWorked;        
        return grossPay;
    }
}
