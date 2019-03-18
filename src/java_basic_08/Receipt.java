package java_basic_08;

public class Receipt {
    private String title;
    private String shopName;
    private OrderDetail[] orderDetail;

    public Receipt(String title, String shopName, OrderDetail[] orderDetail) {
        this.title = title;
        this.shopName = shopName;
        this.orderDetail = orderDetail;
    }

    public String getTitle() {
        return title;
    }

    public String getShopName() {
        return shopName;
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < orderDetail.length; i++) {
            OrderDetail detail = orderDetail[i];
            totalPrice += detail.getPrice() * detail.getQty();
        }
        return totalPrice;
    }
}
