//Задача 9
//Напишите программу на Java, чтобы поменять местами элементы в списке массивов

import java.util.ArrayList;
import java.util.Collections;

public class problem9 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Violet");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        Collections.sort(colors);
        for (String i : colors) {
            System.out.println(i);
        }
    }
}

//Blue
//Red
//Violet
//Yellow