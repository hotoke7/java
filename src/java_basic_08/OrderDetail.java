package java_basic_08;

public class OrderDetail {
    private String productName;
    private int price;
    private int qty;

    public OrderDetail(String productName, int price, int qty) {
        this.productName = productName;
        this.price = price;
        this.qty = qty;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}
