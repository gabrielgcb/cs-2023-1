package org.example._04;

public class Employee {

    private double salary;

    private     double awards;
    public void employeeMethod(Employee employee) {
        // Some actions
        double yearlySalary = employee.getYearlySalary();
        double employeeAwards = employee.getAwards();
        double monthlySalary = getMonthlySalary(yearlySalary, awards);
        // Continue processing
    }


    public double getYearlySalary(){
        return salary*12;
    }

    public double getAwards(){
        return awards;
    }

    public double getMonthlySalary(double yearlySalary, double employeeAwards) {
        return (yearlySalary + employeeAwards)/12;
    }
}
