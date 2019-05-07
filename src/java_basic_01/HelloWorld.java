package java_basic_01;
import java.util.Scanner;
/**
 * Lesson Java基礎①（標準出力）
 * <p>
 * 【問題】
 * 標準出力してください。
 */
public class HelloWorld {

//    public static void main(String[] args){
//        System.out.println(sub("麦わら"));
//    }
//    public static String sub(String pirate){
//        return (pirate + "海賊団");
//    }
//    // ■ "Hello World"を標準出力してください。
////    public static void main (String[] args){
////        System.out.println("Hello Rakuten!");
////    }
    public static void main(String[] args){
        System.out.println("I will square your fav num! \n Type it here↓");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int output = cal(input);
        System.out.println(output);

    }
    public static int cal(int num){
        return num * num;
    }
}




