package day3;/* *
@author Lea
@date 2019/9/5 
*/
import static net.mindview.util.Print.*;

class Tree{
    int height;
    Tree(){
        print("Planting a seedling");
        height = 0;
    }
    Tree(int initialHeight){
        height = initialHeight;
        print("Creating new Tree that is " + height + " feet tall");
    }
    void info(){
        print("Tree is " + height + " feet tall");
    }
    void info(String s){
        print(s + "Tree is " + height +" feet tall");
    }

}
public class OverLoading {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");//overload method
        }
        new Tree();//overload constructor
    }
}
