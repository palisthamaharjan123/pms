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
public class Payroll {
    private int emp_id;
    private String salary_status;
    private String transfer_date;
    
    public Payroll(int emp_id, String salary_status,String transfer_date) {
        this.emp_id = emp_id;
        this.salary_status = salary_status;
        this.transfer_date=transfer_date;
    }

    public Payroll(int emp_id, int salary_sheet,String transfer_date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getSalary_status() {
        return salary_status;
    }

    public void setSalary_status(String salary_status) {
        this.salary_status = salary_status;
    }
    public String getTransfer_date() {
        return transfer_date;
    }

    public void setTransfer_date(String transfer_date) {
        this.transfer_date = transfer_date;
    }
}
