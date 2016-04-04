package Question3Principles.OCP.Violation;

/**
 * Created by student on 2016/03/31.
 */
public class ShapeAreaCalcuater {

    private double area;
    private Rectangle rectangle;
    private Circle circle;

    public void setRectangle(Rectangle rectangle){
        this.rectangle=rectangle;
    }

    public void setCircle(Circle circle){
        this.circle=circle;
    }

    public double calculateArea(Object shape)
    {
        if (shape.getClass().isInstance(rectangle)){
                rectangle = (Rectangle) shape;
                area += rectangle.getWidth()*rectangle.getHeight();
         }
        else
        {
            circle = (Circle)shape;
            area += circle.getRadius() * circle.getRadius() * Math.PI;
        }
        return area;
    }


}
