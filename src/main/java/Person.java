import lombok.Data;
@Data
public class Person {

    private String name;
    private String lastname ;
    private int age;


    public Person(String name, String lastname, int age){
        this.age = age;
        this.lastname = lastname;
        this.name = name;
    }
}
