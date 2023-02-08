package HomeWork;
/*
 * Создать словарь HashMap. Обобщение <Integer, String>.
 * Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
 * Изменить значения дописав восклицательные знаки. 
 * *Создать TreeMap, заполнить аналогично.
 * ***Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.
 * *** ***Сравнить время прямого и случайного перебора тысячи элементов словарей.
 */


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import java.util.TreeMap;

public class HomeWork005 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        HashMap <Integer, String> hmap = new HashMap<>();
        hmap.put(1, "black");
        hmap.put(2, "red");
        hmap.put(3, "yellow");
        hmap.putIfAbsent(4, "green");
        System.out.println(hmap);
        hmap.computeIfPresent(1, (k, v) -> v = "black!");
        hmap.computeIfPresent(2, (k, v) -> v = "red!");
        hmap.computeIfPresent(3, (k, v) -> v = "yellow!");
        hmap.compute(4, (k, v) -> v = "green!");

        //System.out.println(hmap);

        TreeMap <Integer, String> tmap = new TreeMap<>();
        tmap.put(1, "black");
        tmap.put(2, "red");
        tmap.put(3, "yellow");
        tmap.putIfAbsent(4, "green");
        System.out.println(tmap);
        tmap.computeIfPresent(1, (k, v) -> v = "black!");
        tmap.computeIfPresent(2, (k, v) -> v = "red!");
        tmap.computeIfPresent(3, (k, v) -> v = "yellow!");
        tmap.compute(4, (k, v) -> v = "green!");

        Random rnd = new Random();
        for (int i = 0; i < 1000; i++) {
            hmap.put(rnd.nextInt(2000), "color");
            tmap.put(rnd.nextInt(2000), "color");            
        }
        // System.out.println(hmap);
        // System.out.println(tmap);
        
        long start = System.currentTimeMillis();
        Iterator<Integer> iter = hmap.keySet().iterator();
        while (iter.hasNext()){
            Integer tmp = iter.next();
            System.out.println(tmp);
        }
        long end = System.currentTimeMillis();
        
        long start1 = System.currentTimeMillis();
        Iterator<Integer> iterator = tmap.keySet().iterator();
        while (iterator.hasNext()){
            Integer tmp2 = iterator.next();
            System.out.println(tmp2);
        }
        long end1 = System.currentTimeMillis();

        System.out.println("hashMap " + (end - start));
        System.out.println("treeMap " + (end1 - start1));
        
    }
}
