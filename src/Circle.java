import java.util.Scanner;

import static java.lang.Math.pow;

//superclass
public class Circle {
    //fields
    public static double radius=1.0;
    public static String color="red";
    //constructor
    Circle(){
        setRadius();
        setColor();
        getArea();
    }
    //methods
    public void setRadius(){
        System.out.print("Enter the circle radius: ");
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
    }
    public void setColor(){
        System.out.print("Enter the circle color: ");
        Scanner input = new Scanner(System.in);
        color = input.nextLine();
    }
    public double getArea(){
        double area = 3.14*pow(radius,2);
        return area;
    }

}

//subclass
class Cylinder extends Circle{
    //field
    private static double height;
    //constructor
    Cylinder(){
        setHeight();
        getVolume();
    }
    //methods
    public void setHeight(){
        System.out.print("Enter the cylinder height: ");
        Scanner input = new Scanner(System.in);
        height = input.nextDouble();
    }
    public void getVolume(){
        double volume= height*getArea();
        System.out.println("The cylinder volume is: "+volume);
    }

}
