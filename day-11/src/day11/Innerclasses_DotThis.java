package day11;/* *
@author Lea
@date 2019/9/25 
*/

public class Innerclasses_DotThis {
    void f(){
        System.out.println("DotThis.f()");
    }
    public class Inner{
        public Innerclasses_DotThis outer(){
            return Innerclasses_DotThis.this; //A plain "this" would be Inner's "this"
            //生成对外部类对象的引用
        }
    }
    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Innerclasses_DotThis dt = new Innerclasses_DotThis();
        Innerclasses_DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
/*
DotThis.f()
 */