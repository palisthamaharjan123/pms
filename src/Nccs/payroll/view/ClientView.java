/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nccs.payroll.view;

import Nccs.payroll.model.Employee;
import Nccs.payroll.model.Payroll;
import Nccs.payroll.repository.EmployeeRepository;
import Nccs.payroll.repository.PayrollRepository;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Palistha
 */
public class ClientView {
   // EmployeeController employeeController = new EmployeeController();
   // DepartmentController departmentController = new DepartmentController();

    public void employee() throws Exception {
        EmployeeRepository employeeRepository = new EmployeeRepository();

        List<Employee> employee = employeeRepository.getEmployee();

        System.out.println("Employee ID : Employee Name");
      //  Iterable<Employee> employee1 = null;
        for (Employee employe : employee) {
            System.out.println(employe.getEmp_id() + "\t" + employe.getEmp_name());
        }
        

        
    }

 public void payroll(int emp_id, String salary_status) throws Exception {
        PayrollRepository payrollRepository = new PayrollRepository();
        List<Payroll> payroll = payrollRepository.getPayroll();
        System.out.println("Emp_id : salary_status") ;
        for (Payroll payrolls : payroll) {
            System.out.println(payrolls.toString());
        }
    }
}