package myconrete;

import javax.swing.JOptionPane;

public class StartProgram {
        public static void main(String[] args) {
            
            HourlyEmployee e1 = new HourlyEmployee();
            
            e1.empName = "Sandy";
            e1.empId = "1490";
            e1.empJob = "Janitor";
            e1.hourRate = 12.00;
            e1.hoursWorked = 80;
            
            System.out.println("Employee: " + e1.empName);
            System.out.println("ID: " + e1.empId);
            System.out.println("Position: " + e1.empJob);
            System.out.print("Gross Pay: $");
            System.out.printf("%,.2f", e1.getGrossPay());
            
            SalariedEmployee e2 = new SalariedEmployee();
            
            e2.empName = "Michael";
            e2.empId = "1203";
            e2.empJob = "CEO";
            e2.salary = 1000000;
            
            System.out.println("\n\nEmployee: " + e2.getEmpName());
            System.out.println("ID#: " + e2.empId);
            System.out.println("Position: " + e2.empJob);
            System.out.print("Gross Pay: $");
            System.out.printf("%,.2f", e2.getGrossPay());
            
            SalaryPlusBonusEmployee e3 = new SalaryPlusBonusEmployee();
            
            e3.empName = "Willard";
            e3.empId = "0544";
            e3.empJob = "Chairman of the Board";
            e3.salary = 1000000;
            e3.bonus = 500000;
            
            System.out.println("\n\nEmployee: " + e3.getEmpName());
            System.out.println("ID#: " + e3.empId);
            System.out.println("Position: " + e3.empJob);
            System.out.print("Bonus this pay period: $");
            System.out.printf("%,.2f", e3.bonus);
            System.out.print("\nGross Pay: $");
            System.out.printf("%,.2f", e3.getGrossPay());


    }

}
