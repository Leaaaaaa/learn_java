package day9_music;/* *
@author Lea
@date 2019/9/17 
*/

public class Music {
    public static void tune(Instrument i){
        //...
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed stringed = new Stringed();
        tune(flute); //Upcasting
        tune(stringed);
    }
}
/*
Wind.play()MIDDLE_C
Stringed.play()MIDDLE_C
 */