/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nccs.payroll.repository;

import Nccs.payroll.DBConnection;
import Nccs.payroll.model.Experince;
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
public class ExperinceRepository {
    public List<Experince>getExperience() throws SQLException, Exception{
        Connection connection =DBConnection.getConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("Select * from experince:");
        List<Experince> experience=new ArrayList<>();
        while(resultSet.next()){
            int emp_id=resultSet.getInt(1);
            int year=resultSet.getInt(4);
            Experince exp=new Experince(emp_id,year);
            boolean add = experience.add(exp);          
        }
        DBConnection.closeConnection();
        return experience;
    
    }

    

    public void view() throws SQLException {
        Connection connection=DBConnection.getConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from Experince");
        
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+"\t"+resultSet.getInt(2));
        }
        DBConnection.closeConnection();
    }
     public void ExperinceRepository() throws SQLException {
        int emp_id, year;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter employee id:");
        emp_id = sc.nextInt();
        System.out.println("enter experience year:");
        year = sc.nextInt();

        //System.out.print("palistha");
        String insertQuery = String.format("insert into experince(emp_id,year)values(%d,%d)", emp_id, year);
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
