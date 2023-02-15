package HomeWork;
/*
 * 1.Сохранить в файл строку и загрузить из файла строку 
    с выводом в консоль используя классы FileWriter и FileReader
 * 2.Загрузить из файла многострочный текст формата 
    ФИО возраст и пол через пробелы. 
    Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
 * 3.Загруженный и разбитый по строкам текст 
    загрузить в подготовленные списки. 
    Фамилии, имена, отчества, возрас и пол в отдельных списках.
 * 4.Отсортировать по возрасту используя дополнительный список индексов.
 */
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class HomeWork004 {
    public static void main(String[] args) {
        FileWriter fileWr;
        try {
            fileWr = new FileWriter("newfile.scl");
            fileWr.append("Hello World!");
            fileWr.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        FileReader fileRd;
        String str = "";
        try{
            fileRd = new FileReader("newfile.scl");
            while (fileRd.ready()){
                str += (char) fileRd.read();
            }
            System.out.println(str);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("file.scl"));
            
            fileWriter.write("Смирнов Павел Олегович 56 М ");
            fileWriter.newLine();
            fileWriter.write("Иванов Иван Петрович 42 М ");
            fileWriter.newLine();
            fileWriter.write("Петрова Мария Ивановна 38 Ж ");
            fileWriter.newLine();
            fileWriter.write("Алексеева Валентина Петровна 54 Ж ");
            fileWriter.newLine();
            fileWriter.write("Власов Максим Иванович 30 М ");
            fileWriter.newLine();
            fileWriter.write("Нагорная Алена Михайловна 35 Ж ");
            fileWriter.flush();
            System.out.println(fileWriter); //эта строчкак кода не нужна!
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        FileReader reader;
        String txt = "";
        try{
            reader = new FileReader("file.scl");
            while (reader.ready()) {
                txt += (char)reader.read();
            }
            String[] in = txt.split("\n");
            // System.out.println(Arrays.toString(in));

            ArrayList<String> family = new ArrayList<>();
            ArrayList<String> name = new ArrayList<>();
            ArrayList<String> patr = new ArrayList<>();
            ArrayList<Integer> age = new ArrayList<>();
            ArrayList<Boolean> gen = new ArrayList<>();
            LinkedList<Integer> id = new LinkedList<>();

            String[] tmp;
            for (int i = 0; i < in.length; i++) {
                tmp = in[i].split(" ");
                family.add(tmp[0]);
                name.add(tmp[1].substring(0, 1) + ".");
                patr.add(tmp[2].substring(0, 1) + ".");
                age.add(Integer.parseInt(tmp[3]));
                gen.add(tmp[4].contains("М")?false:true);
                id.add(i);
            }
            
            for (int i = 0; i < id.size(); i++){
                System.out.printf(family.get(i) + " ");
                System.out.printf(name.get(i));
                System.out.printf(patr.get(i) + " ");
                System.out.printf(age.get(i).toString() + " ");
                System.out.printf((gen.get(i) ? "M" : "Ж") + " ");
                System.out.println();
            }
            
            ArrayList<Integer> g = new ArrayList<>();
            for (int i = 0; i < age.size(); i++) {
                g.add(age.get(id.get(i)));
            }

            g.sort(new Comparator<Integer>() {

                @Override
                public int compare(Integer o1, Integer o2) {
                    return (o1 - o2);
                }
                
            });
           
            System.out.println(g);

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    
    }
}
