import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>(Arrays.asList(
                new Product("Snikers", 24.2),
                new Product("Twix", 20.0))
        );
        Machine machine = new Machine(list);
        String key = "Twix";
        System.out.println(machine.getByName(key));

        List<Product> listBottle = new ArrayList<>(Arrays.asList(
                new Bottle("Coca cola", 24.2, 0.5),
                new Bottle("Sprite", 20.0, 0.33))
        );
        Machine bottleMachine = new BottleMachine(listBottle);
        String keyBottle = "Sprite";
        System.out.println(bottleMachine.getByName(keyBottle));

        List<Product> listHotDrinks = new ArrayList<>(Arrays.asList(
                new HotDrink("Coffee", 35.0, 0.25, +93),
                new HotDrink("Tea", 20.0, 0.25, +95))
        );
        Machine hotDrinksMachine = new HotDrinksMachine(listHotDrinks);
        String hotDrink = "Tea";
        System.out.println(hotDrinksMachine.getByName(hotDrink));
    }
}
