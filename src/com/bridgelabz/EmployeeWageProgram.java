package com.bridgelabz;
import java.util.*;
public class EmployeeWageProgram {
    public static void main(String[] args) {
        Attendance attendance = new Attendance();
        attendance.MonthlyWageCheck();
    }
}
class Attendance{
    int IS_PRESENT = 1;
    int IS_ABSENT = 0;
    int WAGE_PER_HOUR = 20;
    int IS_FULL_TIME = 8;
    int IS_PART_TIME = 4;
    int DailyWage = 0;
    int MonthlyWage = 0;
    int NO_OF_WORKING_DAYS = 20;

    int EmployeePresent(int a) {
        Random r = new Random();
        int EmpCheck = r.nextInt(a);
        return EmpCheck;
    }
    void MonthlyWageCheck() {
        int EmpCheck = EmployeePresent(2);
        switch (EmpCheck) {
            case 1 :{
                System.out.println("Employee is present");
                DailyWage = WAGE_PER_HOUR * IS_FULL_TIME;
                MonthlyWage = NO_OF_WORKING_DAYS * DailyWage;
                break;
            }
            case 2 :{
                System.out.println("Employee is Absent");
                DailyWage = DailyWage;
                MonthlyWage = MonthlyWage;
                break;
            }
        }
        System.out.println("Daily Wage : " + DailyWage);
        System.out.println("Monthly Wage : " + MonthlyWage);
    }
}