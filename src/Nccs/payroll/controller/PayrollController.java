/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nccs.payroll.controller;

import Nccs.payroll.repository.PayrollRepository;

/**
 *
 * @author Palistha
 */
public class PayrollController {
     public void view() throws Exception{
        PayrollRepository payroll=new PayrollRepository();
        payroll.view();
    }
}
