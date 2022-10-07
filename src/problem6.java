//Проблема 6
//Напишите программу Java для поиска элемента в списке массивов.

import java.util.*;

public class problem6 {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Yellow");
        list_Strings.add("Blue");
        list_Strings.add("Green");

        if (list_Strings.contains("White")) {
            System.out.println("Элемент табылды");
        } else {
            System.out.println("Мұндай элемент жоқ");
        }
    }
}