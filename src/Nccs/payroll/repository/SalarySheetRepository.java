/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nccs.payroll.repository;

import Nccs.payroll.DBConnection;
import Nccs.payroll.model.SalarySheet;
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
public class SalarySheetRepository {
     public List<SalarySheet>getSalarySheet() throws SQLException, Exception{
        Connection connection =DBConnection.getConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("Select * from Salary_Sheet");
        List<SalarySheet> salarySheet=new ArrayList<>();
        while(resultSet.next()){
            int emp_id=resultSet.getInt(1);
            String salary=resultSet.getString(2);
            String tax_amt=resultSet.getString(3);
            String bonus=resultSet.getString(4);
            SalarySheet sheet=new SalarySheet(emp_id,salary,tax_amt,bonus);
            boolean add = salarySheet.add(sheet);          
        }
        DBConnection.closeConnection();
        return salarySheet;
    
    }

    public void view() throws SQLException {
        Connection connection=DBConnection.getConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from salary_sheet");
        
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+"\t"+resultSet.getInt(2)+"\t"+resultSet.getInt(3)+"\t"+resultSet.getInt(4));
        }
        DBConnection.closeConnection();
    }
     public void SalarySheetRepository() throws SQLException {
        int emp_id;
        String salary,tax_amt,bonus;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter employee id:");
        emp_id = sc.nextInt();
        System.out.println("enter salary:");
        salary= sc.next();
        System.out.println("enter tax_amt:");
        tax_amt= sc.next();
        System.out.println("enter bonus:");
        bonus= sc.next();
        

        //System.out.print("palistha");
        String insertQuery = String.format("insert into bonus(emp_id,salary,tax_amt,bonus)values(%d,'%s','%s','%s')", emp_id, salary,tax_amt,bonus);
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
