/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nccs.payroll.controller;

import Nccs.payroll.repository.ExperinceRepository;


/**
 *
 * @author Palistha
 */
public class ExperinceController {
    public void view() throws Exception{
        ExperinceRepository experince=new ExperinceRepository();
        experince.view();
    }
}
