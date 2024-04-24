package designPattern.iterator.foreachTest;

import designPattern.iterator.restaurant.BreakfastMenu;
import designPattern.iterator.restaurant.MenuItem;

public class TestIterableForeach {
    public static void main(String[] args) {
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        for (MenuItem menuItem : breakfastMenu.getMenuItems()){
            System.out.println(menuItem.getName());
        }
    }
}
