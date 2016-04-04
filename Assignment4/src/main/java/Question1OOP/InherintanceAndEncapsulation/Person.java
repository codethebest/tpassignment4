package Question1OOP.InherintanceAndEncapsulation;

/**
 * Created by student on 2016/04/05.
 */
public class Person {

    private String name;
    private String surname;
    public int IdNo;

    public Person()
    {

    }

    public Person(String name, String surname,int age)
    {
        this.name = name;
        this.surname =surname;
        this.IdNo = IdNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIdNo() {
        return IdNo;
    }

    public void setIdNo(int idNo) {
        IdNo = idNo;
    }

    public String ToString ()
    {
        return "Name :" +getName()+"Surname"+getSurname()+ "ID"+getIdNo();
    }
}
