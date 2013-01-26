
package myconrete;

public class SalaryPlusBonusEmployee extends SalariedEmployee {
    public double bonus, salary;
    
    public double getGrossPay() {
        return (salary/26)+bonus;
    }
}
