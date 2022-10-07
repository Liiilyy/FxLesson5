import java.util.ArrayList;
import java.util.Collections; //Import the Collections class //Импорт класса коллекций

public class main5 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars); //Sort cars //Сортировать автомобили
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
//BMW
//Ford
//Mazda
//Volvo