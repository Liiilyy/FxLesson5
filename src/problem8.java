//Задача 8
//Напишите программу на Java для перемешивания элементов в списке массивов.

import java.util.ArrayList;
import java.util.Collections;

public class problem8 {
    public static void main(String[] args){
        ArrayList<Integer> colors = new ArrayList<Integer>();
        colors.add(90);
        colors.add(100);
        colors.add(98);
        colors.add(92);
        colors.add(99);
        colors.add(91);

        Collections.sort(colors);

        for (int i : colors){
            System.out.println(i);
        }
    }
}