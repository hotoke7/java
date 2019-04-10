package java_basic_11;

/**
 * ペットを表すクラス。
 */
public class Pet {

    /**
     * 名前
     */
    private String name;
    /**
     * 年齢
     */
    private int age;

    /**
     * コンストラクタ。
     * <p>
     * フィールドの初期化を行う。
     *
     * @param name 名前
     * @param age  年齢
     */
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 名前を返却する。
     *
     * @return 名前
     */
    public String getName() {
        return name;
    }

    /**
     * 年齢を返却する。
     *
     * @return 年齢
     */
    public int getAge() {
        return age;
    }

    /**
     * 自己紹介文を標準出力する。
     */
    public void intruduce() {
        System.out.println(name + "です。" + age + "才です。");
    }
}
