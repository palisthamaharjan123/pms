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
    private String tax;
    private int tax_amt;
    private int bonus;
    private String fin_salary;

    public SalarySheet(int emp_id, int salary, String tax,int tax_amt, int bonus,String fin_salary) {
        this.emp_id = emp_id;
        this.salary = salary;
        this.tax_amt = tax_amt;
        this.bonus = bonus;
    }

    public SalarySheet(int emp_id, String salary,String tax, String tax_amt, String bonus,String fin_salary) {
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
    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
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
    public String getFin_salary() {
        return fin_salary;
    }

    public void setFin_salary(String Fin_salary) {
        this.fin_salary = fin_salary;
    }
    
    
}
