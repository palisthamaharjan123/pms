/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nccs.payroll.repository;

import Nccs.payroll.DBConnection;
import Nccs.payroll.model.Department;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Palistha
 */
public class DepartmentRepository {

    public List<Department> getDepartment() throws SQLException, Exception {
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from department:");
        List<Department> department = new ArrayList<>();
        while (resultSet.next()) {
            int dep_id = resultSet.getInt(1);
            int emp_id = resultSet.getInt(1);
            String dep_name = resultSet.getString(2);
            Department depart = new Department(emp_id, dep_id, dep_name);
            boolean add = department.add(depart);
        }
        DBConnection.closeConnection();
        return department;

    }

    public void view() throws SQLException {
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from department");

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + "\t" + resultSet.getInt(2) + "\t" + resultSet.getString(3));
        }
        DBConnection.closeConnection();
    }

    public void DepartmentRepository() throws SQLException {
        int emp_id, dep_id = 0;
        String dep_name;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter department id:");
        emp_id = sc.nextInt();
        System.out.println("enter employee id:");
        emp_id = sc.nextInt();
        System.out.println("enter department name:");
        dep_name = sc.next();

        //System.out.print("palistha");
        String insertQuery = String.format("insert into department(dep_id,emp_id,dep_name)values(%d,%d,'%s')", dep_id, emp_id, dep_name);
        String url, userName, password;
        url = "jdbc:mysql://localhost:3306/pms";
        userName = "palistha";
        password = "ROOT";

        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            Statement statement = connection.createStatement();
            int Rowcount = statement.executeUpdate(insertQuery);
            System.out.println(Rowcount + "_row added succesfully");

        }
    }

}
