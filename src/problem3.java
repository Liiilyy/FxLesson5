//Проблема 3
//Напишите программу Java для извлечения элемента (по указанному индексу) из заданного списка массивов.
import java.util.ArrayList;

public class problem3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Green");
        System.out.println(colors);

        String color = colors.get(0);
        System.out.println("get method:" + color);
    }
}
//[Blue, Red, Yellow, Green]
//get method:Blue