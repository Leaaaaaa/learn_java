package day13;/* *
@author Lea
@date 2019/10/5 
*/

import javax.xml.transform.Source;

public class Exception {
    public static void f(){
        int[] a =new int[10];
        a[10] = 10;
        System.out.println("hello");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("catch");
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();

        }
        System.out.println("main");
    }
}
