package day2;/* *
@author Lea
@date 2019/9/4 
*/

public class Exercise4_4 {
    public static void main(String[] args) {
        int i,j;
        for (i = 2;i < 100;i++){
            for (j = 2; j <= i; j++ ){
                if(i%j==0)
                    break;
            }
            if(i == j)
                System.out.println(i+"是素数");
        }
    }
}
