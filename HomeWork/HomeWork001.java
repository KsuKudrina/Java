/*
 * 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
 * 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
 * 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
 * 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

 */

package HomeWork;

// import java.util.Arrays;
import java.util.Random;

public class HomeWork001 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int i = rnd.nextInt(2000);

        int n = 0;
        int a = 2;
        while (a < i){
            a = a * 2;
            n++;
        }

        System.out.println(i);
        System.out.println(n);
        int j = 0;
        int[] m1 = new int[Short.MAX_VALUE];

        while ( i < Short.MAX_VALUE ) {
            if (i % n == 0){
                if ( j < m1.length) {                
                    m1[j] = i;   
                }
                j++;
            }
            i++;  
        }
        //System.out.println(Arrays.toString(m1));

        int[] m2 = new int[Short.MAX_VALUE];
        int k = 0;
        while (i > Short.MIN_VALUE ) {
            if (i % n != 0){
                if ( k < m2.length) {
                    m2[k] = i;
                }
                k++;
            }
            i--;  
        }
        //System.out.println(Arrays.toString(m2));

    }
}
