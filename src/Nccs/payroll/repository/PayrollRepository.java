/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nccs.payroll.repository;

import Nccs.payroll.DBConnection;
import Nccs.payroll.model.Payroll;
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
public class PayrollRepository {
    public List<Payroll>getPayroll() throws SQLException, Exception{
        Connection connection =DBConnection.getConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("Select * from payroll");
        List<Payroll> payroll=new ArrayList<>();
        while(resultSet.next()){
            int emp_id=resultSet.getInt(1);
            String salary_sheet=resultSet.getString(2);
            String transfer_date=resultSet.getString(2);
            Payroll pay=new Payroll(emp_id,salary_sheet,transfer_date);
            boolean add = payroll.add(pay);          
        }
        DBConnection.closeConnection();
        return payroll;
    
    }

    

    public void view() throws SQLException {
        Connection connection=DBConnection.getConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from payroll");
        
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3));
        }
        DBConnection.closeConnection();
    }
    public void PayrollRepository() throws SQLException {
        int emp_id;
        String salary_status,transfer_date;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter employee id:");
        emp_id = sc.nextInt();
        System.out.println("enter salary_status:");
        salary_status = sc.next();
        System.out.println("enter transfer_date:");
        transfer_date = sc.next();

        //System.out.print("palistha");
        String insertQuery = String.format("insert into payroll(emp_id,salary_status,transfer_date)values(%d,'%s','%s')", emp_id, salary_status,transfer_date);
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
