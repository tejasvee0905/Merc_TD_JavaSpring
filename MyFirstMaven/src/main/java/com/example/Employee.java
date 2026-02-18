package com.example;

public class Employee {
    private int id;
    private String name;
    private double baseSalary;
    private String designation;
    private int leavesTaken;

    private final int ALLOWED_LEAVES = 32;

    public Employee(int id, String name, double baseSalary, String designation, int leavesTaken) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.designation = designation;
        this.leavesTaken = leavesTaken;
    }

    public int getId() { return id; }
    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public String getDesignation() {
        return designation;
    }
    public int getLeavesTaken() {
        return leavesTaken;
    }

    // MAIN SALARY CALCULATION (uses this instance's fields)
    public double computeSalary() {
        double salary = applyIncrement(baseSalary, designation);
        salary = applyLeaveDeduction(salary, baseSalary, leavesTaken);
        return salary;
    }

    public double applyIncrement(double baseSalary, String designation) {
        if (designation == null) return baseSalary;
        String d = designation.trim().toLowerCase();
        if (d.equals("programmer")) return baseSalary * 1.10;
        if (d.equals("designer"))   return baseSalary * 1.20;
        return baseSalary;
    }

    public double applyLeaveDeduction(double currentSalary, double baseSalary, int leavesTaken) {
        int extra = leavesTaken - ALLOWED_LEAVES;
        if (extra <= 0) return currentSalary; // <-- fixed
        double perLeave = baseSalary / ALLOWED_LEAVES;
        return currentSalary - (extra * perLeave);
    }
}