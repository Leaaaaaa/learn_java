package day11;/* *
@author Lea
@date 2019/9/25 
*/

public class Innerclasses_Dotnew {
    public class Inner{
        Inner(){
            System.out.println("inner");
        }
    }
    class Contents{
        private  int i = 11;
        public int value(){
            return i;
        }

    }

    public static void main(String[] args) {
        Innerclasses_Dotnew dn = new Innerclasses_Dotnew();
        Innerclasses_Dotnew.Inner dni = dn.new Inner();//通过外部类去创建其某个内部类的对象
        Innerclasses_Dotnew.Contents c = dn.new Contents();
    }
}
