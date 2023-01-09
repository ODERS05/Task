package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee employee = new Employee();
        ProductionWorker productionWorker = new ProductionWorker();
        TeamLeader teamLeader = new TeamLeader();
        int point;
        do {
            System.out.println("1.Create employee");
            System.out.println("2.Create ProductionWorker");
            System.out.println("3.Create TeamLeader");
            System.out.println("0.Finish program");
            point = s.nextInt();
            switch (point) {
                case 1 -> {
                    System.out.print("Enter your name: ");
                    String name = s.next();
                    employee.setName(name);

                    System.out.print("Enter your employee number: ");
                    String employeeNumber = s.next();
                    employee.setEmployeeNumber(employeeNumber);

                    System.out.print("Enter your hire date: ");
                    String hireDate = s.next();
                    employee.setHireDate(hireDate);

                    System.out.println(employee.toString());
                }

                case 2 -> {
                    System.out.println("Enter your name: ");
                    String name = s.next();
                    productionWorker.setName(name);

                    System.out.print("Enter your employee number: ");
                    String employeeNumber = s.next();
                    productionWorker.setEmployeeNumber(employeeNumber);

                    System.out.print("Enter your hire date: ");
                    String hireDate = s.next();
                    productionWorker.setHireDate(hireDate);

                    System.out.print("Enter your hourly pay rate: ");
                    double hourlyPayRate = s.nextDouble();
                    productionWorker.setHourlyPayRate(hourlyPayRate);

                    System.out.print("Enter your shift: ");
                    int shift = s.nextInt();
                    productionWorker.setShift(shift);

                    System.out.println(productionWorker.toString());
                }
                case 3 -> {
                    System.out.println("Enter your name: ");
                    String name = s.next();
                    teamLeader.setName(name);

                    System.out.print("Enter your employee number: ");
                    String employeeNumber = s.next();
                    teamLeader.setEmployeeNumber(employeeNumber);

                    System.out.print("Enter your hire date: ");
                    String hireDate = s.next();
                    teamLeader.setHireDate(hireDate);

                    System.out.print("Enter your hourly pay rate: ");
                    double hourlyPayRate = s.nextDouble();
                    teamLeader.setHourlyPayRate(hourlyPayRate);

                    System.out.print("Enter your shift: ");
                    int shift = s.nextInt();
                    teamLeader.setShift(shift);

                    System.out.print("Enter your monthly bonus amount");
                    int monthlyBonusAmount = s.nextInt();
                    teamLeader.setMonthlyBonusAmount(monthlyBonusAmount);

                    System.out.print("Enter your required training hours");
                    int requiredTrainingHours = s.nextInt();
                    teamLeader.setRequiredTrainingHours(requiredTrainingHours);

                    System.out.print("Enter your attended training hours");
                    int attendedTrainingHours = s.nextInt();
                    teamLeader.setAttendedTrainingHours(attendedTrainingHours);

                    System.out.println(teamLeader.toString());
                }
            }
        }while (point != 0);

    }
}
