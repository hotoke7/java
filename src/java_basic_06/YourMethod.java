package java_basic_06;

public class YourMethod {
    // Lesson Java基礎⑥（メソッド）

    // ■ 果物を引数として一つもらったらペンを指して返すメソッドを作成してください。
    public String addPen(String fruit) {
        return fruit + " pen!";
    }

    // ■ 果物を引数として二つもらったらペンを指して返すメソッドを作成してください。
    public String addPen(String fruit1, String fruit2) {
        return "Pen-" + fruit1 + "-" + fruit2 + "-pen!";
    }
}
