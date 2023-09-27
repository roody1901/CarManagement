package org.example;
import java.util.Scanner;
import  java.util.UUID;

public class Employee extends Showroom implements utility {
    String emp_id;
    String emp_name;
    String emp_department;
    int emp_age;

    @Override
    public void get_details() {
        System.out.println("Employee Name:-"+emp_name);
        System.out.println("Employee ID:-"+emp_id);
        System.out.println("Employee Age:-"+emp_age);
        System.out.println("Employee Department:-"+emp_department);
        System.out.println("Showroom Name:-"+ showroom_Name);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        UUID uid = UUID.randomUUID();
        emp_id = String.valueOf(uid);
        System.out.println("Employee Details");
        System.out.println();

        System.out.println("Employee Name");
        emp_name = sc.nextLine();
        System.out.println("Employee Age");
        emp_age = sc.nextInt();
        System.out.println("Employee Department");
        emp_department = sc.nextLine();
        System.out.println("Showroom Name");
        showroom_Name = sc.next();


    }
}

