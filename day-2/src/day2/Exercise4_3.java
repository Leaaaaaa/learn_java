package day2;/* *
@author Lea
@date 2019/9/4 
*/

import java.util.Random;

public class Exercise4_3 {
    static Random random = new Random(47);

    public static void main(String[] args) {
        int a = random.nextInt();
        int b = random.nextInt();
        while (true){
            if (a > b)
                System.out.println(a + " > " + b);
            else if (a < b)
                System.out.println(a + " < " + b);
            else
                System.out.println(a + " = " + b);
            a = b;//把相邻随机数的值赋值给上一个，做到相邻的随机数比较
            b = random.nextInt();
        }
    }
}
