package com.bridgelabz;
import java.util.*;
public class EmployeeWageProgram {
    public static void main(String[] args) {
        Attendance attendance = new Attendance();
        attendance.EmployeeCheck();
    }
}
class Attendance{
    int IS_PRESENT = 1;

    int EmployeePresent(int a) {
        Random r = new Random();
        int EmpCheck = r.nextInt(a);
        return EmpCheck;
    }
    void EmployeeCheck() {
        System.out.println("Welcome to Employee wage computational program");
        int EmpCheck = EmployeePresent(2);
        if (EmpCheck == IS_PRESENT) {
            System.out.println("Employee is present");
        } else
            System.out.println("Employee is Absent");
    }
}

