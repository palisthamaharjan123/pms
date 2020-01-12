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
public class SalarySheet {
    private int emp_id;
    private int salary;
    private int tax_amt;
    private int bonus;

    public SalarySheet(int emp_id, int salary, int tax_amt, int bonus) {
        this.emp_id = emp_id;
        this.salary = salary;
        this.tax_amt = tax_amt;
        this.bonus = bonus;
    }

    public SalarySheet(int emp_id, String salary, String tax_amt, String bonus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getTax_amt() {
        return tax_amt;
    }

    public void setTax_amt(int tax_amt) {
        this.tax_amt = tax_amt;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
}
