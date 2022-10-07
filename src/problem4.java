//Проблема 4
//Напишите программу Java для обновления
//определенного элемента массива заданным элементом

import java.util.ArrayList;

public class problem4 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Green");
        System.out.println(colors);

        colors.set(1, "Violet");
        System.out.println("set method:" + colors);
    }
}
//[Blue, Red, Yellow, Green]
//set method:[Blue, Violet, Yellow, Green]