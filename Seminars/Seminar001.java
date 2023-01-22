package Seminars;
// типы данных
// public class Seminar001 {
//     public static void main(String[] args) {
//         int x = 0; //32bit signed
//         long l; //64bit signed
//         float f = 0.0f; //32bit 
//         double d = 0; //64bit 
//         char c = 'a'; //16bit unsigned
//         boolean b = true;
//         String str = "строка";
//         System.out.println("Hello World!");
//     }
// }

import java.util.Arrays;
import java.util.Random;
//массивы
/**
 * Seminar001
 */
public class Seminar001 {

    public static void main(String[] args) {
        int[] ints = new int[10]; 
        Random rnd = new Random();
        for (int i = 0; i < ints.length; i++){
            ints[i] = rnd.nextInt(500);

        }
        System.out.println(Arrays.toString(ints));

        int[] tmp = new int[ints.length + 1];
        tmp[0] = 5;
        for (int i = 1; i < tmp.length; i++) {
            tmp[i] = ints[i-1];
        }
        ints = tmp;
        System.out.println(Arrays.toString(tmp));
    }
}

// /**
//  * Seminar001
//  */
// //строки
// public class Seminar001 {

//     public static void main(String[] args) {
//         String str = "Кофе, дерево, кабан!" + " Дорога, степь";
//         str += "!";
//         String[] splitStr = str.split(" ");
//         for (int i = 0; i < splitStr.length; i++) {
//             if (splitStr[i].contains(",") || splitStr[i].contains(".") || splitStr[i].contains("!"))
//                 splitStr[i] = splitStr[i].substring(0, splitStr[i].length()-1);
                    
//         } 
//         System.out.println(Arrays.toString(splitStr));

        
//     }
// }
