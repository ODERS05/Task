package com.company;

public class TeamLeader extends ProductionWorker{
    private int monthlyBonusAmount;
    private int requiredTrainingHours;
    private int attendedTrainingHours;

    public TeamLeader(String name, String employeeNumber, String hireDate, int shift, double hourlyPayRate, int monthlyBonusAmount, int trainingHours, int attentedTrainingHours) {
        super(name, employeeNumber, hireDate, shift, hourlyPayRate);
        this.monthlyBonusAmount = monthlyBonusAmount;
        this.requiredTrainingHours = trainingHours;
        this.attendedTrainingHours = attentedTrainingHours;
    }

    public TeamLeader(int shift, double hourlyPayRate, int monthlyBonusAmount, int trainingHours, int attentedTrainingHours) {
        super(shift, hourlyPayRate);
        this.monthlyBonusAmount = monthlyBonusAmount;
        this.requiredTrainingHours = trainingHours;
        this.attendedTrainingHours = attentedTrainingHours;
    }

    public TeamLeader(int monthlyBonusAmount, int trainingHours, int attentedTrainingHours) {
        this.monthlyBonusAmount = monthlyBonusAmount;
        this.requiredTrainingHours = trainingHours;
        this.attendedTrainingHours = attentedTrainingHours;
    }
    public TeamLeader(){
        super();
        this.attendedTrainingHours = 0;
        this.requiredTrainingHours = 0;
        this.monthlyBonusAmount = 0;
    }

    public int getMonthlyBonusAmount() {
        return monthlyBonusAmount;
    }

    public void setMonthlyBonusAmount(int monthlyBonusAmount) {
        this.monthlyBonusAmount = monthlyBonusAmount;
    }

    public int getRequiredTrainingHours() {
        return requiredTrainingHours;
    }

    public void setRequiredTrainingHours(int requiredTrainingHours) {
        this.requiredTrainingHours = requiredTrainingHours;
    }

    public int getAttendedTrainingHours() {
        return attendedTrainingHours;
    }

    public void setAttendedTrainingHours(int attendedTrainingHours) {
        this.attendedTrainingHours = attendedTrainingHours;
    }

    @Override
    public String toString() {String str = "Name: " + name + "\nEmployee Number: ";

        if (employeeNumber.equals(""))
        {
            str += "INVALID EMPLOYEE NUMBER";
        }
        else
        {
            str += employeeNumber;
        }
        str += ", hireDate='" + hireDate + '\'' +
                ", shift=" + shift +
                ", hourlyPayRate=" + hourlyPayRate +
                ", monthlyBonusAmount=" + monthlyBonusAmount +
                ", requiredTrainingHours=" + requiredTrainingHours +
                ", attendedTrainingHours=" + attendedTrainingHours +
                '}';
        return str;
    }
}
