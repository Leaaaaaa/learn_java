package day1;/* *
@author Lea
@date 2019/9/3 
*/

public class URShift {
    public static void main(String[] args) {
        int i = -1;
        i >>>= 10; //移位运算符
        System.out.println(i);
        long l = -1;
        l >>>= 10;
        System.out.println(l);
        short s = -1;
        s >>>= 10;
        System.out.println(s);
        byte b = -1;
        b >>>= 10;
        System.out.println(b);

    }
}
