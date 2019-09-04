package day2;/* *
@author Lea
@date 2019/9/4 
*/
import static net.mindview.util.Print.*;
public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z";
        print(s + x + y + z );
        print(x + " " + s); //converts x to a string
        s += "(summed) = "; //concatenation operator
        print(s + (x + y + z));
        print("" + x ); //shorthand for integer.tostring()


    }
}
