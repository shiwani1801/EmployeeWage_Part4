package com.bridgelabz.employeewage4;

import java.util.ArrayList;

public class EmpWageBuilder{
    Employee employee=new Employee();
    ArrayList wiproList=new ArrayList<>();
    ArrayList tcsList=new ArrayList<>();
    ArrayList goggleList=new ArrayList<>();

    public void detailsOfWipro() {
        employee.setName("shiwani");
        employee.setCompanyName("Wipro");
        employee.setWage("4000");
        employee.setWorkingHours(20);
        employee.setTotalWorkingDays(30);
        employee.setDailyWage("130");
        employee.setEmpId("1");
        employee.setEmpHour(8);
        wiproList.add(employee.getName());
        wiproList.add(employee.getCompanyName());
        wiproList.add(employee.getWage());
        wiproList.add(employee.getWorkingHours());
        wiproList.add(employee.getTotalWorkingDays());
        wiproList.add(employee.getDailyWage());
        wiproList.add(employee.getEmpId());
        wiproList.add(employee.getEmpHour());
        System.out.println("Details of Wipro as list : "+wiproList);
        System.out.println("Details of Wipro : "+employee.toString());
        getTotalWageByWipro();
    }

    public void detailsOfTCS() {
        employee.setName("Prati");
        employee.setCompanyName("TCS");
        employee.setWage("8000");
        employee.setWorkingHours(30);
        employee.setTotalWorkingDays(20);
        employee.setDailyWage("250");
        employee.setEmpId("2");
        employee.setEmpHour(4);
        tcsList.add(employee.getName());
        tcsList.add(employee.getCompanyName());
        tcsList.add(employee.getWage());
        tcsList.add(employee.getWorkingHours());
        tcsList.add(employee.getTotalWorkingDays());
        tcsList.add(employee.getDailyWage());
        tcsList.add(employee.getEmpId());
        tcsList.add(employee.getEmpHour());
        System.out.println("Details of TCS as list : "+tcsList);
        System.out.println("Details of Tcs : "+employee.toString());
        getTotalWageByTCS();
    }


    public void detailsOfGoggle() {
        employee.setName("Abhi");
        employee.setCompanyName("Goggle");
        employee.setWage("5000");
        employee.setWorkingHours(20);
        employee.setTotalWorkingDays(25);
        employee.setDailyWage("200");
        employee.setEmpId("3");
        employee.setEmpHour(8);
        goggleList.add(employee.getName());
        goggleList.add(employee.getCompanyName());
        goggleList.add(employee.getWage());
        goggleList.add(employee.getWorkingHours());
        goggleList.add(employee.getTotalWorkingDays());
        goggleList.add(employee.getDailyWage());
        goggleList.add(employee.getEmpId());
        goggleList.add(employee.getEmpHour());
        System.out.println("Details of Goggle as list : "+goggleList);
        System.out.println("Details of Goggle: "+employee.toString());
        getTotalWageByGoggle();

    }


    public void getTotalWageByWipro() {

        System.out.println("total wage in Wipro : "+ employee.getWage());
    }


    public void getTotalWageByTCS() {
        System.out.println("total wage in TCS : "+ employee.getWage());
    }


    public void getTotalWageByGoggle() {
        System.out.println("total wage in Goggle: "+ employee.getWage());}


}



