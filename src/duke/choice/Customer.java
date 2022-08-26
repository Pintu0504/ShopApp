package duke.choice;

public class Customer {
    private String name;
    private String size;
    private Clothing[] items;

    public Customer(String name, int measurement){
        this.name = name;
        this.setSize(measurement);
    }

    public void getAverageCost(){
        int cost = 0;
        int count = 0;
        for(Clothing item : items){
            if(item.getSize().equals("L")){
                cost += item.getPrice();
                count++;
            }
        }
        int averageCost = 0;
        try{
            averageCost = (count > 0) ? (cost / count) : 0;
            System.out.println("Average cost is " + averageCost);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void addItems(Clothing[] items){
        this.items = items;
    }

    public Clothing[] getItems(){
        return this.items;
    }

    public double getTotalClothingCost(){
        double totalCost = 0;
        for(Clothing item:items){
            if(item.getSize().equals(size)){
                totalCost += item.getPrice();
            }
        }
        return totalCost;
    }

    public void setSize(String size){
        this.size = size;
    }

    public void setSize(int measurement){
        switch(measurement){
            case 1, 2, 3:
                this.setSize("S");
                break;
            case 4, 5, 6:
                this.setSize("M");
                break;
            case 7, 8, 9: 
                this.setSize("L");
                break;
            default:
                this.setSize("X");
        }
    }

    public String getSize(){
        return size;
    }

    public String getName(){
        return name;
    }
}
