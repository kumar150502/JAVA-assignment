package javaassignmentdayday8;
import java.util.Random;
public class LP01 {
    private int attendance;

    public LP01() {
        // Simulating attendance using random number
        this.attendance = new Random().nextInt(2); // 0 - Absent, 1 - Present
    }

    public int getAttendance() {
        return attendance;
    }
}

class EmployeeWageComputation {
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 8;
    public static final int WORKING_DAYS_PER_MONTH = 20;
    public static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program!");

        // UC1: Check if employee is present or absent
        Employee employee = new Employee();
        int attendance = employee.getAttendance();

        if (attendance == 1) {
            System.out.println("Employee is Present");
            int dailyWage = calculateDailyWage(FULL_DAY_HOUR);
            System.out.println("Daily Wage: " + dailyWage);
        } else {
            System.out.println("Employee is Absent");
        }

        // UC2: Calculate daily employee wage
        int dailyWage = calculateDailyWage(FULL_DAY_HOUR);
        System.out.println("Daily Wage: " + dailyWage);

        // UC3: Add part-time employee and wage
        int partTimeWage = calculateDailyWage(PART_TIME_HOUR);
        System.out.println("Part-time Wage: " + partTimeWage);

        // UC4: Solving using switch case statement
        int employeeType = new Random().nextInt(2) + 1; // 1 - Full-time, 2 - Part-time
        int wage = 0;

        switch (employeeType) {
            case 1:
                wage = calculateDailyWage(FULL_DAY_HOUR);
                break;
            case 2:
                wage = calculateDailyWage(PART_TIME_HOUR);
                break;
            default:
                System.out.println("Invalid employee type");
        }

        System.out.println("Wage: " + wage);

        // UC5: Calculating wages for a month
        int monthlyWage = calculateMonthlyWage(WORKING_DAYS_PER_MONTH);
        System.out.println("Monthly Wage: " + monthlyWage);

        // UC6: Calculate wages till a condition of total working hours or days is reached for a month
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        int totalWage = 0;

        while (totalWorkingHours < MAX_WORKING_HOURS && totalWorkingDays < WORKING_DAYS_PER_MONTH) {
            attendance = employee.getAttendance();

            if (attendance == 1) {
                int dailyEmployeeHours = new Random().nextInt(8) + 1; // Assuming random hours between 1 and 8
                int dailyEmployeeWage = calculateDailyWage(dailyEmployeeHours);
                totalWorkingHours += dailyEmployeeHours;
                totalWorkingDays++;
                totalWage += dailyEmployeeWage;
            }
        }

        System.out.println("Total Wage: " + totalWage);
    }

    public static int calculateDailyWage(int hours) {
        return hours * WAGE_PER_HOUR;
    }

    public static int calculateMonthlyWage(int workingDays) {
        return calculateDailyWage(FULL_DAY_HOUR) * workingDays;
    }
}
