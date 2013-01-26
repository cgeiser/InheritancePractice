package myinterface;

/**
 *
 * @author chrisgeiser
 */
public class StartProgram {
    
    public static void main(String[] args) {
        
        SalariedEmployee p1 = new SalariedEmployee("Sam", 32000);
        System.out.println(p1.name + "   $" + p1.getGrossPay());
        
        HourlyEmployee p2 = new HourlyEmployee("Jane", 45, 84);
        System.out.println(p2.name + "   $" + p2.getGrossPay());
        
        SalaryPlusBonusEmployee p3 = new SalaryPlusBonusEmployee("Hubert",
                200000, 4000);
        System.out.println(p3.name + "   $" + p3.getGrossPay());
    }
}
