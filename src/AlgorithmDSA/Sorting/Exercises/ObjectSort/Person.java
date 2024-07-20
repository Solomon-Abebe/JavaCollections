package AlgorithmDSA.Sorting.Exercises.ObjectSort;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return "(" + name + ", " + age + ")";
    }
}

 class ObjectSorting {

    // Merge Sort (Stable)
    public static void mergeSort(List<Person> list) {
        if (list.size() > 1) {
            int mid = list.size() / 2;
            List<Person> left = new ArrayList<>(list.subList(0, mid));
            List<Person> right = new ArrayList<>(list.subList(mid, list.size()));
            mergeSort(left);
            mergeSort (right);
            merge(list, left, right);
        }
    }

    private static void merge(List<Person> list, List<Person> left, List<Person> right) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i).age <= right.get(j).age) {
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

    // Insertion Sort (Stable)
    public static void insertionSort(List<Person> list) {
        for (int i = 1; i < list.size(); i++) {
            Person key = list.get(i);// a key element of type Person for comparison
            int j = i - 1;
            while (j >= 0 && list.get(j).age > key.age) {
                list.set(j + 1, list.get(j));// is equivalent to =>list[j+1] = list[j]
                j--;
            }
            list.set(j + 1, key);//is equivalent to => list[j+1] = key
        }
    }

    // Quick Sort (Unstable)
    public static void quickSort(List<Person> list, int low, int high) {
        if (low < high) {// when divide and conquer ends or every element is sorted low will be equal with high
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }

    private static int partition(List<Person> list, int low, int high) {
        Person pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (list.get(j).age < pivot.age) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, high);
        return i + 1;
    }

    // Heap Sort (Unstable)
    public static void heapSort(List<Person> list) {
        int n = list.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            swap(list, 0, i);
            heapify(list, i, 0);
        }
    }

    private static void heapify(List<Person> list, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && list.get(left).age > list.get(largest).age) {
            largest = left;
        }
        if (right < n && list.get(right).age > list.get(largest).age) {
            largest = right;
        }
        if (largest != i) {
            swap(list, i, largest);
            heapify(list, n, largest);
        }
    }

    private static void swap(List<Person> list, int i, int j) {
        Person temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 25));
        people.add(new Person("David", 20));

        System.out.println("Original List: ");
        for (Person person : people) {
            System.out.println(person.getInfo());
        }

        // Stable Sorting Algorithms
        mergeSort(people);
        System.out.println("\nSorted by Age (Merge Sort): ");
        for (Person person : people) {
            System.out.println(person.getInfo());
        }

        insertionSort(people);
        System.out.println("\nSorted by Age (Insertion Sort): ");
        for (Person person : people) {
            System.out.println(person.getInfo());
        }

        // Unstable Sorting Algorithms
        quickSort(people, 0, people.size() - 1);
        System.out.println("\nSorted by Age (Quick Sort): ");
        for (Person person : people) {
            System.out.println(person.getInfo());
        }

        heapSort(people);
        System.out.println("\n Sorted by Age (Heap Sort): ");
        for (Person person : people) {
            System.out.println(person.getInfo());
        }
    }
}
