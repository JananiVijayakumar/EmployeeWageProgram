package com.bridgelabz;
import java.util.*;
public class EmployeeWageProgram {
    public static void main(String[] args) {
        Attendance attendance = new Attendance();
        attendance.DailyWageCheck();
    }
}
class Attendance{
    static final int IS_PRESENT = 1;
    static final int WAGE_PER_HOUR = 20;
    static final int IS_FULL_TIME = 8;
    int DailyWage = 0;

    int EmployeePresent(int a) {
        Random r = new Random();
        int EmpCheck = r.nextInt(a);
        return EmpCheck;
    }
    void DailyWageCheck() {
        int EmpCheck = EmployeePresent(2);
        if (EmpCheck == IS_PRESENT) {
            System.out.println("Employee is present");
            DailyWage = WAGE_PER_HOUR * IS_FULL_TIME;

        }
        else {
            System.out.println("Employee is Absent");
            DailyWage = DailyWage;
        }
        System.out.println("Daily Wage : " + DailyWage);
    }
}
