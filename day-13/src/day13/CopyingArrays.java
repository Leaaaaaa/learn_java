package day13;/* *
@author Lea
@date 2019/10/8 
*/

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] i =new int[15];
        int[] j =new int[15];
        Arrays.fill(i,47);
//        for(int num: i)
//            System.out.print(num+" ");

        Arrays.fill(j,99);
//        for(int num: j)
//            System.out.print(num+" ");
        System.arraycopy(i, 0, j, 0, i.length);
//        for(int num:j )
//            System.out.print(num+" ");
        int[] k = new int[10];
        Arrays.fill(k, 103);
        System.arraycopy(i , 2, k, 2, k.length-2);
        for(int num: k)
            System.out.print(num+" ");
        Arrays.fill(k, 103);
        System.out.println();
        System.arraycopy(k, 0, i, 1, k.length);
        for(int num: k)
            System.out.print(num+" ");
        Integer[] u = new Integer[10];
        Integer[] v = new Integer[5];
        Arrays.fill(u, new Integer(47));
//        Arrays.fill(v, new Integer(99));


    }
}
