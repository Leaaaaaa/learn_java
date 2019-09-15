package day7;/* *
@author Lea
@date 2019/9/15 
*/
class Plate{
    Plate(int i){
        System.out.println("Plate constructor " +i);
    }
}
class DinnerPlate extends Plate{
    DinnerPlate(int i){
        super(i);
        System.out.println("DinnerPlate constructor " + i);
    }
}
class Utensil{
    Utensil(int i){
        System.out.println("Utensil constructor " + i);
    }
}
class  Spoon extends Utensil{
    Spoon(int i){
        super(i);
        System.out.println("Spoon constructor " + i);
    }
}
class Fork extends Utensil{
    Fork(int i){
        super(i);
        System.out.println("Fork constructor " + i);
    }
}
class Knife extends Utensil{
    Knife(int i){
        super(i);
        System.out.println("Knife constructor " + i);
    }
}
class Custom{
    Custom(int i){
        System.out.println("Custom constructor " + i);
    }
}
public class PlaceSetting extends Custom{
    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl;
    public PlaceSetting(int i){
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        System.out.println("PlaceSetting constructor");

    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(5);
    }
}
/*
Custom constructor 6
Utensil constructor 7
Spoon constructor 7
Utensil constructor 8
Fork constructor 8
Utensil constructor 9
Knife constructor 9
Plate constructor 10
DinnerPlate constructor 10
PlaceSetting constructor

Process finished with exit code 0*/