//Задача 7
//Напишите программу на Java для копирования одного списка массивов в другой.

import java.util.*;
public class problem7 {
    public static void main(String[] args) {
        List<String> colors1 = new ArrayList<String>();
        colors1.add("Blue");
        colors1.add("Green");
        colors1.add("Yellow");
        colors1.add("Red");
        System.out.println("List1: " + colors1);
        List<String> colors2 = new ArrayList<String>();
        colors2.add("Violet");
        colors2.add("Orange");
        colors2.add("Purple");
        colors2.add("Pink");
        System.out.println("List2: " + colors2);

        Collections.copy(colors1, colors2);
        System.out.println("Copy List to List2,\nAfter copy:");
        System.out.println("List1: " + colors1);
        System.out.println("List2: " + colors2);
    }
}