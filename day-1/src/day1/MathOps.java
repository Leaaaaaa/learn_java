package day1;/* *
@author Lea
@date 2019/9/3 - 下午4:45
*/

import java.util.Random;

public class MathOps {
    static void prt(String s){
        System.out.println(s);
    }
    static void pint(String s, int i){
        prt(s + " = " +i);
    }
    static  void pflt(String s, float f){
        prt(s + " = " + f);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int i, j ,k;
        j = rand.nextInt()%100;
        k = rand.nextInt()%100;
        pint("j", j);
        pint("k", k);
        prt("k > j is " + (k > j));
        prt("k < j is " + (k < j));
        prt("k == j is " + (k == j));
//        prt("k && j is " + (k && j));
//        prt("k || j is " + (k || j)); can not do it ,只可用在布尔值
        i = j + k; pint("j + k: ", i);
        i = j - k; pint("j - k: ", i);
        i = k / j; pint("k / j: ", i);
        i = k * j; pint("k * j: ", i);
        i = k % j; pint("k % j: ", i);

        float u, v, w;
        v = rand.nextFloat();
        w = rand.nextFloat();
        pflt("v",v);
        pflt("w",w);
        u = v + w; pflt("v + w: ",u);
        u = v - w; pflt("v - w: ",u);
        u = v * w; pflt("v * w: ",u);
        u = v / w; pflt("v / w: ",u );
        u += v; pflt("u += v: ",u);
        u -= v; pflt("u -= v: ",u);
        u *= v; pflt("u *= v: ",u);
        u /= v; pflt("u /= v: ",u);

    }

}
