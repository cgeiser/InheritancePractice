
package myinterface;

public class SalaryPlusBonusEmployee extends SalariedEmployee
                                    implements Employee {
    
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
