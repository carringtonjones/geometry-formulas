
/**
 * Write a description of class Geometry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    public static double parallelogramArea(double base, double height)
    {
        double area = base * height;
        return area;
    }
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println("Triangle #1 Area: " + ta1);
        System.out.println("Triangle #2 Area: " + ta2);
        
        double ra1 = rectangleArea(5.2, 9.3);
        System.out.println("Rectangle Area: " + ra1);
        
        double pa1 = parallelogramArea(7,12);
        System.out.println("Parallelogram Area: " + pa1);
        
        
    }
}
