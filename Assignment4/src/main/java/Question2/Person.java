package Question2;

/**
 * Created by student on 2016/04/05.
 */
public class Person {
    public String name ;
    public String Address;
    public int age;

    public Person()
    {

    }
    public Person (String name , String adress,int age)
    {
        this.name = name;
        this.Address = adress;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
