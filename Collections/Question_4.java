import java.util.*;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Question_4 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("sunny", 54), new Person("janny", 65));
        people.sort(Comparator.comparingInt(person -> person.age));
        System.out.println(people);
    }
}
