package java_basic_08;

public class OrderDetail {

    //class
    private String itemName;
    private int itemPrice;

    private int itemTotal;

    //constructor

    public OrderDetail (String itemName, int itemPrice, int itemTotal){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemTotal = itemTotal;
    }

    //getter
    public String getItemName(){
        return itemName;
    }
    public int getItemPrice() {
        return itemPrice;
    }
    public int getItemTotal() {
        return itemTotal;
    }
}
