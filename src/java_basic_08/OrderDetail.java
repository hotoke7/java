package java_basic_08;

public class OrderDetail {
    private String productName;
    private int price;
    private int quantity;

    public OrderDetail(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
