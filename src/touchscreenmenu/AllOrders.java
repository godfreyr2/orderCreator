/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package touchscreenmenu;

import java.text.DecimalFormat;
import java.util.TreeMap;

/**
 *
 * @author Ryan Godfrey
 */
public class AllOrders {
    private TreeMap<Integer, Order> allOrders;
    
    public AllOrders(){
    allOrders = new TreeMap<Integer, Order>();
}

    /**
     * @return the allOrders
     */
    public TreeMap<Integer, Order> getAllOrders() {
        return allOrders;
    }

    /**
     * @param allOrders the allOrders to set
     */
    public void setAllOrders(TreeMap<Integer, Order> allOrders) {
        this.allOrders = allOrders;
    }
    
    /**
     * add orders to All Orders
     * @param newOrder
     */
    public void addOrder(Order newOrder)
    {
        Integer orderNumber = newOrder.getOrderNumber();
        allOrders.put(orderNumber, newOrder);   
    }
    
    @Override
    public String toString()
    {
        
        StringBuilder builder = new StringBuilder();
        for(Integer key : allOrders.keySet())
        {   
            String num = key.toString();
            Order order = allOrders.get(key);
          
            
            builder.append("\n").append("Order #").append(num).append(" - ").append(order.toString()).append("------------------------------").append("\n");
        } 
        
        return builder.toString();
    }
    
    /**
     * All Orders size
     */
    public int allOrdersSize()
    {
        return allOrders.size();
    }

    
}
