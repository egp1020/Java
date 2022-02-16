/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareClass;

/**
 *
 * @author raad_
 */
public class Customers extends Members{
    private String address;
    private long cellPhone;

    public Customers() {
    }

    public Customers(String address, long cellPhone, String name, String lastName, String email, int id) {
        super(name, lastName, email, id);
        this.address = address;
        this.cellPhone = cellPhone;
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
    public long getCellPhone() {
        return cellPhone;
    }

    /**
     * @param cellPhone the cellPhone to set
     */
    public void setCellPhone(long cellPhone) {
        this.cellPhone = cellPhone;
    }
    
    @Override
    public String getMemberType(){
        return "Customer";
    }
}
