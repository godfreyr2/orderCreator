/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package touchscreenmenu;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Ryan Godfrey
 */
public class ToppingsList {
    private ArrayList<PizzaToppings> toppings;
    
    public ToppingsList()
    {
        toppings = new ArrayList<>();
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
     * Add toppings to the list
     * @param topping
     */
    public void addToppings(PizzaToppings topping)
    {
        toppings.add(topping);
    }
    
    /**
     * Remove topping from the list
     * @param topping
     */
    public void removeToppings(PizzaToppings topping)
    {
        toppings.remove(topping);
    }
    
    /**
     * toppings size
     * @return 
     */
    public int getToppingsSize()
    {
        return toppings.size();
    }
    
    @Override
    public String toString()
    {
        
        StringBuilder builder = new StringBuilder(); 
        if (getToppings() != null) {
            for(PizzaToppings topping : getToppings()) {
                builder.append('\n').append(topping.toString());
            }
        }
        return builder.toString();
        
    }
}

