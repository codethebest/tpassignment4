package Question3Principles.ISP.Obey;

/**
 * Created by student on 2016/03/31.
 */
public class HPprinter implements PhotoCopy,Printer{

    public String print(){
        return "Printing";
    }

    public String photocopy(){
        return "Photocopy";
    }
}
