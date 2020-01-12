/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nccs.payroll.controller;

import Nccs.payroll.repository.SalarySheetRepository;

/**
 *
 * @author Palistha
 */
public class SalarySheetController {
     public void view() throws Exception{
        SalarySheetRepository salarySheet=new SalarySheetRepository();
        salarySheet.view();
    }
}
