package duke.choice;

public class Clothing implements Comparable<Clothing> {
    private String description, size="M";
    private double price;
    public static final double MIN_PRICE = 10.0, TAX = 0.2;

    public Clothing(String description, double price, String size){
        this.description = description;
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
        this.size = size;
    }

    public double getPrice(){
        return price * (1 + TAX);
    }

    public String getDescription(){
        return description;
    }
    
    public String getSize(){
        return size;
    }

    @Override
    public String toString(){
        return (description + " " + price + " " + size);
    }

    @Override
    public int compareTo(Clothing o) {
        return description.compareTo(o.description);
    }
}
