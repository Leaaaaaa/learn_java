package day3;/* *
@author Lea
@date 2019/9/5 
*/
class Dog{
    void bark(int i){//参数为数字时时barking
        System.out.println("barking");
    }
    void bark(String s){//参数为字符串的时候howling
        System.out.println("howling");
    }
        }
public class Exercise5_5 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark(1);
        d.bark("bark");
    }
}
