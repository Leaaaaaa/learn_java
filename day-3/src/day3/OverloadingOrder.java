package day3;/* *
@author Lea
@date 2019/9/5 
*/
import static net.mindview.util.Print.*;


public class OverloadingOrder {
    static void f(String s, int i){
        print("String: " + i + ", int : " + i);
    }
    static void f(int i, String s){
        print("int: " + i + "String: " + s);
    }

    public static void main(String[] args) {
        f("String first",11);
        f(10,"String second");
    }
}
