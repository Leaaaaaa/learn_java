package day7;/* *
@author Lea
@date 2019/9/14 
*/

public class AutoboxingVarargs {
    public static void f(Integer...args){
        for (Integer i : args){
            System.out.println( i + " ");
        }
                       System.out.println();
    }

    public static void main(String[] args) {
        f(new Integer(1), new Integer(2));
        f(4, 5, 6, 7, 8, 9);
        f(10, new Integer(11), new Integer(12));
    }
}
/*
1
2

4
5
6
7
8
9

10
11
12

 */