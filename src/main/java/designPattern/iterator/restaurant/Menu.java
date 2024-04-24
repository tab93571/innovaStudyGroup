package designPattern.iterator.restaurant;

import java.util.Iterator;

public interface Menu {
	 String getName();
	 Iterator<MenuItem> createIterator();
}
