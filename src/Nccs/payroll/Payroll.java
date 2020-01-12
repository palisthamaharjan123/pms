/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nccs.payroll;

import Nccs.payroll.view.Display;
import java.sql.*;
import java.util.Scanner;


/**
 *
 * @author Palistha
 */
public class Payroll { 
    
    /**
     * @param args
     * @param 
     * @throws Exception
     */
   public static void main(String[] args)throws Exception {
        // TODO code application logic here
       /* clientView =new ClientView();
       clientView.employee();
       
    }   */    
        
       int emp_id;
        String emp_name,address,phone_no;
        float price;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee id:");
        emp_id=sc.nextInt();
        System.out.println("enter name:");
        emp_name=sc.next();
        System.out.println("enter address:");
        address=sc.next();
        System.out.println("enter phone_no:");
        phone_no=sc.next();
        
        //System.out.print("palistha");
        
        String insertQuery=String.format("insert into employee(emp_id,emp_name,address,phone_no)values(%d,'%s','%s',%d)",emp_id,emp_name,address,phone_no);
        String url,userName,password;
        url="jdbc:mysql://localhost:3306/pms";
        userName="palistha";
        password="ROOT";
        
       try (Connection connection = DriverManager.getConnection(url,userName,password)) {
           Statement statement=connection.createStatement();
           int Rowcount=statement.executeUpdate(insertQuery);
           System.out.println(Rowcount+"_row added succesfully");
           
           
           
       }
   }
}
        
                
    
    
   

