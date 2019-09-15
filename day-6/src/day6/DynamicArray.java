package day6;/* *
@author Lea
@date 2019/9/11 
*/

public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[] {"fiddle", "de", "dum"});
    }
}


class Other{
    public static void main(String[] args) {
      for (String s : args)
          System.out.println(s + " ");
    }
}