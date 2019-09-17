package day8;/* *
@author Lea
@date 2019/9/17 
*/
//向上转型
class Instrument{
    public void play(){}
    static void tune(Instrument i){
        // ...
        i.play();
    }
}
//Wind objects are instruments
//because they have the same interface
public class  Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); //upcasting
    }
}
