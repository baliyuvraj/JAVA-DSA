import java.util.*;
public class AreaOfCircle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius : ");
        double rad = sc.nextDouble();
        double area = AreaOfCircle(rad);
        double circumference = CircumferenceOfCircle(rad);
        System.out.println("area of circle is " + area);
        System.out.println("circumference of circle is " + circumference);

    }
    static double AreaOfCircle(double rad){
        double area = 3.14 * rad * rad ;
        return area;
    }

    static double CircumferenceOfCircle(double rad){
        double circumference = 2 * 3.14 * rad ; 
        return circumference ; 
    }

}