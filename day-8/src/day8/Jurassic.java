package day8;/* *
@author Lea
@date 2019/9/17 
*/

import javax.security.auth.kerberos.KerberosCredMessage;

class SmallBrain{}
final class Dinosaur{
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f(){}
}
//! class Further extends Dinosaur{} //error cannot extend final class
public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j ++;
    }
}
