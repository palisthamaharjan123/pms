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
public class Employee {

    private int emp_id;
    private String emp_name;
    private String address;
    private int phone_no;
    private String salary;
    private String heired;
    private String bank;

    public Employee(int emp_id, String emp_name, String address, int phone_no,String salary,String heired,String bank) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.address = address;
        this.phone_no = phone_no;
        this.salary = salary;
        this.heired = heired;
        this.bank = bank;
    }

    public Employee(int emp_id, String emp_name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary= salary;
    }
    public String getHeired() {
        return heired;
    }

    public void setHeired(String heired) {
        this.heired = heired;
    }
    public int getBank(){
        return phone_no;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

}
