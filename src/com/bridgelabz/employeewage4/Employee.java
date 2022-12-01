package com.bridgelabz.employeewage4;

public class Employee {

    private String empId;
    private String name;
    private String dailyWage;
    private String companyName;

    private String wage;
    private int workingHours;
    private  int totalWorkingDays=20;
    private  int empHour;

    public int getEmpHour() {
        return empHour;
    }

    public void setEmpHour(int empHour) {
        this.empHour = empHour;
    }

    public String getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(String dailyWage) {
        this.dailyWage = dailyWage;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public Employee() {

    }public int getTotalWorkingDays() {
        return totalWorkingDays;
    }


    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }



    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee( String name, String companyName,String empId, String wage, int workingHours, int totalWorkingDays) {
        this.empId=empId;
        this.name = name;
        this.companyName = companyName;
        this.wage = wage;
        this.workingHours = workingHours;
        this.totalWorkingDays = totalWorkingDays;
    }

    @Override
    public String toString() {
        return "Employee{" +

                ", empId=" + empId +
                ", name='" + name + '\'' +
                ", dailyWage=" + dailyWage +
                ", companyName='" + companyName + '\'' +
                ", wage='" + wage + '\'' +
                ", workingHours=" + workingHours +
                ", totalWorkingDays=" + totalWorkingDays +
                ", empFullTime =" + empHour+

                '}';
    }
}


