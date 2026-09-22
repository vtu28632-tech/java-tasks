import java.util.*;

class ThroneInheritance {
    class Person {
        String name;
        List<Person> children;

        Person(String name) {
            this.name = name;
            children = new ArrayList<>();
        }
    }

    Person king;
    Map<String, Person> people;
    Set<String> dead;

    ThroneInheritance(String kingName) {
        king = new Person(kingName);
        people = new HashMap<>();
        dead = new HashSet<>();
        people.put(kingName, king);
    }

    void birth(String parentName, String childName) {
        Person parent = people.get(parentName);
        Person child = new Person(childName);

        parent.children.add(child);
        people.put(childName, child);
    }

    void death(String name) {
        dead.add(name);
    }

    List<String> getInheritanceOrder() {
        List<String> result = new ArrayList<>();
        dfs(king, result);
        return result;
    }

    void dfs(Person person, List<String> result) {
        if (!dead.contains(person.name)) {
            result.add(person.name);
        }

        for (Person child : person.children) {
            dfs(child, result);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ThroneInheritance t = new ThroneInheritance("king");

        t.birth("king", "andy");
        t.birth("king", "bob");
        t.birth("king", "catherine");
        t.birth("andy", "matthew");
        t.birth("bob", "alex");
        t.birth("bob", "asha");

        System.out.println(t.getInheritanceOrder());

        t.death("bob");

        System.out.println(t.getInheritanceOrder());
    }
}