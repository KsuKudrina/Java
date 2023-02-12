package HomeWork;
/*
 * Разработать программу, имитирующую поведение коллекции HashSet. 
 * В программе содать метод add добавляющий элемент, 
 * метод toString возвращающий строку с элементами множества 
 * и метод позволяющий читать элементы по индексу. 
 * Формат данных Integer.
 */

import java.util.HashMap;
import java.util.Iterator;

public class HomeWork006 
{
    public static void main(String[] args) 
    {
        MySet mySet = new MySet();
        mySet.add(2);
        mySet.add(28);
        mySet.add(9);
        mySet.add(53);
        mySet.add(6);
        mySet.add(13);
        mySet.add(41);
        System.out.println(mySet);

        // for (int i = 0; i < mySet.size(); i++) 
        // {
        //     System.out.println(mySet.get(i));
        // }
        System.out.println("Элемент по индексу: " + mySet.get(1));

        Iterator<Integer> iterator = mySet.iterator();
        while(iterator.hasNext()){
            Integer m = iterator.next();
            System.out.println(m);
        }

    }
}

class MySet
{
    private HashMap<Integer,Object> map = new HashMap<>();
    private final Object obj  = new Object();

    @Override
    public String toString() 
    {
        return map.keySet().toString();
    }

    public Iterator <Integer> iterator() {
        return map.keySet().iterator();    
    }

    public boolean add(Integer i) 
    {
        return map.put(i, obj)!= null? true: false;
    }
    public Integer size()
    {
        return map.keySet().size();
    }
    public Integer get(Integer a)
    {
        return (Integer) map.keySet().toArray()[a];
    }
    
}
