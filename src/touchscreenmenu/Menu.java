/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package touchscreenmenu;

import java.util.HashMap;

/**
 *
 * @author Ryan Godfrey
 */
public class Menu {
    private HashMap<Integer, Product> menu;
    private Integer menuNumber = 1;
    
    public Menu()
    {
        menu = new HashMap<Integer, Product>();
    }
    
    public void addMenuItem(Product newItem)
    {
        menu.put(menuNumber, newItem);
        menuNumber++;
    }
    
    public boolean validMenuChoice(Integer itemNum)
    {
        return menu.containsKey(itemNum);
    }
    
    public void displayMenu()
    {
        if (menu.size() > 0)
        {
            for (Integer num : menu.keySet())
            System.out.println(num + " : " + menu.get(num));
            
        }
        else
        {
            System.out.println("There are no menu objects to display");
        }
    }
    
    
    
}
