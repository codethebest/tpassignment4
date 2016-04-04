package Question3Principles.DIP.Obey;

/**
 * Created by student on 2016/04/01.
 */
public class Car implements CarInterface{
    private String status;
    private String start;


    public String drive(){
        status = "drives normal";
        return status;
    }


    public String ignition(){
        start = "engine start";
        return start;
    }
}
