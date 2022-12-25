package com.bridgelabz.employeewage4;
public class EmployeeWageBuilder {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public CompanyEmployeeWage [] companyEmployeeWageArray;
    private int numOfCompanies =0;
    public EmployeeWageBuilder() {
        this.companyEmployeeWageArray = new CompanyEmployeeWage[5];
    }

    public void addCompanyEmployeeWage(String companyName, int empWagePerHour,int maxWorkingDays,int maxWorkingHrs)
    {
        companyEmployeeWageArray[numOfCompanies] = new CompanyEmployeeWage(companyName, empWagePerHour, maxWorkingDays, maxWorkingHrs);
        numOfCompanies++;
    }

    public void computeEmployeeWage()
    {
        for(int index = 0;index<companyEmployeeWageArray.length;index++)
        {
            CompanyEmployeeWage companyEmployeeWage =companyEmployeeWageArray[index];
            if(companyEmployeeWage != null)
            {
                int monthlyEmployeeWage = this.calculateEmployeeWage(companyEmployeeWage);
                companyEmployeeWage.setTotalEmpWage(monthlyEmployeeWage);
                System.out.println("Company employee wage is : " + companyEmployeeWage);
            }
        }
    }

    public int calculateEmployeeWage(CompanyEmployeeWage companyEmployeeWage)
    {
        //variables
        int monthlyEmpWage=0;
        int totalWorkingDays=0;
        int totalEmpHrs=0;

        while (totalWorkingDays<companyEmployeeWage.maxWokringDays && totalEmpHrs<companyEmployeeWage.maxWorkingHrs)
        {
            int empHrs=0;
            int dailyEmpWage=0;
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int)empCheck) {
                case IS_FULL_TIME:
                    empHrs=8;
                    break;
                case IS_PART_TIME:
                    empHrs=4;
                default:
                    empHrs=0;
            }
            dailyEmpWage = companyEmployeeWage.empWagePerHour *empHrs;
            totalEmpHrs  += empHrs;
            monthlyEmpWage += dailyEmpWage;
        }
        return monthlyEmpWage;
    }
    public static void main(String args[]) {

        EmployeeWageBuilder wageBuilder = new EmployeeWageBuilder();
        wageBuilder.addCompanyEmployeeWage("Tata",20,20,100);
        wageBuilder.addCompanyEmployeeWage("Wipro",15,25,200);
        wageBuilder.addCompanyEmployeeWage("TCS",20,30,100);
        wageBuilder.computeEmployeeWage();

    }
}
