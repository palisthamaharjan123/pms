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
public class Department {
  private int dep_id;
  private int emp_id;
  String dep_name;

    public Department(int dep_id, int emp_id, String dep_name) {
        this.dep_id = dep_id;
        this.emp_id = emp_id;
        this.dep_name = dep_name;
    }

    public int getDep_id() {
        return dep_id;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }
  
}
