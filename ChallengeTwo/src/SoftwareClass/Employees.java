/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareClass;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raad_
 */
public class Employees extends Members{
    private double salary;
    private List<Employees> listEmployeesSub;
    private Employees boss;
    private Workstation workstation;
    private Category category;

    public Employees() {
    }

    public Employees(double salary, Workstation workstation, String name, String lastName, String email, int id) {
        super(name, lastName, email, id);
        this.salary = salary;
        this.workstation = workstation;
        this.listEmployeesSub = new ArrayList<>();
    }
    
    public void assignEmployees(Employees employees){
        this.getListEmployeesSub().add(employees);
        employees.setBoss(this);
    }
    

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the workstation
     */
    public Workstation getWorkstation() {
        return workstation;
    }

    /**
     * @param workstation the workstation to set
     */
    public void setWorkstation(Workstation workstation) {
        this.workstation = workstation;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * @return the boss
     */
    public Employees getBoss() {
        return boss;
    }

    /**
     * @param boss the boss to set
     */
    public void setBoss(Employees boss) {
        this.boss = boss;
    }

    /**
     * @return the listEmployeesSub
     */
    public List<Employees> getListEmployeesSub() {
        return listEmployeesSub;
    }

    /**
     * @param listEmployeesSub the listEmployeesSub to set
     */
    public void setListEmployeesSub(List<Employees> listEmployeesSub) {
        this.listEmployeesSub = listEmployeesSub;
    }
    
    @Override
    public String getMemberType(){
        return "Employee";
    }

}
