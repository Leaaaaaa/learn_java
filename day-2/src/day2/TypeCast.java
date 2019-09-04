package day2;/* *
@author Lea
@date 2019/9/4 
*/

public class TypeCast {
    public static void main(String[] args) {
        int i = 200;
        long l = (long)i;
        System.out.println(l);
        l = i;//"Widening"so cast not really required
        long l2 = (long)200;
        System.out.println(l2);
        l2 = 200;
        //A "narrowing conversion":
        i = (int)l2;
        System.out.println(i);

    }
}
