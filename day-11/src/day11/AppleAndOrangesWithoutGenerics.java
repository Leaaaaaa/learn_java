package day11;/* *
@author Lea
@date 2019/9/25 
*/

import java.lang.reflect.Array;
import java.util.ArrayList;

class Apple{
    private static long counter;
    private final long id = counter++;
    public long id(){
        return id;
    }
}
class Orange{}
class GeannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}
public class AppleAndOrangesWithoutGenerics {
    //@SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
       /*
        for (int i = 0; i < 3; i++)
        apples.add(new Apple());
        //not prevented from adding an Orange to apples
        //apples.add(new Orange());
        for(int i = 0; i < apples.size(); i++)
            System.out.println(apples.get(i).id());
        for (Apple c : apples)
            System.out.println(c.id());
        */
       apples.add(new GeannySmith());
       apples.add(new Gala());
       apples.add(new Fuji());
       apples.add(new Braeburn());
       for(Apple c : apples)
           System.out.println(c);
    }
}
/*
0
1
2
0
1
2

 */
/*
day11.GeannySmith@681a9515
day11.Gala@3af49f1c
day11.Fuji@19469ea2
day11.Braeburn@13221655

 */