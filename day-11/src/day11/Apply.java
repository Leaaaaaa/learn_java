package day11;/* *
@author Lea
@date 2019/9/24
*/

import javax.sound.midi.Soundbank;
import java.util.Arrays;

class Processor{
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){
        return input;
    }
}
class Upcase extends Processor{
    String process(Object input){
        return ((String) input).toUpperCase();
    }

}
class Download extends Processor{
    String process(Object input){
        return ((String)input).toLowerCase();
    }
}
class Splitter extends Processor{
    String process(Object input){
        //The split() argument divides a String into pieces
        return Arrays.toString(((String)input).split(" "));
    }
}
public class Apply {
    public static void process(Processor p, Object s){
        System.out.println("Using Process " + p.name());
        System.out.println(p.process(s));
    }
    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Download(), s);
        process(new Splitter(), s);
    }
}
/*
Using Process Upcase
DISAGREEMENT WITH BELIEFS IS BY DEFINITION INCORRECT
Using Process Download
disagreement with beliefs is by definition incorrect
Using Process Splitter
[Disagreement, with, beliefs, is, by, definition, incorrect]

 */
