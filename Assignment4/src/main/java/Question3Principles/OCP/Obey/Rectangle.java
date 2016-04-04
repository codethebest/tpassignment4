package Question3Principles.OCP.Obey;

/**
 * Created by student on 2016/03/31.
 */
public class Rectangle implements Shape{

    private double width;
    private double height;

    public Rectangle(){}
    public Rectangle(double width, double height){
        this.width =width;
        this.height=height;
    }

    public double getWidth(){return width;}

    public double getHeight(){
        return height;
    }

    public double calculateArea()
    {
        return width*height;
    }
}
