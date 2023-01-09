package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TeamLeader teamLeader = new TeamLeader();
        String name;
        String employeeNumber;
        String hireDate;
        int shift;
        double hourlyPayRate;
        int monthlyBonusAmount;
        int requiredTrainingHours;
        int attendedTrainingHours;

        System.out.println("Enter your name: ");
        name = s.nextLine();
        teamLeader.setName(name);

        System.out.println("Enter your employee number: ");
        employeeNumber = s.nextLine();
        teamLeader.setEmployeeNumber(employeeNumber);

        System.out.println("Enter your hire date: ");
        hireDate = s.nextLine();
        teamLeader.setHireDate(hireDate);

        System.out.println("Enter your hourly pay rate: ");
        hourlyPayRate = s.nextDouble();
        teamLeader.setHourlyPayRate(hourlyPayRate);

        System.out.println("Enter your shift: ");
        shift = s.nextInt();
        teamLeader.setShift(shift);

        System.out.println("Enter your hourly pay rate");
        hourlyPayRate = s.nextInt();
        teamLeader.setHourlyPayRate(hourlyPayRate);

        System.out.println("Enter your monthly bonus amount");
        monthlyBonusAmount = s.nextInt();
        teamLeader.setMonthlyBonusAmount(monthlyBonusAmount);

        System.out.println("Enter your required training hours");
        requiredTrainingHours = s.nextInt();
        teamLeader.setRequiredTrainingHours(requiredTrainingHours);

        System.out.println("Enter your attended training hours");
        attendedTrainingHours = s.nextInt();
        teamLeader.setAttendedTrainingHours(attendedTrainingHours);

        System.out.println(teamLeader.toString());
    }
}
