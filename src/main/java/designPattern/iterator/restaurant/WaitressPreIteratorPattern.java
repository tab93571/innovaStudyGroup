package designPattern.iterator.restaurant;

import java.util.Iterator;
import java.util.List;

public class WaitressPreIteratorPattern {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public WaitressPreIteratorPattern() {
        pancakeHouseMenu = new PancakeHouseMenu();
        dinerMenu = new DinerMenu();
    }
    public void printMenu() {

        for(int i = 0 ; i < pancakeHouseMenu.menuItems.size() ; i ++){
          printMenuItem(pancakeHouseMenu.menuItems.get(i));
        }

        for(int i = 0 ; i < dinerMenu.menuItems.length ; i ++){
            printMenuItem(dinerMenu.menuItems[i]);
        }
    }

    private void printMenuItem(MenuItem menuItem){
        System.out.print(menuItem.getName() + ", ");
        System.out.print(menuItem.getPrice() + " -- ");
        System.out.println(menuItem.getDescription());
    }
}
