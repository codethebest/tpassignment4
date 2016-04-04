package Question2;

/**
 * Created by student on 2016/04/05.
 */
public class ImplementationCheck {

    public static void main (String [] args)
    {
        Person person = new Person("Liyolo","Khayelitsha",12);
        Student student = new Student("liolo",person);
        System.out.print(student.getStudent());
    }
}
