package Question3Principles.DIP.Violation;

/**
 * Created by student on 2016/04/01.
 */
public class Car {
    private String status = "";
    private String start = "";

    public String drive(){
        status = "Drive normal";
        return status;
    }

    public String ignition(){
        start = "Engine start";
        return start;
    }
}
