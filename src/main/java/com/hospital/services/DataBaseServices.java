package com.hospital.services;

import com.hospital.database.DatabaseConnection;
import com.hospital.models.Bed;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseService {

    public List<Bed> getAllBeds() {
        List<Bed> beds = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM beds")) {

            while (rs.next()) {
                beds.add(new Bed(
                        rs.getInt("id"),
                        rs.getString("ward"),
                        rs.getBoolean("occupied")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return beds;
    }

    public int getAvailableBeds() {
        int count = 0;
        try (Connection conn = DatabaseConnection.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) as available FROM beds WHERE occupied = 0")) {

            if (rs.next()) {
                count = rs.getInt("available");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
}
