package day7;/* *
@author Lea
@date 2019/9/14 
*/


public class EnumOrder {
    enum Spiciness{
    NOT, MILD, MEDIUM, HOT, FLAMING
}
    public static void main(String[] args) {
        for(Spiciness s : Spiciness.values())
            System.out.println(s + ", ordinal " + s.ordinal());

        AutoboxingVarargs a =  new AutoboxingVarargs();
        a.f(1, 3, 5);
    }
}
/*
NOT, ordinal 0
MILD, ordinal 1
MEDIUM, ordinal 2
HOT, ordinal 3
FLAMING, ordinal 4
1
3
5
*/
