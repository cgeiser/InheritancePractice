/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author chrisgeiser
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee {
    String name;
    double salary, bonus;
    
    public SalaryPlusBonusEmployee(String n, double s, double b) {
        super(n, s);
        bonus = b;
        name = super.name;
    }
    public double getGrossPay() {
        return (super.getGrossPay()+bonus);
    }
}
