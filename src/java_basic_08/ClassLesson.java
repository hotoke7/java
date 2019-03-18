package java_basic_08;

public class ClassLesson {
    public static void main(String[] args) {
        // Java基礎⑧（インスタンス、コンストラクタ）

        // 【問題】作成したDrinkSessionクラスを利用して、昨日の飲み会のサマリーを出力してみましょう。

        // 1．インスタンス作成
        // ■ 以下を参照し、DrinkSessionクラスのインスタンスを定義してください。

        // ① プロジェクト打ち上げ
        // タイトル：打ち上げ
        // 店名：焼肉ハンガン
        // 注文詳細：
        //   特上牛タン塩、1800円、4ea
        //   厚切りハラミ、1200円、5ea
        //   ボトルマッコリ、1500円、3ea
        //   冷麺、1100円、2ea
        OrderDetail[] wrapPartyDetail = {
                new OrderDetail("特上牛タン塩", 1800, 4),
                new OrderDetail("厚切りハラミ", 1200, 5),
                new OrderDetail("ボトルマッコリ", 1500, 3),
                new OrderDetail("冷麺", 1100, 2)
        };
        Receipt wrapParty = new Receipt("打ち上げ", "焼肉ハンガン", wrapPartyDetail);

        // ② 歓迎会
        // タイトル：歓迎会
        // 店名：イタリアンQuattro
        // 注文詳細：
        //   マルゲリータ、950円、2ea
        //   シチリア風ミートソースピッツァ、1200円、2ea
        //   ベーコンとチョリソーのアラビアータ、1050円、3ea
        //   トマトとツナのサラダ、800円、2ea
        //   飲み放題2h、1980円、4ea
        OrderDetail[] welcomePartyDetail = {
                new OrderDetail("マルゲリータ", 950, 2),
                new OrderDetail("シチリア風ミートソースピッツァ", 1200, 2),
                new OrderDetail("ベーコンとチョリソーのアラビアータ", 1050, 3),
                new OrderDetail("トマトとツナのサラダ", 800, 2),
                new OrderDetail("飲み放題2h", 1980, 4),
        };
        Receipt welcomeParty = new Receipt("歓迎会", "イタリアンQuattro", welcomePartyDetail);

        // ■ 二つのインスタンスを一回の操作で確認するため、配列を宣言してインスタンスを収納してください。
        Receipt[] receipts = {wrapParty, welcomeParty};

        // 2．インスタンスの値取得＆メソッド呼び出し
        // ■ 各インスタンスの内容を取得し、標準出力してください。
        // 以下の内容を出力してください。
        // 出力結果：
        // タイトル：打ち上げ
        // 場所：焼肉ハンガン
        // 総額：19900円
        // ======================================
        // タイトル：歓迎会
        // 場所：イタリアンQuattro
        // 総額：16970円
        // ======================================
        for (int i = 0; i < receipts.length; i++) {
            Receipt receipt = receipts[i];
            System.out.println("タイトル：" + receipt.getTitle());
            System.out.println("場所：" + receipt.getShopName());
            System.out.println("総額：" + receipt.getTotalPrice() + "円");
            System.out.println("======================================");
        }
    }
}
