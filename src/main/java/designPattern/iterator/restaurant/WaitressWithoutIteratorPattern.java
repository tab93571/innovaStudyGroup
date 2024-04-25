package designPattern.iterator.restaurant;

public class WaitressWithoutIteratorPattern {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public WaitressWithoutIteratorPattern() {
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
