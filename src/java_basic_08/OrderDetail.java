package java_basic_08;

/**
 * レシートの注文詳細を表すクラス
 */
public class OrderDetail {
    private String productName;
    private int price;
    private int quantity;

    /**
     * 各フィールドに対して、受け取った引数で初期化処理を行う。
     *
     * @param productName 品名
     * @param price       値段
     * @param quantity    数量
     */
    public OrderDetail(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * 品名を返却する。
     *
     * @return 文字列 品名
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 値段を返却する。
     *
     * @return 整数型 値段
     */
    public int getPrice() {
        return price;
    }

    /**
     * 数量を返却する。
     *
     * @return 整数型 数量
     */
    public int getQuantity() {
        return quantity;
    }
}
