public class OOPS{
    public static void main(String args[]){   // byconvention, name function should be static as well as public
    Pen p1 = new Pen();  //craeted a pen object called P1
    p1.setColor("Blue");
    System.out.println(p1.color);   // to access the properties/functions of an object, use . operator
   
    p1.color = "yellow";
    System.out.println(p1.color);
    
    
    p1.setTip(5);
    System.out.println(p1.tip);
    }

}

class Pen{
//properties
String color;
int tip;
//functions
void setColor(String newColor){
    color = newColor;
}

void setTip(int newTip){
    tip = newTip;
}


class Student{
    String name;
    int age;
    float percentage;
    
    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
    }
}

}