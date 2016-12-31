/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package touchscreenmenu;

import java.text.DecimalFormat;

/**
 *
 * @author Ryan Godfrey
 */
public class Product {
    protected String name;  //product name
    protected double price; //price of product
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public Product()
    {
        
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
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
    
    @Override
    /**
     * @return the String representation of Product object
     */
    public String toString()       
    {
        DecimalFormat df = new DecimalFormat("##.00"); 
        String product = "\n" + name + "\n$" + df.format(price);
        return product;
    }    
    
}
