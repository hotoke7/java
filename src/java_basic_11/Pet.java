package java_basic_11;

public class Pet {
    // Lesson Java基礎⑪（Java基礎クラス）
    // コレクションActivityに使うクラスを定義します。
    private String name;

    public Pet (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep (){
        System.out.println(name + "はソファーで寝ています。");
    }
}
