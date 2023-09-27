package org.example;

import java.util.Scanner;

public class Showroom implements utility {
    String showroom_Name;
    String showroom_Address;
    int total_employee;
    int total_cars = 0;
    String manager_name;

    @Override
    public void get_details() {
       System.out.println("Showroom Name:-"+showroom_Name);
        System.out.println("Showroom Address:-"+showroom_Address);
        System.out.println("Manager Name:-"+manager_name);
        System.out.println("Total Employees:-"+total_employee);
        System.out.println("Total Car in Stock:-"+total_cars);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("SHOWROOM DETAILS ARE BELOW");
        System.out.print("Showroom Name: ");
        showroom_Name = sc.nextLine();
        System.out.print("Showrroom Address: ");
        showroom_Address = sc.nextLine();
        System.out.print("MANAGER NAME");
        manager_name = sc.nextLine();
        System.out.print("TOTAL EMPLOYEES");
        total_employee = sc.nextInt();
        System.out.print("TOTAL CARS IN STOCK");
        total_cars = sc.nextInt();


    }

}
