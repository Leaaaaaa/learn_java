package day3;/* *
@author Lea
@date 2019/9/5 
*/
class Student{
    Student(){
        System.out.println("this is a constructor");
    }
    Student(String s){
        System.out.println(("this is constructor:" + s));
    }
}
public class Exercise5_3 {
    public static void main(String[] args) {
        Student s = new Student();
        Student s2 = new Student("student 2");

    }
}
