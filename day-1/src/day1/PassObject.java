package day1;/* *
@author Lea
@date 2019/9/3 - 下午4:41
*/

class Letter{
    char c;
}


public class PassObject {
    static void f(Letter y){
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1:x.c: " + x.c);
        f(x);
        System.out.println("2:x.c: " + x.c);

    }


}
