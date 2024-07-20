package AlgorithmDSA.Sorting.Exercises.ObjectSortByName;
import java.util.ArrayList;
import java.util.List;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return "(" + name + ", " + age + ")";
    }

    public String getName() {
        return name;
    }
}

 class SortingDemo {

    // Merge Sort by Name (Stable)
    public static void mergeSortByName(List<Person> list) {
        if (list.size() > 1) {
            int mid = list.size() / 2;
            List<Person> left = new ArrayList<>(list.subList(0, mid));
            List<Person> right = new ArrayList<>(list.subList(mid, list.size()));
            mergeSortByName(left);
            mergeSortByName(right);
            mergeByName(list, left, right);
        }
    }

    private static void mergeByName(List<Person> list, List<Person> left, List<Person> right) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i).getName().compareTo(right.get(j).getName()) <= 0) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }
        while (i < left.size()) {
            list.set(k++, left.get(i++));
        }
        while (j < right.size()) {
            list.set(k++, right.get(j++));
        }
    }

    // Insertion Sort by Name (Stable)
    public static void insertionSortByName(List<Person> list) {
        for (int i = 1; i < list.size(); i++) {
            Person key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j).getName().compareTo(key.getName()) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));
        people.add(new Person("David", 25));

        System.out.println("Original List: ");
        for (Person person : people) {
            System.out.println(person.getInfo());
        }

        // Stable Sorting Algorithms by Name
        mergeSortByName(people);
        System.out.println("\\nSorted by Name (Merge Sort): ");
        for (Person person : people) {
            System.out.println(person.getInfo());
        }

        insertionSortByName(people);
        System.out.println("\\nSorted by Name (Insertion Sort): ");
        for (Person person : people) {
            System.out.println(person.getInfo());
        }
    }
}

