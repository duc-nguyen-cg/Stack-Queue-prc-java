import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PersonManagement {
    public static ArrayList<Person> sortByGender(ArrayList<Person> group){
        ArrayList<Person> result = new ArrayList<>();
        Queue<Person> males = new LinkedList<>();
        Queue<Person> females = new LinkedList<>();

        for (Person person: group){
            if (person.getGender().equals("male")){
                males.add(person);
            } else if (person.getGender().equals("female")){
                females.add(person);
            }
        }

        while (!females.isEmpty()){
            result.add(females.poll());
        }
        while (!males.isEmpty()){
            result.add(males.poll());
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Person> group = new ArrayList<>();
        group.add(new Person("A", "male", "3/1"));
        group.add(new Person("B", "female", "2/1"));
        group.add(new Person("C", "male", "1/1"));

        for (Person person: sortByGender(group)){
            System.out.println(person);
        }


    }


}
