package com.bridgelabz.employeewage4;

public class Salary {
    static Employee employee=new Employee();

    public static void main(String[] args) {
        int totalMonthlyHours = 0;
        int totalWorking_days = 0;

        int totalWorkingDays;
        do {
            double check = Math.floor(Math.random() * 10) % 3;
            switch ((int) check) {
                case 1:
                    System.out.println("employee present");
                    System.out.println("full time worker ");
                    employee.setEmpHour(100);
                    break;
                case 0:
                    System.out.println("employee present");
                    System.out.println("part time worker");
                    employee.setEmpHour(80);  //obtained from uc 3 part time hour =8....8*10=80
                    break;                      //assumed monthly partime days =10
                default:
                    System.out.println("employee absent");
                    employee.setEmpHour(0);
            }
            totalMonthlyHours = totalMonthlyHours + employee.getEmpHour();

            int monthlyWage = totalMonthlyHours * 20;
            System.out.println("monthlyWage = " + monthlyWage);
            totalWorkingDays = employee.getTotalWorkingDays();
        }
        while ((totalMonthlyHours < 100) && (totalWorkingDays <= 20));
        multipleCompaniesEmpWage();
    }

    public static void multipleCompaniesEmpWage() {
        EmpWageBuilder companyEmpWageBuilder = new EmpWageBuilder();
        companyEmpWageBuilder.detailsOfWipro();
        companyEmpWageBuilder.detailsOfTCS();
        companyEmpWageBuilder.detailsOfGoggle();
    }
}




