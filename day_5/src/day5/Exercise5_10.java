package day5;/* *
@author Lea
@date 2019/9/10 
*/

class Finalize{
    boolean flag = false;

    void flagTrue() {
        flag = true;
    }

    @Override
    protected void finalize() throws Throwable { //throws是用在方法声明后面，表示再抛出异常，由该方法的调用者来处理。
        super.finalize();
        if (!flag) {//如果flag为true则报错
            System.err.println("flag is not true");

        }
    }
}

public class  Exercise5_10{
    public static void main(String[] args) {
        Finalize test = new Finalize();
        test.flagTrue();
        new Finalize();
        System.gc();
    }
}
