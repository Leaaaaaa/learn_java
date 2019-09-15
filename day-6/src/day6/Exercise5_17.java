package day6;/* *
@author Lea
@date 2019/9/11 
*/
class Obj{
    Obj(String [] args){
        for(String s : args)
            System.out.println(s);
    }
}
public class Exercise5_17 {
    public static void main(String[] args) {
        String s[] = new String[5];
        s[0] = "o.";
        s[1] = "a.";
        s[2] = "b.";
        s[3] = "c.";
        Obj obj = new Obj(s);


    }
}
