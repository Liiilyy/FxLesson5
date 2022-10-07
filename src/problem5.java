//Проблема 5
//Напишите программу на Java для удаления третьего элемента из списка массивов.

import java.util.ArrayList;

public class problem5 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Green");
        System.out.println(colors);

        colors.remove(2);
        System.out.println("remove method:" + colors);
    }
}