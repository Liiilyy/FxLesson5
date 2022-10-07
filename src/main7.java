import java.util.ArrayList;

public class main7 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        String car = cars.get(0);
        System.out.println("get method:" + car);

        cars.set(0, "Opel");
        System.out.println("set method:" + cars);

        cars.remove(0);
        System.out.println("remove method:" + cars);

        cars.clear();
        System.out.println("clear method:" + cars);

        int s = cars.size();
        System.out.println("list size" + s);
    }
}
//[Volvo, BMW, Ford, Mazda]
//get method:Volvo
//set method:[Opel, BMW, Ford, Mazda]
//remove method:[BMW, Ford, Mazda]
//clear method:[]
//list size0