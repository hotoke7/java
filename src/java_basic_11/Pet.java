package java_basic_11;

/**
 * ペットを表すクラス
 */
public class Pet {
    // Lesson Java基礎⑪（Java基礎クラス）
    // コレクションActivityに使うクラスを定義します。
    private String name;
    private int age;

    /**
     * 各ィールドに対して、受け取った引数で初期化処理を行う。
     *
     * @param name 名前
     * @param age  年齢
     */
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 名前を返却するメソッド。
     *
     * @return 文字列 名前
     */
    public String getName() {
        return name;
    }

    /**
     * 年齢を返却するメソッド。
     *
     * @return 文字列 年齢
     */
    public int getAge() {
        return age;
    }

    /**
     * 名前と年齢含む文字列を標準出力するメソッド。
     */
    public void intruduce() {
        System.out.println(name + "です。" + age + "才です。");
    }
}
