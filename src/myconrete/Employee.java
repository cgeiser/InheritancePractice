package myconrete;

public abstract class Employee {
    
        String empName, empId, empJob;
        double grossPay;
    
    public String getEmpName() {
        return empName;
    }
    
    public String getEmpId() {
        return empId;
    }
    
    public String getEmpJob() {
        return empJob;
    }
    
    public abstract double getGrossPay();
    
}
