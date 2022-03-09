import java.util.*;
import java.util.stream.Collectors;

class Fruit {
    private String name;
    private int calories;
    private int price;
    private String color;

    public Fruit(String name, int calories, int price, String color) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

public class Assignment1 {

    public static List<String> reverseSort(ArrayList<Fruit> fruits) {
      
        ArrayList<Fruit> fruit = fruits.stream()
                .filter(p -> p.getCalories() < 100)
                .sorted(Comparator.comparingInt(Fruit::getCalories).reversed())
                .collect(Collectors.toCollection(ArrayList::new));

       ArrayList<String> fruit1 = new ArrayList<>();
       for(Fruit Fruit:fruit){
           fruit1.add(Fruit.getName());
       }

        return fruit1;
    }

    public static ArrayList<Fruit> sort(ArrayList<Fruit> Fruits) {
        Fruits=Fruits.stream()
                .sorted(Comparator.comparing(Fruit::getColor))
                .collect(Collectors.toCollection(ArrayList::new));
        return Fruits;
    }

    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits){
        fruits=fruits.stream()
                .filter(p->p.getColor().equals("Red"))
                .sorted(Comparator.comparingInt(Fruit::getPrice))
                .collect(Collectors.toCollection(ArrayList::new));
        return fruits;
    }

    public static void main(String[] args) {

        ArrayList<Fruit>fruits = new ArrayList<>();
        
        fruits.add( new Fruit("Apple",110,60,"Red"));
        fruits.add(new Fruit("Banana",120,40,"Yellow"));
        fruits.add(new Fruit("Mango",90,45,"Yellow"));
        fruits.add( new Fruit("Grapes",100,80,"Green"));
        fruits.add(new Fruit("Guava",90,65,"Green"));
        
        System.out.println("\n*********** Reversed sorted fruits **************");
        List<String> reversedFruit = new ArrayList<>();
        reversedFruit = reverseSort( fruits);
        System.out.println(reversedFruit);
        
        System.out.println("\n*********** sorted fruits **************");
        ArrayList<Fruit> sortedFruit = new ArrayList<>();
        sortedFruit =  sort(fruits);
        System.out.println(sortedFruit);
    
        System.out.println("\n*********** Filteres red sorted fruits **************");
        ArrayList<Fruit> FilterdRedFruit = new ArrayList<>();
        FilterdRedFruit = filterRedSortPrice(fruits);
        System.out.println(FilterdRedFruit);

    }

}
