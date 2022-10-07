//Практика решения проблем
//Проблема 1
//Напишите программу на Java, чтобы создать новый список массивов, добавить несколько цветов (строку) и распечатать коллекцию.

import java.util.ArrayList;
public class problem1 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Blue");
        System.out.println(colors); //[Green, Red, Yellow, Blue]
    }
}