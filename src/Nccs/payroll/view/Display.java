/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nccs.payroll.view;

import Nccs.payroll.controller.DepartmentController;
import Nccs.payroll.controller.EmployeeController;
import Nccs.payroll.controller.ExperinceController;
import Nccs.payroll.controller.PayrollController;
import Nccs.payroll.controller.SalarySheetController;
import Nccs.payroll.repository.EmployeeRepository;
import java.sql.SQLException;
import java.util.Scanner;
import Nccs.payroll.repository.DepartmentRepository;
import Nccs.payroll.repository.ExperinceRepository;
import Nccs.payroll.repository.SalarySheetRepository;
import Nccs.payroll.repository.PayrollRepository;
/**
 *
 * @author Palistha
 */
public class Display {

    public void Employee() throws SQLException, Exception {
        EmployeeController employeeRepo = new EmployeeController();
        System.out.println("emp_id\temp_name\taddress\t\tphone_no\t\tsalary\t\theired\t\tbank");
        employeeRepo.view();
    }

    public void Department() throws SQLException, Exception {
        DepartmentController departmentRepo = new DepartmentController();
        System.out.println("dep_id\temp_id\tdep_name");
        departmentRepo.view();
    }

    public void Experince() throws SQLException, Exception {
        ExperinceController experinceRepo = new ExperinceController();
        System.out.println("emp_id\tyear");
        experinceRepo.view();
    }

    public void Payroll() throws SQLException, Exception {
        PayrollController payrollRepo = new PayrollController();
        System.out.println("emp_id\tsalary_status\tTransfer_date");
        payrollRepo.view();
    }

    public void SalarySheet() throws SQLException, Exception {
        SalarySheetController salarySheetRepo = new SalarySheetController();
        System.out.println("emp_id\tsalary\ttax\ttax_amt\tbonus\tfin_salary");
        salarySheetRepo.view();
    }

    public static void main(String[] args) throws SQLException, Exception {
        EmployeeRepository e = new EmployeeRepository();
        DepartmentRepository f=new DepartmentRepository();
        ExperinceRepository g=new ExperinceRepository();
        SalarySheetRepository h=new SalarySheetRepository();
        PayrollRepository i=new PayrollRepository();
        Display d = new Display();
        Scanner p = new Scanner(System.in);
        while (true) {
            System.out.print("***Payroll Management System***\n\n");
            System.out.print(" ---------\n");
            System.out.print("|Option:  |\n|1.Insert |\n|2.View   |\n|3.exit    |\n");
            System.out.print(" ---------\n");
            System.out.print("\nEnter number(1 or 2):");
            int ch = p.nextInt();
            switch (ch) {
                case 1:
                    while (true) {
                        System.out.print("\n\n**Insertion of Data's**\n");
                        System.out.print(" ---------------\n");
                        System.out.print("|Option:\t|\n|1.Employee\t|\n|2.Department\t|\n|3.Experience\t|\n|4.SalarySheet\t|\n|5Payroll\t|\n|6.exit\n");
                        System.out.print(" ---------------\n");
                        System.out.print("Enter a number(1-5):");
                        int c = p.nextInt();
                        switch (c) {
                            case 1:
                                e.EmployeeRepository();
                                break;
                            case 2:
                                f.DepartmentRepository();
                                break;
                            case 3:
                                g.ExperinceRepository();
                                break;
                            case 4:
                                h.SalarySheetRepository();
                                break;
                            case 5:
                                i.PayrollRepository();
                                break;
                            case 6:
                                System.exit(0);
                                break;
                            default:
                                System.out.print("Choose betn 1-5");
                                
                        }
                   
                    }
                
                case 2: {

                    while (true) {
                        System.out.print("\n\n**Viewing the datas's**\n");
                        System.out.print("  --------------\n");
                        System.out.print("|Option:\t|\n|1.Employee\t|\n|2.Department\t|\n|3.Experince\t|\n|4.Salary_Sheet\t|\n|5.Payroll\t|\n6.exit\n----------------");
                        System.out.print("\nEnter number(1-5):");
                        int choice = p.nextInt();
                        switch (choice) {
                            case 1:
                                d.Employee();
                                break;
                            case 2:
                                d.Department();
                                break;
                            case 3:
                                d.Experince();
                                break;
                            case 4:
                                d.SalarySheet();
                                break;
                            case 5:
                                d.Payroll();
                                break;
                            case 6:
                                System.exit(0);
                            default:
                                System.out.println("Consider choosing from 1-5");
                        }

                    }
                }
                case 3:
                    System.exit(0);
                    break;

            }
        }

    }
}