package day9_music;/* *
@author Lea
@date 2019/9/17 
*/
class Stringed extends Instrument{
    public void play(Note n){
        System.out.println("Stringed.play()" + n);
    }
}
class Brass extends Instrument{
    public void play(Note n){
        System.out.println("Brass.play()" + n);
    }
}


