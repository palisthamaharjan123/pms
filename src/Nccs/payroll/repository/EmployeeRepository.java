/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nccs.payroll.repository;

import Nccs.payroll.DBConnection;
import Nccs.payroll.model.Employee;
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
public class EmployeeRepository {

    public List<Employee> getEmployee() throws SQLException, Exception {
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from employee");
        List<Employee> employee = new ArrayList<>();
        while (resultSet.next()) {
            int emp_id = resultSet.getInt(1);
            String emp_name = resultSet.getString(2);
            String address = resultSet.getString(3);
            long phone_no = resultSet.getLong(4);
            String salary = resultSet.getString(5);
            String Heired = resultSet.getString(6);
            String bank = resultSet.getString(7);
            Employee employe = new Employee(emp_id, emp_name, address, (int) phone_no,salary,Heired,bank);
            boolean add = employee.add(employe);
        }
        DBConnection.closeConnection();
        return employee;

    }

    public void view() throws SQLException {
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from employee");

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t\t" + resultSet.getString(3) + "\t" + "\t" + resultSet.getString(4)+"\t"+"\t"+resultSet.getString(5)+"\t"+"\t"+resultSet.getString(6)+"\t"+resultSet.getString(7));
        }
        DBConnection.closeConnection();
    }
  //  public static void main(String[] args)throws Exception {
    // TODO code application logic here
       /* clientView =new ClientView();
     clientView.employee();
       
     }   */

    public void EmployeeRepository() throws SQLException {
        int emp_id;
        String emp_name, address, phone_no, salary, heired, bank;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter employee id:");
        emp_id = sc.nextInt();
        System.out.println("enter name:");
        emp_name = sc.next();
        System.out.println("enter address:");
        address = sc.next();
        System.out.println("enter phone_no:");
        phone_no = sc.next();
        System.out.println("enter salary:");
        salary = sc.next();
        System.out.println("enter heired date:");
        heired = sc.next();
        System.out.println("enter bank_acc_no:");
        bank = sc.next();

        String insertQuery = String.format("insert into employee(emp_id,emp_name,address,phone_no,salary,heired,bank)values(%d,'%s','%s','%s','%s','%s','%s')", emp_id, emp_name, address, phone_no, salary, heired, bank);
        String url, userName, password;
        url = "jdbc:mysql://localhost:3306/pms";
        userName = "palistha";
        password = "ROOT";

        Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            int Rowcount = statement.executeUpdate(insertQuery);
            System.out.println(Rowcount + "_row added succesfully");

        }

    }


