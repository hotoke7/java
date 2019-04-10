package java_basic_08;

/**
 * レシートを表すクラス。
 */
public class Receipt {

    /** 店名 */
    private String shopName;
    /** 住所 */
    private String address;
    /** 注文詳細配列 */
    private OrderDetail[] orderDetail;

    /**
     * コンストラクタ。
     * <p>
     * フィールドの初期化処理を行う。
     *
     * @param shopName    店名
     * @param address     住所
     * @param orderDetail 注文詳細
     */
    public Receipt(String shopName, String address, OrderDetail[] orderDetail) {
        this.shopName = shopName;
        this.address = address;
        this.orderDetail = orderDetail;
    }

    /**
     * 店名を返却する。
     *
     * @return 店名
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 住所を返却する。
     *
     * @return 住所
     */
    public String getAddress() {
        return address;
    }

    /**
     * 注文詳細を返却する。
     *
     * @return 注文詳細
     */
    public OrderDetail[] getOrderDetail() {
        return orderDetail;
    }

    /**
     * すべての注文詳細の総額を計算して返却する。
     *
     * @return 注文詳細の総額
     */
    public int getTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < orderDetail.length; i++) {
            OrderDetail detail = orderDetail[i];
            totalPrice += detail.getPrice() * detail.getQuantity();
        }
        return totalPrice;
    }
}
