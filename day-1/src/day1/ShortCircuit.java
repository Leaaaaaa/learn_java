package day1;/* *
@author Lea
@date 2019/9/3 
*/

public class ShortCircuit {
    static boolean test1(int val){
        System.out.println("test1(" + val +")");
        System.out.println("result: " + (val < 1));
        return val < 1;
    }

    static boolean test2(int val){
        System.out.println("test2(" + val + ")");
        System.out.println("result: " + (val < 2));
        return val < 2;
    }

    static boolean test3(int val){  // test3会被短路，因为 test1 && test2 is false，不需要继续算了
        System.out.println("test3(" + val + ")");
        System.out.println("result: " + (val < 3));
        return val < 3;
    }

    public static void main(String[] args) {
        if (test1(0) && test2(2) && test3(2))
            System.out.println("expression is true");
        else
            System.out.println("expression is false");
    }
}
