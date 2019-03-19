package java_basic_08;

public class ClassLesson {
    public static void main(String[] args) {
        // Java基礎⑧（インスタンス、コンストラクタ）

        // 【問題】作成したレシートクラスを利用して、レシートの内容を出力してみましょう。

        // 1．インスタンス作成
        // ■ 以下を参照し、レシートクラスのインスタンスを定義してください。

        // ① 焼肉
        // 店名：焼肉ソナム
        // 場所：自由が丘
        // 注文詳細：
        //   特上牛タン塩、1800円、4人前
        //   厚切りハラミ、1200円、5人前
        //   ボトルマッコリ、1500円、3人前
        //   冷麺、1100円、2人前
        OrderDetail[] yakinikuDetail = {
                new OrderDetail("特上牛タン塩", 1800, 4),
                new OrderDetail("厚切りハラミ", 1200, 5),
                new OrderDetail("ボトルマッコリ", 1500, 3),
                new OrderDetail("冷麺", 1100, 2)
        };
        Receipt yakiniku = new Receipt("焼肉ハンガン", "自由が丘", yakinikuDetail);

        // ② イタリアン
        // 店名：イタリアンQuattro
        // 場所：二子玉川
        // 注文詳細：
        //   マルゲリータ、950円、2人前
        //   シチリア風ミートソースピッツァ、1200円、2人前
        //   ベーコンとチョリソーのアラビアータ、1050円、3人前
        //   トマトとツナのサラダ、800円、2人前
        //   飲み放題2h、1980円、4人前
        OrderDetail[] italianDetail = {
                new OrderDetail("マルゲリータ", 950, 2),
                new OrderDetail("シチリア風ミートソースピッツァ", 1200, 2),
                new OrderDetail("ベーコンとチョリソーのアラビアータ", 1050, 3),
                new OrderDetail("トマトとツナのサラダ", 800, 2),
                new OrderDetail("飲み放題2h", 1980, 4),
        };
        Receipt italian = new Receipt("イタリアンQuattro", "二子玉川", italianDetail);

        // 3．メソッド呼び出し
        // ■ 作成したメソッドを呼び出してください。
        // インスタンス①、②を順番に引数として挿入してください。
        summary(yakiniku);
        summary(italian);
    }

    // 2. メソッド作成
    // ■ 以下の動作をするメソッドを作成してください。
    // 引数1：Receipt
    // 動作：レシートの店名・場所・総額を標準出力する。
    // 返却値：なし
    // 出力結果：
    //   店名：焼肉ハンガン
    //   場所：自由が丘
    //   総額：19900円
    //   ======================================
    public static void summary(Receipt receipt) {
        System.out.println("店名：" + receipt.getShopName());
        System.out.println("場所：" + receipt.getAddress());
        System.out.println("総額：" + receipt.getTotalPrice() + "円");
        System.out.println("======================================");
    }
}
