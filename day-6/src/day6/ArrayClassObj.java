package day6;/* *
@author Lea
@date 2019/9/11 
*/

import java.util.Arrays;
import java.util.Random;

public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);
        for (int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(500); //Autoboxing
        System.out.println(Arrays.toString(a)); //Array.toString 是数组输出
    }
}
