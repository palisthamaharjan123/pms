/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nccs.payroll.controller;

import Nccs.payroll.repository.DepartmentRepository;

/**
 *
 * @author Palistha
 */
public class DepartmentController {
    public void view() throws Exception{
        DepartmentRepository department=new DepartmentRepository();
        department.view();
    }

   
}
