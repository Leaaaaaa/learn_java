package day1;/* *
@author Lea
@date 2019/9/3 - 下午4:35
*/
class Number{
    int i;
}

public class Assignment {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 20;
        n2.i = 30;
        System.out.println("n1.i = " + n1.i + "n2.i = " + n2.i);
        n1 = n2;
        System.out.println("n1.i = " + n1.i + "n2.i = " + n2.i);
        n2.i = 12;
        System.out.println("n1.i = " + n1.i + "n2.i = " + n2.i);

    }
}
