package designPattern.stategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortableList<T> {
    private List<T> items;
    private Comparator<T> comparator;

    public SortableList(Comparator<T> comparator) {
        this.items = new ArrayList<>();
        this.comparator = comparator;
    }

    public void add(T item) {
        items.add(item);
    }

    public void sort() {
        items.sort(comparator);
    }

    @Override
    public String toString() {
        return items.toString();
    }


// Usage

    public static void main(String[] args) {
        SortableList<String> list = new SortableList<String>(Comparator.naturalOrder());
        list.add("Zebra");
        list.add("Apple");
        list.add("Mango");
        list.sort();
        System.out.println(list);

    }
}
