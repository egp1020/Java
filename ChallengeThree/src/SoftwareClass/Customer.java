/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareClass;

import java.util.ArrayList;

/**
 *
 * @author estefania.garces
 */
public class Customer {
    private int id; 
    private String name;
    private String address;
    private String cellPhone; 
    private String email;    
    private ArrayList<Account> account; 
    private ArrayList<Inventory> inventory;

    public Customer(int id, String name, String address, String cellPhone, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cellPhone = cellPhone;
        this.email = email;
        this.account = account;
        this.inventory = inventory;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the cellPhone
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * @param cellPhone the cellPhone to set
     */
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the account
     */
    public ArrayList<Account> getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(ArrayList<Account> account) {
        this.account = account;
    }

    /**
     * @return the inventory
     */
    public ArrayList<Inventory> getInventory() {
        return inventory;
    }

    /**
     * @param inventory the inventory to set
     */
    public void setInventory(ArrayList<Inventory> inventory) {
        this.inventory = inventory;
    }
    
    
}
