package duke.choice;
import java.util.Arrays;

public class ShopApp {
    public static void main(String[] args){
        System.out.println("Hello World");

        //Initialization of Customer Object
        Customer c1 = new Customer("Pinky", 3);
        System.out.println("Customer is " + c1.getName() + " size " + c1.getSize());

        //The minimum price should be 10
        System.out.println("Min Price " + Clothing.MIN_PRICE);

        //Initialization of Clothing objects
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5.0, "S");
        Clothing item4 = new Clothing("Blue T-shirt", 10.5, "S");
        Clothing[] items = {item1, item2, item3, item4};

        //Adding the items into Customer
        c1.addItems(items);

        //All the items owned by the Customer
        for(Clothing item : c1.getItems()){
            //System.out.println(item.getDescription() + " " + item.getPrice() + " " + item.getSize());
            System.out.println("Item: " + item);
        }

        //Sort the Items
        Arrays.sort(c1.getItems());

        System.out.println("After sorting ");
        for(Clothing item : c1.getItems()){
            System.out.println("Item: " + item);
        }


        c1.getAverageCost();
        System.out.println("Total cost " + c1.getTotalClothingCost());
    }
}