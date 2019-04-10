package java_basic_08;

/**
 * レシートの注文詳細を表すクラス。
 */
public class OrderDetail {

    /**
     * 品名
     */
    private String productName;
    /**
     * 値段
     */
    private int price;
    /**
     * 数量
     */
    private int quantity;

    /**
     * コンストラクタ。
     * <p>
     * フィールドの初期化処理を行う。
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
     * @return 品名
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 値段を返却する。
     *
     * @return 値段
     */
    public int getPrice() {
        return price;
    }

    /**
     * 数量を返却する。
     *
     * @return 数量
     */
    public int getQuantity() {
        return quantity;
    }
}
