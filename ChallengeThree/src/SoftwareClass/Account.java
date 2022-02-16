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
public class Account {
    private double availableMoney;
    private CreditCard creditcard;

    public Account(double availableMoney, CreditCard creditcard) {
        this.availableMoney = availableMoney;
        this.creditcard = creditcard;
    }

    /**
     * @return the availableMoney
     */
    public double getAvailableMoney() {
        return availableMoney;
    }

    /**
     * @param availableMoney the availableMoney to set
     */
    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    /**
     * @return the creditcard
     */
    public CreditCard getCreditcard() {
        return creditcard;
    }

    /**
     * @param creditcard the creditcard to set
     */
    public void setCreditcard(CreditCard creditcard) {
        this.creditcard = creditcard;
    }
    
    
}
