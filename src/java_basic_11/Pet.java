package java_basic_11;

public class Pet {
    // Lesson Java基礎⑪（Java基礎クラス）
    // コレクションActivityに使うクラスを定義します。
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void intruduce() {
        System.out.println(name + "です。" + age + "才です。");
    }
}
