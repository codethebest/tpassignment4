package Question3Principles.DIP.Obey;

/**
 * Created by student on 2016/04/01.
 */
public class FastCar implements CarInterface{
    private String status;
    private String start;


    public String drive(){
        status = "drives faster";
        return status;
    }


    public String ignition(){
        start = "engine start";
        return start;
    }
}
