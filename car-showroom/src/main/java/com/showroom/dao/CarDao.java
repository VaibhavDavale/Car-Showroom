// CarDAO.java
package com.showroom.dao;

import com.showroom.db.DBConnection;
import com.showroom.model.Car;

import java.sql.*;
import java.util.*;

public class CarDao{
    public List<Car> getAllCars() throws Exception {
        Connection con = DBConnection.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM cars");
        List<Car> cars = new ArrayList<>();
        while (rs.next()) {
            cars.add(new Car(
                rs.getInt("car_id"),
                rs.getString("model"),
                rs.getString("brand"),
                rs.getDouble("price"),
                rs.getInt("stock")
            ));
        }
        return cars;
    }

    public boolean buyCar(int carId) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(
            "UPDATE cars SET stock = stock - 1 WHERE car_id = ? AND stock > 0"
        );
        ps.setInt(1, carId);
        return ps.executeUpdate() > 0;
    }
}

