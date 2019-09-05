package day3;/* *
@author Lea
@date 2019/9/5 
*/

class StringPractice2{
    String a = "1";
    String b = null;

    public StringPractice2(String c){
        System.out.print("a = " + a + "\n");
        System.out.print("b = " + b + "\n");
        this.b = c;
        System.out.print("b = " + b + "\n");
    }
}

public class Exercise5_2 {
    public static void main(String[] args) {
        StringPractice2 a = new StringPractice2("2");//参数优先于构造器
    }

}
