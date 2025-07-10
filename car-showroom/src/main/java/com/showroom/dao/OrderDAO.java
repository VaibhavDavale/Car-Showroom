
package com.showroom.dao;

import com.showroom.db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class OrderDAO {
    public void placeOrder(int userId, int carId) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO orders (user_id, car_id) VALUES (?, ?)"
        );
        ps.setInt(1, userId);
        ps.setInt(2, carId);
        ps.executeUpdate();
    }
}

