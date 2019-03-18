package java_basic_08;

public class OrderDetail {
    private String name;
    private int price;
    private int qty;

   public OrderDetail (String name, int price, int qty){
       this.name = name;
       this.price = price;
       this.qty = qty;
   }

    public int getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}
