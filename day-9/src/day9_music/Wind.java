package day9_music;/* *
@author Lea
@date 2019/9/17 
*/

public class Wind extends Instrument {
    //Redefine interface method:
    public void play(Note n){
        System.out.println("Wind.play()" + n );
    }
}

