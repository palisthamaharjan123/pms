/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nccs.payroll.controller;

import Nccs.payroll.repository.EmployeeRepository;

/**
 *
 * @author Palistha
 */
public class EmployeeController {
    public void view() throws Exception{
        EmployeeRepository employee=new EmployeeRepository();
        employee.view();
    }
    
}
