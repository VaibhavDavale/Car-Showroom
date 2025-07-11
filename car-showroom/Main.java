package com.showroo;

import com.showroom.dao.CarDao;
import com.showroom.model.Car;
import com.showroom.thread.BookingThread;

import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
CarDao D = new CarDao();

while (true) {  
        System.out.println("\n __Car Showroom__");  
        System.out.println("\n1. View Cars  :");  
        System.out.println("2. Buy Car   :");  
        System.out.println("3. Add Car  :");  
        System.out.println("4. Delete Car  :");  
        System.out.println("5. Update Car Details  :");  
        System.out.println("6. Search Car by Model  :");  
        System.out.println("7. Exit");  
        System.out.print("Enter Choice: ");  
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

        } else if (choice == 3) {  
            System.out.print("Enter Car Model: ");  
            String model = sc.next();  
            System.out.print("Enter Car Price: ");  
            double price = sc.nextDouble();  
            Car car = new Car();  
            car.setModel(model);  
            car.setPrice(price);  
            D.addCar(car);  
            System.out.println("Car Added Successfully.");  

        } else if (choice == 4) {  
            System.out.print("Enter Car ID to Delete: ");  
            int carId = sc.nextInt();  
            D.deleteCar(carId);  
            System.out.println("Car Deleted Successfully.");  

        } else if (choice == 5) {  
            System.out.print("Enter Car ID to Update: ");  
            int carId = sc.nextInt();  
            System.out.print("Enter New Model: ");  
            String model = sc.next();  
            System.out.print("Enter New Price: ");  
            double price = sc.nextDouble();  
            Car car = new Car();  
            car.setId(carId);  
            car.setModel(model);  
            car.setPrice(price);  
            D.updateCar(car);  
            System.out.println("Car Updated Successfully.");  

        } else if (choice == 6) {  
            System.out.print("Enter Model to Search: ");  
            String model = sc.next();  
            List<Car> cars = D.searchCarByModel(model);  
            for (Car c : cars) {  
                System.out.println(c);  
            }  

        } else if (choice == 7) {  
            System.out.println("Exiting...");  
            break;  

        } else {  
            System.out.println("Invalid Choice. Try again.");  
        }  
    }  
}

}
