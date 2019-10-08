package day13;/* *
@author Lea
@date 2019/10/7 
*/

public class BasicThreads {
    public static void main(String[] args) {
       Thread t = new Thread(new LiftOff());
        t.start();
       System.out.println("--------------");
//        for (int i = 0; i < 5 ; i++){
//            new Thread(new LiftOff()).start();
//        }
        System.out.println("Waiting for liftoff()");
    }
}
