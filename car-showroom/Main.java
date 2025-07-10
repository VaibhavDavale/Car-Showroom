
package com.showroo;


import com.showroom.dao.CarDao;
import com.showroom.model.Car;
import com.showroom.thread.BookingThread;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        CarDao D= new CarDao();

        while (true) {
            System.out.println("\n1. View Cars\n2. Buy Car\n3. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                List<Car> cars = D.getAllCars();
                for (Car c : cars) {
                    System.out.println(c);
                }
            } else if (choice == 2) {
                System.out.print("Enter Car ID: ");
                int carId = sc.nextInt();
                System.out.print("Enter User ID: ");
                int userId = sc.nextInt();
                Thread t = new BookingThread(userId, carId);
                t.start();
            } else {
                break;
            }
        }
    }
}

