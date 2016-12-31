/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package touchscreenmenu;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author Ryan Godfrey
 */
public final class Order {

    
    public TreeMap<Integer, Product> orders;
    private Integer ItemNumber = 1;
    public int orderNumber = 0;
    private static int nextOrderNumber = 0;
    private double total = 0;
    
    
    /**
     * Constructor that initializes a treeMap<Integer, Product>
     * called orders. The Integer being the item number.
     */
    public Order()      
    {
        orders = new TreeMap<Integer, Product>();
        
    }
    
    /**
     * Adds a a newItem of type Product to the treeMap called order.
     * @param newItem 
     */
    public void addProduct(Product newItem)
    {
        orders.put(getItemNumber(), newItem);
        ItemNumber++;
    }
    
    /**
     * NOT USED
     * @param itemNum
     * @return 
     */
    public boolean validMenuChoice(Integer itemNum)
    {
        return orders.containsKey(itemNum);
    }
    
    public void displayOrder()
    {
        if (orders.size() > 0)
        {
            for (Integer num : orders.keySet())
            System.out.println(num + " : " + orders.get(num));
            
        }
        else
        {
            System.out.println("There are no menu objects to display");
        }
    }
    
    /**
     * Remove last item. 
     */
    public void removeLastItem()
    {
        Integer last = orders.lastKey();
        orders.remove(last);
    }

    /**
     * @return the orders
     */
    public TreeMap<Integer, Product> getOrders() {
        return orders;
    }

    /**
     * @param orders the orders to set
     */
    public void setOrders(TreeMap<Integer, Product> orders) {
        this.orders = orders;
    }
    
    
    /**
     * Increment the order number
     */
    public void incrementOrderNumber()
    {
       orderNumber = getNextOrderNumber();
       nextOrderNumber++;
    }
    
    /**
     * Get the order Number
     */
    public int getOrderNumber()
    {
        return orderNumber;
    }
    
    /**
     * @return the nextOrderNumber
     */
    public int getNextOrderNumber() {
        return nextOrderNumber;
    }
    
    /**
     * @return the ItemNumber
     */
    public Integer getItemNumber() {
        return ItemNumber;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
    /**
     * 
     */
    public void displayOrders()
    {
        double totalCost = 0.00;
        System.out.println("Your order contains: ");
        for(Integer key : orders.keySet())
        {
            Integer num = (key);
            Product prod = orders.get(key);
            totalCost = totalCost + prod.getPrice();
        }
        DecimalFormat df = new DecimalFormat("##.00");
        System.out.println("The total cost of your order is $" + df.format(totalCost));
    }
    
    /**
     * The toString method of class Order.
     * @return the String
     */
    @Override
    public String toString()
    {
        
        DecimalFormat df = new DecimalFormat("##.00");
        double total = 0.00;
        StringBuilder builder = new StringBuilder();
        for(Integer key : orders.keySet())
        {   
            String num = key.toString();
            Product prod = orders.get(key);
            total += prod.getPrice();
            builder.append("Item #").append(num).append("\n").append(prod).append("\n").append("------------------------------").append("\n");
        } 
        builder.append("\nTotal for order #").append(nextOrderNumber-1).append("\n$").append(df.format(total));
        this.setTotal(total);
        return builder.toString();
    }

    /**
     * @param ItemNumber the ItemNumber to set
     */
    public void setItemNumber(Integer ItemNumber) {
        this.ItemNumber = ItemNumber;
    }

    
    
   
}
