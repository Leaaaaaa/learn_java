package day7;/* *
@author Lea
@date 2019/9/15 
*/

class Cleanser{
    private String s = "Cleanser";
    public void append(String a){ s += a;}
    public void dilute(){ append( " dilute()");}
    public void apply(){ append("apply()");}
    public void scrub(){ append("scrub()");}
    public String toString(){
          return  s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();  x.apply(); x.scrub();
        System.out.println(x);
    }
}

public class Detergent extends Cleanser {
    //change a method
    public void scrub(){
        append("Detergent.scrub()");
        super.scrub(); //Call base-class version
    }
    //  Add methods to the interface
    public void foam(){append( "foam()");}
    //Test new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }

}
/*
Cleanser dilute()apply()Detergent.scrub()scrub()foam()
Testing base class:
Cleanser dilute()apply()scrub()
 */
