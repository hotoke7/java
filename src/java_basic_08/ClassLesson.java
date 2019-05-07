package java_basic_08;

/**
 * Java基礎⑧（インスタンス、コンストラクタ）
 * <p>
 * 【問題】
 * 作成したレシートクラスを利用して、レシートの内容を出力してください。
 */
public class ClassLesson {

    /**
     * 処理を実行するためのメインメソッド。
     *
     * @param args -
     */
    public static void main(String[] args) {
        // 1．インスタンス作成
        // ■ 以下の内容のレシートクラスのインスタンスを生成してください。
//        OrderDetail[] yakinikuA = {new OrderDetail("特上牛タン塩" , 1800, 4)};
//        OrderDetail[] yakinikuB = {new OrderDetail("厚切りハラミ" , 1200, 5)};
//        OrderDetail[] yakinikuC = {new OrderDetail("ボトルマッコリ" , 1500, 3)};
//        OrderDetail[] yakinikuD = {new OrderDetail("冷麺" , 1100, 2)};

        OrderDetail[] yakinikuMenu = {
                new OrderDetail("特上牛タン塩" , 1800, 4),
                new OrderDetail("厚切りハラミ" , 1200, 5),
                new OrderDetail("ボトルマッコリ" , 1500, 3),
                new OrderDetail("冷麺" , 1100, 2),

        };

        OrderDetail[] italianMenu = {
                new OrderDetail("マルゲリータ", 950, 2),
                new OrderDetail("シチリア風ミートソースピッツァ", 1200, 2),
                new OrderDetail("ベーコンとチョリソーのアラビアータ", 1050, 3),
                new OrderDetail("トマトとツナのサラダ", 800, 2),
                new OrderDetail("飲み放題2h", 1980, 4)
        };
        //   マルゲリータ、950円、2人前
        //   シチリア風ミートソースピッツァ、1200円、2人前
        //   ベーコンとチョリソーのアラビアータ、1050円、3人前
        //   トマトとツナのサラダ、800円、2人前
        //   飲み放題2h、1980円、4人前

        Receipt yakiniku = new Receipt(
                "焼肉ソナム",
                "自由が丘",
                yakinikuMenu
        );

        Receipt italian = new Receipt(
                "イタリアンQuattro",
                "二子玉川",
                italianMenu
        );

        // ① 焼肉
        // 店名：焼肉ソナム
        // 場所：自由が丘
        // 注文詳細：
        //   特上牛タン塩、1800円、4人前
        //   厚切りハラミ、1200円、5人前
        //   ボトルマッコリ、1500円、3人前
        //   冷麺、1100円、2人前


        // ② イタリアン
        // 店名：イタリアンQuattro
        // 場所：二子玉川
        // 注文詳細：


        // 3．メソッド呼び出し
        // ■ 作成したメソッドを呼び出してください。
        // インスタンス①、②を順番に引数として挿入してください。
        System.out.println("店名："+ yakiniku.getShopName());
        System.out.println("場所："+ yakiniku.getShopAddress());
        System.out.println("総額："+ (String.format("%,d", yakiniku.getTotalPrice()))+ "円");
        System.out.println("\n");
        System.out.println("店名："+ italian.getShopName());
        System.out.println("場所："+ italian.getShopAddress());
        System.out.println("総額："+ (String.format("%,d", italian.getTotalPrice()))+ "円");


    }

    // 2. メソッド作成
    // ■ 以下の動作をするメソッドを作成してください。
    /**
     * レシートの内容を標準出力する。
     * <p>
     * 出力結果（例）：
     * 店名：焼肉ソナム
     * 場所：自由が丘
     * 総額：19900円
     * ======================================
     *
     * @param receipt Receiptクラスのインスタンス
     */


}
