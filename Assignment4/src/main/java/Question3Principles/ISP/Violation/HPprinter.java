package Question3Principles.ISP.Violation;

/**
 * Created by student on 2016/03/31.
 */
public class HPprinter implements Machine{


    public String print(){
        return "Printing";
    }
    public void staple() {
        System.out.println("Stapling");
    }

    public void scan() {
        System.out.println("Scan");
    }

    public String photoCopy(){
        return "Photocopy";
    }
}
