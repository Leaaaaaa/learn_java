package day3;/* *
@author Lea
@date 2019/9/5 
*/

class Rock{
    Rock(){ //This is the construcor
        System.out.println("Rock");
    }
}

class Rock2{
    Rock2(int i ){
        System.out.println("Rock " + i);

    }

}

public class SimpleConstructor {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i ++){
            new Rock();
            new Rock2(i);
        }

    }
}
