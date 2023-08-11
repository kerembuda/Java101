package Salary_Calculator;

public class Employee {
    String name;
    int salary;
    int workHours;
    int workedHours;
    int hireYear;
    double taxRate = 0.03;
    int taxThreshold = 10000;
    int tax;
    int bonusPerHour;
    int bonus;
    int salaryIncrease;
    int currYear = 2023;
    int currSalary;

    Employee(String name, int salary, int workHours, int workedHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.workedHours = workedHours;
        this.hireYear = hireYear;
        tax();
        this.bonusPerHour = (int) (1.5 * this.salary / (this.workHours * 4));
        bonusAmount();
        raiseSalary();
        this.currSalary = this.salary + this.salaryIncrease - this.tax + this.bonus;
    }

    public void tax() {
        if (this.salary <= taxThreshold) {
            this.tax = 0;
        } else {
            this.tax = (int) (salary * taxRate);
        }
    }

    public void bonusAmount() {
        this.bonus = (this.workedHours - this.workHours) * this.bonusPerHour;
    }

    public void raiseSalary() {
        int workedYears = this.currYear - this.hireYear;
        if (workedYears <= 9){
            this.salaryIncrease = (int) (this.salary * 0.05);
        }
        else if (workedYears > 10 && workedYears < 20) {
            this.salaryIncrease = (int) (this.salary * 0.10);
        }
        else {
            this.salaryIncrease = (int) (this.salary * 0.15);
        }
    }

    public void printInfo() {
        System.out.println("Employee name: " + this.name +
                "\nEmployee Hire year: " + this.hireYear +
                "\nCurrent salary: " + this.currSalary);
    }
}
