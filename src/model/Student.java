/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author bravee06
 */
public class Student {
    
    // declear attributes of student
    private String id,name,courseName;
    private int semester;
    
    // constructor not parameter
    
    public Student() {
    }    

    // constructor have parameter
    public Student(String id, String name, String courseName, int semester) {
        this.id = id;
        this.name = name;
        this.courseName = courseName;
        this.semester = semester;
    }

    // getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void printData(){
        System.out.printf("%-20s%-10d%-15s",this.getName(),this.getSemester(),this.getCourseName());
    }
    
    
    //Name .   Semester    Course Name 
    
    
    
}
