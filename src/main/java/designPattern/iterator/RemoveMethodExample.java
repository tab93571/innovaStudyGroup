package designPattern.iterator;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class RemoveMethodExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(6);
        numbers.add(8);
        numbers.add(4);

        //i = 0 iteration  before 1,6,8,4 after 1,6,8,4, size = 4
        //i = 1 iteration  before 1,6,8,4 after 1,8,4 size = 3
        //i = 2 iteration  before 1,8,4 after 1,8 size = 2
        //i = 3 iteration  i < size
//        for (int i = 0; i < numbers.size(); i++) {
//            int number = numbers.get(i);
//            if (number % 2 == 0) { // Remove even numbers
//                numbers.remove(i);
//            }
//        }

//        The Iterator expects that the underlying collection does not change while it is being iterated, except through the iterator’s own remove() method.
//        If you modify the collection outside of this method (like using numbers.remove() directly), the iterator will detect that the collection's structure has changed unexpectedly.
//        This results in a ConcurrentModificationException

//        final void checkForComodification() {
//            if (modCount != expectedModCount)
//                throw new ConcurrentModificationException();
//        }

        for (int number : numbers) {
            if (number % 2 == 0) {
                numbers.remove(Integer.valueOf(number)); // Unsafe removal
            }
        }

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            int number = it.next();
            if (number % 2 == 0) { // Remove even numbers
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}

