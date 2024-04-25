package designPattern.iterator.restaurant;

import java.util.Arrays;

public class MenuTestDrive {
	public static void main(String args[]) {

		WaitressWithoutIteratorPattern waitressPreIteratorPattern = new WaitressWithoutIteratorPattern();
		waitressPreIteratorPattern.printMenu();


		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		BreakfastMenu breakfastMenu = new BreakfastMenu();
		Waitress waitress = new Waitress(Arrays.asList(pancakeHouseMenu, dinerMenu, breakfastMenu));
		waitress.printMenu();

		for(MenuItem menuItem : breakfastMenu.getMenuItems()){
			System.out.println(menuItem.name);
		}
	}
}
