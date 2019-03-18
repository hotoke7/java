package java_basic_08;

public class Receipt {
    private String shopName;
    private String address;
    private OrderDetail[] orderDetail;

    public Receipt(String shopName, String address, OrderDetail[] orderDetail) {
        this.shopName = shopName;
        this.address = address;
        this.orderDetail = orderDetail;
    }

    public String getShopName() {
        return shopName;
    }

    public String getAddress() {
        return address;
    }

    public OrderDetail[] getOrderDetail() {
        return orderDetail;
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
