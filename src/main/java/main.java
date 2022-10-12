import java.util.*;

public class main {
    public static void main(String[] args) {
       List<Person> people = Arrays.asList(
               new Person("Charles","Dickens", 60),
               new Person("Lewis","Carol", 56),
               new Person("Reed", "Richards", 43),
               new Person("Thomas", "Engine", 23));


       Collections.sort(people, new Comparator<Person>() {
           @Override
           public int compare(Person o1, Person o2) {
               return o1.getLastname().compareTo(o2.getLastname());
           }
       });

        Collections.sort(people, (p1, p2) ->{ // because youre using people list java knows p1 and p2 are of type person
            return p1.getLastname().compareTo(p2.getLastname());
        });

        //printAll(people);
        beginWithC(people);

    }

    private static void beginWithC(List<Person> people) {
        for (Person p: people ) {
            if(p.getLastname().startsWith("C")){ //or do charAt(0) == 'C'
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> people) {

        for (Person p:people) {
            System.out.println(p);
        }
    }


}
