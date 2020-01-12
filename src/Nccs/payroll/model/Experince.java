/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nccs.payroll.model;

/**
 *
 * @author Palistha
 */
public class Experince {
    private int emp_id;
    private int year;
   
    

    
public Experince(int emp_id,int year){
    this.emp_id=emp_id;
    this.year=year;
}
public int getEmp_id(){
    return emp_id;
}
public void setEmp_id(int emp_id){
    this.emp_id=emp_id;
}
public int getYear(){
    return year;
    
}
public void setYear(int year){
    this.year=year;
}
    
}
