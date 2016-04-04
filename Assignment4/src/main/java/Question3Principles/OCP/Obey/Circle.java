package Question3Principles.OCP.Obey;

/**
 * Created by student on 2016/03/31.
 */
public class Circle implements Shape{
    private double radius;

    public Circle(double rad){this.radius=rad;}
    public Circle(){}
    public double getRadius(){
        return radius;
    }
    public double calculateArea() {return radius*radius*Math.PI;}
}
