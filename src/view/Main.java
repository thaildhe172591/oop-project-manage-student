/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Manager;
import controller.Validation;
import java.util.ArrayList;
import model.Student;

/**
 TRONG CLASS MAIN THÌ MÌNH KHÔNG ĐƯỢC CODE Ở TRONG 
 CHỈ ĐƯỢC GỌI HÀM, VÀ KHAI CÁC BIẾN 
 */
public class Main {
    
    public static void main(String[] args) {
        
        // DECLEAR VARIABLES 
        Validation inputValid = new Validation();
        Manager manager = new Manager();
        ArrayList<Student> listStudent = new ArrayList<>();
        
        // initial data 
        manager.initData(listStudent);
        
        
        // loop use to allow user select option till to user input option 5 
        while(true){
        // show menu to select choice option 
        manager.showMenu();
        
        // declear choice variable and require user input choice 
        int choice = inputValid.checkInt("Please choose 1 to Create, 2 to Find and Sort, 3 to Update/Delete, 4 to Report and 5 to Exit program.", 1, 5);
        
        
        switch (choice) {
            case 1:
                // create student
                manager.createStudent(listStudent);
                break;
            case 2:
                // find and sort
                manager.findAndSortStudent(listStudent);
                break;
            case 3:
                // update / delete student
                manager.updateOrDeleteStudentByID(listStudent);
                break;
            case 4:
                // report student
                manager.displayReport(listStudent);
                break;
            case 5:
                return;

            default:
                throw new AssertionError();
        }
        }
    }
}
