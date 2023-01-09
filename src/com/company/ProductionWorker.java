package com.company;

import java.text.DecimalFormat;

public class ProductionWorker extends Employee{
    public static final int DAY_SHIFT = 1;
    public static final int NIGHT_SHIFT = 2;
    protected int shift;
    protected double hourlyPayRate;

    public ProductionWorker(String name, String employeeNumber, String hireDate, int shift, double hourlyPayRate) {
        super(name, employeeNumber, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public ProductionWorker(int shift, double hourlyPayRate) {
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }
    public ProductionWorker()
    {
        super();
        shift = DAY_SHIFT;
        hourlyPayRate = 0.0;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
    @Override
    public String toString()
    {
        String str = super.toString();

        str += "\nShift: ";
        if (shift == DAY_SHIFT)
            str += "Day";
        else if (shift == NIGHT_SHIFT)
            str += "Night";
        else
            str += "INVALID SHIFT NUMBER";

        str += ("\nHourly Pay Rate: $" + (hourlyPayRate));

        return str;
    }
}
