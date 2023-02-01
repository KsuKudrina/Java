
package HomeWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class HomeWork003 {
    public static void main(String[] args) {
        //  Создать новый список, добавить несколько строк и вывести коллекцию на экран.

        ArrayList<String> list = new ArrayList<>();
        list.add("Black");
        list.add("White");
        list.add("Red");
        list.add("Yellow");
        list.add("Blue");

        System.out.println(list);
        
        //  Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        ListIterator<String> lstIt = list.listIterator();
        while (lstIt.hasNext()){
            System.out.println(lstIt.next() + "!");
        }

        //  Вставить элемент в список в первой позиции.

        list.add(0, "Pink");
        System.out.println(list);

        //  Извлечь элемент (по указанному индексу) из заданного списка.

        System.out.println(list.get(3));

        //  Обновить определенный элемент списка по заданному индексу.

        list.set(2, "Green");
        System.out.println(list);

        //  Удалить третий элемент из списка.

        list.remove(2);
        System.out.println(list);

        //  Поиск элемента в списке по строке.

        System.out.println(list.indexOf("Yellow"));
        System.out.println(list.lastIndexOf("Yellow"));

        //  Создать новый список и добавить в него несколько елементов первого списка.

        
        List l1 = list.subList(1, 4);
        System.out.println(l1);

        //  Удалить из первого списка все элементы отсутствующие во втором списке.

        // list.retainAll(l1);
        // System.out.println(list);

        //  *Сортировка списка

        Collections.sort(list);
        System.out.println(list);
    }

}
