//StudentDAO.java

import java.sql.*;
import java.util.ArrayList;

public class StudentDAO {

    // Adding a new student to the database
    public void addStudent(Student student) {
        try (
            // Establish database connection and prepare SQL insert statement
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO students VALUES (?, ?, ?, ?, ?)")
        )
