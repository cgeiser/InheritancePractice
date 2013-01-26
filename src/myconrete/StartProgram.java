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
            
            System.out.println(e1.empName);
            System.out.println(e1.empId);
            System.out.println(e1.empJob);
            System.out.println(e1.getGrossPay());
            
            SalariedEmployee e2 = new SalariedEmployee();
            
            e2.empName = "Michael";
            e2.empId = "1203";
            e2.empJob = "CEO";
            e2.salary = 1000000;
            
            System.out.println("\n" + e2.empName);
            System.out.println(e2.getEmpName());
            System.out.println(e2.empId);
            System.out.println(e2.empJob);
            System.out.println(e2.getGrossPay());
            
            SalaryPlusBonusEmployee e3 = new SalaryPlusBonusEmployee();
            
            e3.empName = "Willard";
            e3.empId = "0544";
            e3.empJob = "Chairman of the Board";
            e3.salary = 1000000;
            e3.bonus = 500000;
            
            System.out.println("\n" + e3.empName);
            System.out.println(e3.getEmpName());
            System.out.println(e3.empId);
            System.out.println(e3.empJob);
            System.out.println(e3.bonus);
            System.out.println(e3.getGrossPay());


    }

}
