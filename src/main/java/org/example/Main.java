package org.example;


import java.util.Scanner;

interface utility{
    public void get_details();
    public void set_details();
}
public class Main {
    static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employee emp[] = new Employee[5];
        Cars car[] = new Cars[5];
        int showroom_count =0;
        int cars_count =0;
        int emp_count=0;
        int choice =10;
        while(choice !=0){

            main_menu();
            choice = sc.nextInt();

            while (choice!=0 && choice!=9){
                switch (choice){
                    case 1:
                        showroom[showroom_count] = new Showroom();
                        showroom[showroom_count].set_details();
                        showroom_count++;
                        System.out.println();
                        System.out.println("1. Add new showroom");
                        System.out.println("9. Go to Menu");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        emp[emp_count] = new Employee();
                        emp[emp_count].set_details();
                        emp_count++;
                        System.out.println();
                        System.out.println("2. Add new employee");
                        System.out.println("9. Go to Menu");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        car[cars_count] = new Cars();
                        car[cars_count].set_details();
                        cars_count++;
                        System.out.println();
                        System.out.println("3. Add new car");
                        System.out.println("9. Go to Menu");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for(int i =0;i<showroom_count;i++){
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9. Go to Menu");
                        System.out.println("0. Exit");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for(int i =0;i<emp_count;i++){
                            emp[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9. Go to Menu");
                        System.out.println("0. Exit");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for(int i =0;i<cars_count;i++){
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9. Go to Menu");
                        System.out.println("0. Exit");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("Enter valid choice");
                        break;
                }
            }
        }
    }
}