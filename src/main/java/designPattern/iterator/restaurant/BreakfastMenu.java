package designPattern.iterator.restaurant;

import java.util.Iterator;

public class BreakfastMenu implements Menu {
	BST<MenuItem> menuItems;

	public BreakfastMenu() {
		menuItems = new BST();
 
		addItem("Vegetarian BLT",
			"(Fakin') Bacon with lettuce & tomato on whole wheat", true, 15.99);
		addItem("BLT",
			"Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day",
			"Soup of the day, with a side of potato salad", false, 37.29);
		addItem("Hotdog",
			"A hot dog, with saurkraut, relish, onions, topped with cheese",
			false, 1.05);
		addItem("Steamed Veggies and Brown Rice",
			"Steamed vegetables over brown rice", true, 6.99);
		addItem("Pasta",
			"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
			true, 5.89);
	}
  
	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
	public BST<MenuItem> getMenuItems() {
		return menuItems;
	}

	@Override
	public String getName() {
		return "=======================BreakfastMenu=======================";
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
	public Iterator<MenuItem> createPostIterator() {
		return menuItems.postOrderIterator();
	}

	public Iterator<MenuItem> createPreIterator() {
		return menuItems.preOrderIterator();
	}
}
