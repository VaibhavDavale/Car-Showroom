
package com.showroom.thread;


import com.showroom.dao.CarDao;
import com.showroom.dao.OrderDAO;

public class BookingThread extends Thread {
    private int userId;
    private int carId;

    public BookingThread(int userId, int carId) {
        this.userId = userId;
        this.carId = carId;
    }

    public void run() {
        try {
            CarDao ca = new CarDao();
            if (ca.buyCar(carId)) {
                OrderDAO orderDAO = new OrderDAO();
                orderDAO.placeOrder(userId, carId);
                System.out.println("User " + userId + " successfully booked car " + carId);
            } else {
                System.out.println("Car " + carId + " is out of stock.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

