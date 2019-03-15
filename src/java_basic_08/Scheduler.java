package java_basic_08;

public class Scheduler {
    public static void main(String[] args) {
        // Java基礎⑧（インスタンス、コンストラクタ）

        // 【問題】作成したScheduleクラスを利用して、スケジュールを管理してみましょう。

        // 以下の手順に従って機能を作成してください
        // 1．インスタンス作成
        // 2．インスタンスの値変更
        // 3．インスタンスの値変更
        // 4．インスタンスのメソッド呼び出し

        // 1．インスタンス作成
        // 以下の通り、Schedulekクラスのインスタンスを定義してください。
        // ハイキング、富士山、6月22日
        // プロジェクト打ち上げ、二子玉川、未定
        // 温泉旅行、未定、11月16日
        Schedule hiking = new Schedule("ハイキング", "富士山", "6月22日");
        Schedule wrapParty = new Schedule("プロジェクト打ち上げ", "二子玉川", "未定");
        Schedule hotSpringTrip = new Schedule("温泉旅行", "未定", "11月16日");

        // 2．インスタンスに値追加
        // 参加者が決まりましたので、以下の内容を各インスタンスのエントリーフィールドに入れてください。
        // ハイキング：鈴木、黒田、川口"
        // プロジェクト打ち上げ：鈴木、樋口、福本、山田
        // 温泉旅行：近藤、金沢
        // Hint：配列の初期化は以下のような形で宣言できます。
        // 型名 配列変数名[] = {値1, 値2, ... };
        String[] hikingEntry = {"鈴木", "黒田", "川口"};
        String[] wrapPartyEntry = {"鈴木", "樋口", "福本", "山田"};
        String[] hotSpringTripEntry = {"近藤", "金沢"};

        hiking.setEntry(hikingEntry);
        wrapParty.setEntry(wrapPartyEntry);
        hotSpringTrip.setEntry(hotSpringTripEntry);

        // 3．インスタンスの値変更
        // 各予定にて未定となっていた部分が決まりました。
        // 以下の内容に従い、該当するインスタンスに値を設定してください。
        // ・プロジェクト打ち上げの日付が「7月5日」に決まりました。
        // ・温泉旅行の場所を群馬県に決めました。
        wrapParty.setDate("7月5日");
        hotSpringTrip.setLocation("群馬県");

        // 4．インスタンスのメソッド呼び出し
        // 入力したスケジュールを確認してみましょう。
        // Appointmentクラスで作成したメソッドを、各インスタンスから呼び出してください。
        hiking.summary();
        wrapParty.summary();
        hotSpringTrip.summary();
    }
}
