package org.example._04;

public class Salary {
    public double calculateMonthlySalary(Employee employee) {
        double yearlySalary = employee.getYearlySalary();
        double awards = employee.getAwards();
        return calculateMonthlySalary(yearlySalary, awards);
    }

    private double calculateMonthlySalary(double yearlySalary, double awards) {
        return (yearlySalary + awards) / 12;
    }
}
