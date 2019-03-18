package java_basic_09;

public class Pet {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void sleep (){
        System.out.println(name + "は寝ています。");
    }

    public void eat (){
        System.out.println(name + "は餌を食べています。");
    }

    public void play (){
        System.out.println(name + "は遊んでいます。");
    }
}
