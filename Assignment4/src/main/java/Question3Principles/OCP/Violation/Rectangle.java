package Question3Principles.OCP.Violation;

/**
 * Created by student on 2016/03/31.
 */
public class Rectangle {

    private double width;
    private double height;

    public void setWidth(double width){
        this.width=width;
    }

    public void setHeight(double height){
        this.height=height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }
}
