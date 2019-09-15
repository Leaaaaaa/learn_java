package day4;/* *
@author Lea
@date 2019/9/6 
*/

public class Leaf {
    int i = 0;
    Leaf increment(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();//通过this关键字返回了对当前对象的引用
    }
}
