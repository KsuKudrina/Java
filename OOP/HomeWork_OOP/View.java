package OOP.HomeWork_OOP;

import java.util.Collections;

import OOP.HomeWork_OOP.Unit.Human;


public class View {
    private static int step = 1;
    private static final int[] l = {0};
    private static final String top10 = formatDiv("a") + String.join("", Collections.nCopies(9, formatDiv("-b"))) + formatDiv("-c");
    private static final String midl10 = formatDiv("d") + String.join("", Collections.nCopies(9, formatDiv("-e"))) + formatDiv("-f");
    private static final String bottom10 = formatDiv("g") + String.join("", Collections.nCopies(9, formatDiv("-h"))) + formatDiv("-i");
    private static void tabSetter(int cnt, int max){
        int dif = max - cnt + 4; 
        if (dif > 0) System.out.printf("%" + dif + "s", ":\t"); 
        else System.out.print(":\t");
    }
    private static String formatDiv(String str) {
        return str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500');
    }

    static String heroEmoji(String e){
        return e.replace("А", "🏹")
                .replace("С", "🔫")
                .replace("В", "🧙")
                .replace("М", "🧝")
                .replace("К", "🤺")
                .replace("Р", "🕴")
                .replace("Ф", "🤠");
    }
    
    private static String getChar(int x, int y){
        String out = "| ";
        for (Human human: Main.Team) {
            if (human.getCoords()[0] == x && human.getCoords()[1] == y){
                if (human.getHp() == 0) {
                    out = "|" + (AnsiColors.ANSI_RED + human.getInfo().charAt(0) + AnsiColors.ANSI_RESET);
                    break;
                }
                if (Main.DarkSide.contains(human)) out = "|" + (AnsiColors.ANSI_BLUE + heroEmoji(String.valueOf(human.getInfo().charAt(0))) + AnsiColors.ANSI_RESET);
                if (Main.BrightSide.contains(human)) out = "|" + (AnsiColors.ANSI_GREEN + human.getInfo().charAt(0) + AnsiColors.ANSI_RESET);
                break;
            }
        }
        return out;
    }
    // static void Win(int size){
    //     Main.Team.forEach((v) -> l[0] = Math.max(l[0], v.toString().length()));
    //     for (int i = 0; i < l[0]*3; i++) System.out.print(" ");
    //     System.out.printf(AnsiColors.ANSI_PURPLE + "%s", size == 0? "Победила Dark Size" : "Победила Bright Size");
    // }
    

    public static void view() {
        if (step == 1 ){
            System.out.print(AnsiColors.ANSI_RED + "First step" + AnsiColors.ANSI_RESET);
        } else {
            System.out.print(AnsiColors.ANSI_RED + "Step:" + step + AnsiColors.ANSI_RESET);
        }
        step++;
        Main.Team.forEach((v) -> l[0] = Math.max(l[0], v.toString().length()));
        for (int i = 0; i < l[0]*3; i++) System.out.print("_"); 
        System.out.println();
        System.out.print(top10 + "\t");
        System.out.print("Blue side");
        for (int i = 1; i < l[0] - 5; i++) System.out.print(" "); 
        System.out.println(":\tGreen side");
        for (int i = 1; i < 11; i++) {
            System.out.print(getChar(1, i));
        }
        System.out.print("|    ");
        System.out.print(AnsiColors.ANSI_BLUE + Main.DarkSide.get(0) + AnsiColors.ANSI_RESET); 
        tabSetter(Main.DarkSide.get(0).toString().length(), l[0]);
        System.out.println(AnsiColors.ANSI_GREEN + Main.BrightSide.get(0) + AnsiColors.ANSI_RESET); 
        System.out.println(midl10);

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(getChar(i, j));
            }
            System.out.print("|    ");
            System.out.print(AnsiColors.ANSI_BLUE + Main.DarkSide.get(i-1) + AnsiColors.ANSI_RESET); 
            tabSetter(Main.DarkSide.get(i-1).toString().length(), l[0]);
            System.out.println(AnsiColors.ANSI_GREEN + Main.BrightSide.get(i-1) + AnsiColors.ANSI_RESET); 
            System.out.println(midl10);
        }
        for (int j = 1; j < 11; j++) {
            System.out.print(getChar(10, j));
        }
        System.out.print("|    ");
        System.out.print(AnsiColors.ANSI_BLUE + Main.DarkSide.get(9) + AnsiColors.ANSI_RESET);
        tabSetter(Main.DarkSide.get(9).toString().length(), l[0]);
        System.out.println(AnsiColors.ANSI_GREEN + Main.BrightSide.get(9) + AnsiColors.ANSI_RESET);
        System.out.println(bottom10);
    }
}