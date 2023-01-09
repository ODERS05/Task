package com.company;

public class Employee {
    protected String name;
    protected String employeeNumber;
    protected String hireDate;

    public Employee(String name, String employeeNumber, String hireDate) {
        this.name = name;
        if (isValidEmpNum(employeeNumber))
        {
            employeeNumber = employeeNumber;
        }
        else
        {
            employeeNumber = "";
        }
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }
    public Employee(){
        name = "";
        employeeNumber = "";
        hireDate = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        if (isValidEmpNum(employeeNumber))
        {
            employeeNumber = employeeNumber;
        }
        else
        {
            employeeNumber = "";
        }
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
    private boolean isValidEmpNum(String e)
    {
        boolean status = true;

        if (e.length() != 5)
            status = false;
        else
        {
            if ((!Character.isDigit(e.charAt(0)))  ||
                    (!Character.isDigit(e.charAt(1)))   ||
                    (!Character.isDigit(e.charAt(2)))   ||
                    (e.charAt(3) != '-')                ||
                    (!Character.isLetter(e.charAt(4)))  ||
                    (!(e.charAt(4)>= 'A' && e.charAt(4)<= 'M')))
            {
                status = false;
            }
        }
        return status;
    }
    @Override
    public String toString()
    {
        String str = "Name: " + name + "\nEmployee Number: ";

        if (employeeNumber == "")
        {
            str += "INVALID EMPLOYEE NUMBER";
        }
        else
        {
            str += employeeNumber;
        }

        str += ("\nHire Date: " + hireDate);
        return str;
    }
}

