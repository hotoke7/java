package java_basic_08;

// 【問題】スケジュールを表すScheduleクラスを作成してください。

// 以下の手順に従ってクラスを作成してください
// 1．クラス作成
// 2．コンストラクタ作成
// 3．Getter/Setter作成
// 4．メソッド作成

// 1．クラス作成
// ■ 以下のフィールドを持つクラス「Schedule」を作成してください
// フィールド1：String タイトル
// フィールド2：String 場所
// フィールド3：String 日付
// フィールド4：String[] エントリー
//
// 2．コンストラクタ作成
// ■ 以下の動作をするコンストラクタを作成してください。
// 引数1：String タイトル
// 引数2：String 場所
// 引数3：String 日付
// 動作：「タイトル」「場所」「日付」フィールドに対して初期化処理を行う。
//      ※ エントリーの初期化設定は行わない。
// 返却値：なし
//
// 3．Getter/Setter作成
// フィールドの値を他クラスで操作できるように、
// 各フィールドのGetter/Setterを作成してください。
//
// 4．メソッド作成
// ■ 以下の動作をするメソッドを作成してください。
// 引数：なし
// 動作：インスタンスの内容を出力結果のように出力する。
// 返却値：なし
// 出力結果：
// 以下のスケジュールがあります。
// イベント：[title]
// 場所：[location]
// 日付：[date]
// 参加者：
// - XXXさん
// - YYYさん
// - ZZZさん
// ...
public class Schedule {
    private String title;
    private String location;
    private String date;
    private String[] entry;

    public Schedule(String title, String location, String date) {
        this.title = title;
        this.location = location;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public String[] getEntry() {
        return entry;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setEntry(String[] entry) {
        this.entry = entry;
    }

    public void summary(){
        System.out.println("以下のスケジュールがあります。");
        System.out.println("イベント：" + title);
        System.out.println("場所：" + location);
        System.out.println("日付：" + date);
        System.out.println("参加者：");
        for (int i = 0; i < entry.length; i++){
//            if (i > 0) {
//                System.out.print("、");
//            }
//            System.out.print(entry[i] + "さん");
            System.out.println("- " + entry[i] + "さん");
        }
    }
}
