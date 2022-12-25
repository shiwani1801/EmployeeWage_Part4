package com.bridgelabz.employeewage4;

public class CompanyEmployeeWage {

    //constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    //instance variables
    public int empWagePerHour;
    public int maxWokringDays;
    public int maxWorkingHrs;
    public String companyName;
    public int totalEmpWage;

    //constructor
    public CompanyEmployeeWage(String companyName, int empWagePerHour, int maxWorkingDays, int maxWorkingHrs) {
        this.companyName = companyName;
        this.empWagePerHour = empWagePerHour;
        this.maxWokringDays = maxWorkingDays;
        this.maxWorkingHrs = maxWorkingHrs;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }


    @Override
    public String toString() {
        return "CompanyEmployeeWage [empWagePerHour=" + empWagePerHour + ", maxWokringDays=" + maxWokringDays
                + ", maxWorkingHrs=" + maxWorkingHrs + ", companyName=" + companyName + ", totalEmpWage="
                + totalEmpWage + "]";
    }
}