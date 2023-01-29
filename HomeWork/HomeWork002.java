
package HomeWork;

public class HomeWork002 {
   public static void main(String[] args){
   //    1 Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки). 

      String str = "Hello world! :)";
      // System.out.println(str);
      String str1 = "Hello world! :)";
      // System.out.println(str1);
      System.out.println("Есть ли вхождение в строке? " + (str.contains(str1)));
      

   //    2 Напишите программу, чтобы проверить, являются ли две данные строки
   // вращением друг друга (вхождение в обратном порядке).

      String s1 = "abcd";
      String s2 = "cdab";

      if (s1.length() != s2.length()) {
         System.out.println(
            "не является вращением");
      }
      else{
         String s3 = s1.repeat(2);
         System.out.println("Строки являются вращением друг друга? " + (s3.contains(s2)));
         }
      
   // Задание 3 в конце.
   //    4 Дано два числа, например 3 и 56, необходимо составить следующие строки: 
   // * 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 
   // * Используем метод StringBuilder.append().
   //    5 Замените символ “=” на слово “равно”.
   // * Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
   
      int a = 3;
      int b = 56;
      
      StringBuilder sum = new StringBuilder();
      
      sum
          .append(a)
          .append(" + ")
          .append(b)
          .append(" = ")
          .append(a + b);
      System.out.println(sum);
      int ind = sum.indexOf("=");
      sum.deleteCharAt(ind).insert(ind, "равно");
      System.out.println(sum);

      StringBuilder sub = new StringBuilder();
      sub
          .append(a)
          .append(" - ")
          .append(b)
          .append(" = ")
          .append(a - b);
      System.out.println(sub);
      sub.deleteCharAt(7).insert(7, "равно");
      System.out.println(sub);

      StringBuilder mult = new StringBuilder();
      mult
          .append(a)
          .append(" * ")
          .append(b)
          .append(" = ").append(a * b);
      System.out.println(mult);
      
      mult.deleteCharAt(7).insert(7, "равно");
      System.out.println(mult);

      
   //    6 Замените символ “=” на слово “равно”. 
   // Используйте методы StringBuilder.replace().

      long begin = System.currentTimeMillis();

      StringBuilder sum1 = new StringBuilder();
      sum1
          .append(a)
          .append(" + ")
          .append(b)
          .append(" = ")
          .append(a + b);
      System.out.println(sum1);
      System.out.println(sum1.replace(7, 8, "равно"));

      StringBuilder sub1 = new StringBuilder();
      sub1
          .append(a)
          .append(" - ")
          .append(b)
          .append(" = ")
          .append(a - b);
      System.out.println(sub1);
      System.out.println(sub1.replace(7, 8, "равно"));

      StringBuilder mult1 = new StringBuilder();
      mult1
          .append(a)
          .append(" * ")
          .append(b)
          .append(" = ").append(a * b);
      System.out.println(mult1);
      System.out.println(mult1.replace(7, 8, "равно"));

      long end = System.currentTimeMillis();
      

      // 7 Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
      long begin1 = System.currentTimeMillis();

      String s = "";
      for (int i = 0; i < 10_000; i++) {
         s += " = ";
      }
      
      long end1 = System.currentTimeMillis();

      long begin2 = System.currentTimeMillis();
      StringBuilder stb = new StringBuilder();

      for (int j = 0; j < 10_000; j++) {
         stb.append(" = ");
      }
      
      long end2 = System.currentTimeMillis();
      System.out.println("Время выполнения п.6 = " + (end - begin));
      System.out.println("Время выполнения средством String = " + (end1 - begin1));
      System.out.println("Время выполнения стедством StringBuilder = " + (end2 - begin2));


   // 3 Напишите программу, чтобы перевернуть строку с помощью рекурсии.
      
      String string_revers = "Строка для переворота!";
      System.out.println(string_revers);
      System.out.println(reverseString(string_revers));

   }
   public static String reverseString(String str) {
      if (str.length() <= 1) {
         return str;
      }
      return reverseString(str.substring(1)) + str.charAt(0);
   } 
}
