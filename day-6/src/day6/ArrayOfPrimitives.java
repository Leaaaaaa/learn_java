package day6;/* *
@author Lea
@date 2019/9/11 
*/

public class ArrayOfPrimitives {
    public static void main(String[] args) {
        int [] a1 = {1, 2, 3, 4, 5};
        int [] a2 ;
        a2 = a1;  //a2是a1的别名
        for (int i = 0; i < a2.length; i++){
            a2[i] = a2[i] + 1;
        }
        for (int i = 0; i < a1.length; i++)
            System.out.println("a1[" + i + "]" + a1[i]);
    }
}
