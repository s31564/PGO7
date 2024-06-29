import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Zadanie 1
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota Camry", 2020));
        cars.add(new Car("Honda Accord", 2018));
        cars.add(new Car("Ford Mustang", 2019));
        cars.add(new Car("Chevrolet Malibu", 2021));
        cars.add(new Car("Nissan Altima", 2017));
        cars.add(new Car("Hyundai Sonata", 2015));
        cars.add(new Car("BMW 3 Series", 2016));
        cars.add(new Car("Audi A4", 2022));
        cars.add(new Car("Mercedes-Benz C-Class", 2023));
        cars.add(new Car("Volkswagen Passat", 2014));

        Collections.sort(cars);

        System.out.println("Sorted cars:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Zadanie 2
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1, "Item 1"));
        items.add(new Item(2, "Item 2"));
        items.add(new Item(3, "Item 3"));
        items.add(new Item(4, "Item 4"));
        items.add(new Item(5, "Item 5"));

        System.out.println("\nItems in ArrayList:");
        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }

        HashMap<Integer, String> itemMap = new HashMap<>();
        for (Item item : items) {
            itemMap.put(item.getId(), item.getName());
        }

        System.out.println("\nItems in HashMap:");
        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Zadanie 3
        ArrayList<Item> moreItems = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            moreItems.add(new Item(i, "Item " + i));
        }

        List<Item> firstFiveItems = moreItems.subList(0, 5);
        HashSet<Item> itemSet = new HashSet<>(firstFiveItems);

        System.out.println("\nFirst five items in HashSet:");
        for (Item item : itemSet) {
            System.out.println(item);
        }

        // Zadanie 4
        int[] numbers = new int[10];
        fillArray(numbers);

        System.out.println("\nNumbers in array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = readNumber();
            } catch (NegativeNumberException e) {
                array[i] = 0;
                System.out.println(e.getMessage());
            }
        }
    }
}



