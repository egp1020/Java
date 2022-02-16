/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareClass;

/**
 *
 * @author estefania.garces
 */
public class CreditCard {
    private long id;
    private int amountMoney;
    private int segurityCode;

    public CreditCard(long id, int amountMoney, int segurityCode) {
        this.id = id;
        this.amountMoney = amountMoney;
        this.segurityCode = segurityCode;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the amountMoney
     */
    public int getAmountMoney() {
        return amountMoney;
    }

    /**
     * @param amountMoney the amountMoney to set
     */
    public void setAmountMoney(int amountMoney) {
        this.amountMoney = amountMoney;
    }

    /**
     * @return the segurityCode
     */
    public int getSegurityCode() {
        return segurityCode;
    }

    /**
     * @param segurityCode the segurityCode to set
     */
    public void setSegurityCode(int segurityCode) {
        this.segurityCode = segurityCode;
    }
    
}
