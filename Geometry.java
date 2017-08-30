
/**
 * Write a description of class Geometry here.
 * 
 * @author Carrington Jones
 * @version August 30, 2017
 */
public class Geometry 
{
    /**
     * Returns the area of a triangle
     * @param base of a triangle
     * @param height of a triangle
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    /**
     * Returns the area of a rectangle
     * @param length of a rectangle
     * @param width of a rectangle
     */
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    /**
     * Returns the volume for a sphere
     * @param radius of a sphere
     */
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    /** Returns the area of a parallelogram 
     * @param base of a parallelogram
     * @param height of a parallelogram
     */
    public static double parallelogramArea(double base, double height)
    {
        double area = base * height;
        return area;
    }
    /** Returns the area of a trapezoid
     * @param length side a of a trapezoid
     * @param length side b of a trapezoid
     * @param height of a trapezoid
     */
    public static double trapezoidArea(double a, double b, double height)
    {
        double area = ((a + b ) / 2.0) * height;
        return area; 
    }
    /** Returns the volume of a rectangular prism
     * @param length of a rectangular prism
     * @param width of a rectangular prism 
     * @param height of a rectangular prism
     */
    public static double rectangularprismVolume(double length, double width, double height)
    {
        return length * width * height;
    }
    /** Returns the volume of a cone
     * @param radius of a cone
     * @param height of a cone
     */
    public static double coneVolume(double radius, double height)
    {
        return Math.PI * Math.pow(radius, 2) * height / 3.0; 
    }
    /** Returns the surface area of a rectangular prism
     * @param length of a rectangular prism
     * @param width of a rectangular prism 
     * @param height of a rectangular prism
     */
    public static double rectangularprismSurfaceArea(double length, double width, double height)
    {
        double area = 2.0 *((width * length) + (height * length) + (height * width));
        return area;
    }
    /** Returns the surface area of a sphere
     * @param radius of a sphere
     */
    public static double sphereSurfaceArea(double radius)
    {
        double area = 4.0 * Math.PI * Math.pow(radius, 2);
        return area;
    }
    /** Where everything is added together and named
     * 
     */
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println("Triangle #1 Area: " + ta1);
        System.out.println("Triangle #2 Area: " + ta2);
        
        double ra1 = rectangleArea(5.2, 9.3);
        System.out.println("Rectangle Area: " + ra1);
        
        double sa1 = sphereVolume(6);
        System.out.println("Sphere Volume: " + sa1);
        
        double pa1 = parallelogramArea(7, 12);
        System.out.println("Parallelogram Area: " + pa1);
        
        double tra1 = trapezoidArea(6, 10, 12);
        System.out.println("Trapezoid Area: " + tra1); 
        
        double rectp1 = rectangularprismVolume(6, 4, 12);
        System.out.println("Rectangular Prism Volume: " + rectp1);
        
        double co1 = coneVolume(5, 10);
        System.out.println("Cone Volume: " + co1);
        
        double recpsa1 = rectangularprismSurfaceArea(10, 5, 9);
        System.out.println("Rectangular Prism Surface Area: " + recpsa1);
        
        double spsa1 = sphereSurfaceArea(6);
        System.out.println("Sphere Surface Area: " + spsa1); 
    }
}
