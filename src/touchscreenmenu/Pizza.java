/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package touchscreenmenu;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryan Godfrey
 */
public class Pizza extends Product {
    private PizzaSize size;
    private ArrayList<PizzaToppings> toppings;              //a collection of toppings
    private double TOPPINGCOST = 1.00;    //constant value for cost for each topping added
    private double smallCost= 8.00;
    private double mediumCost = 9.00;
    private double largeCost = 10.00;
    
    
    public Pizza(PizzaSize size, String name, double price, ArrayList<PizzaToppings> toppings)
    {
        super(name, price);
        this.toppings = toppings;
        this.size = size;
        smallCost = price;
        mediumCost = price;
        largeCost = price;
        
    }
    
    public Pizza()
    {
        super();
    }
    
    /**
     * Add toppings
     * @param topping
     */
    public void addToppings(PizzaToppings topping)
    {
        getToppings().add(topping);          
    }
    
    /**
     * Remove Toppings
     * @param topping
     */
    public void removeToppings(PizzaToppings topping)
    {
        getToppings().remove(topping);
    }
    
    /**
     * @return the toppings
     */
    public ArrayList<PizzaToppings> getToppings() {
        return toppings;
    }

    /**
     * @param toppings the toppings to set
     */
    public void setToppings(ArrayList<PizzaToppings> toppings) {
        this.toppings = toppings;
    }
    
     /**
     * @return the size
     */
    public PizzaSize getSize() {
        return size;
    }

    /**
     * @return the TOPPINGCOST
     */
    public double getTOPPINGCOST() {
        return TOPPINGCOST;
    }

    /**
     * @param TOPPINGCOST the TOPPINGCOST to set
     */
    public void setTOPPINGCOST(double TOPPINGCOST) {
        this.TOPPINGCOST = TOPPINGCOST;
    }

    /**
     * @return the smallCost
     */
    public double getSmallCost() {
        return smallCost;
    }

    /**
     * @param smallCost the smallCost to set
     */
    public void setSmallCost(double smallCost) {
        this.smallCost = smallCost;
    }

    /**
     * @return the mediumCost
     */
    public double getMediumCost() {
        return mediumCost;
    }

    /**
     * @param mediumCost the mediumCost to set
     */
    public void setMediumCost(double mediumCost) {
        this.mediumCost = mediumCost;
    }

    /**
     * @return the largeCost
     */
    public double getLargeCost() {
        return largeCost;
    }

    /**
     * @param largeCost the largeCost to set
     */
    public void setLargeCost(double largeCost) {
        this.largeCost = largeCost;
    }
    
    /**
     * Calculate and return the price with additional cost of including toppings.
     * @return the new price including the additional cost of adding toppings.
     */
    @Override
    public double getPrice() {
        if (getToppings() == null) {
            return this.price;
        }
        
        return this.price + (getToppings().size() * this.getTOPPINGCOST());
    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.00");
        StringBuilder builder = new StringBuilder(); 
        builder.append("\n").append(this.getSize()).append(" ").append(this.getName()).append('\n');
        if (getToppings() != null) {
            for(PizzaToppings topping : getToppings()) {
                builder.append('\n').append(topping.toString());
            }
        }
        builder.append("\n").append("$").append(df.format(getPrice()));
        
        return builder.toString();
    }

    
    
    
    
    
}
