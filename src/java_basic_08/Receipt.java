package java_basic_08;

public class Receipt {
    private String shopName;
    private String shopAddress;
    private OrderDetail[] orderDetail;


    public Receipt(String shopName, String shopAddress, OrderDetail[] orderDetail) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.orderDetail = orderDetail;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public OrderDetail[] getOrderDetail() {
        return orderDetail;
    }

    public int getTotalPrice() {
        int sum = 0;
        for (int i = 0; i < this.orderDetail.length; i++) {
            sum += orderDetail[i].getItemPrice() * orderDetail[i].getItemTotal();

        }
        return sum;
    }

}
