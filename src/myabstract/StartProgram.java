/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author chrisgeiser
 */
public class StartProgram {
    
    public static void main(String[] args) {
        
        SalariedEmployee p1 = new SalariedEmployee("Laura", 61000);
        System.out.println(p1.name + "   $" + p1.getGrossPay());
        
        HourlyEmployee p2 = new HourlyEmployee("Carrie", 105, 84);
        System.out.println(p2.name + "   $" + p2.getGrossPay());
        
        SalaryPlusBonusEmployee p3 = new SalaryPlusBonusEmployee("Ellie",
                900000, 80000);
        System.out.println(p3.name + "   $" + p3.getGrossPay());
    }
}
