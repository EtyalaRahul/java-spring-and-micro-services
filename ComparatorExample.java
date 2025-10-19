import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

class SortStudents implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.marks != s2.marks) {
            return s2.marks - s1.marks;
        }
        int nameCompare = s1.name.compareTo(s2.name);
        if (nameCompare != 0) {
            return nameCompare;
        }
        return s1.id - s2.id;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(1, "Alice", 85));
        list.add(new Student(2, "Bob", 90));
        list.add(new Student(3, "Charlie", 80));
        list.add(new Student(10, "Rahul", 100));
        list.add(new Student(5, "Bob", 90)); 

        Collections.sort(list, new SortStudents());

        for (Student s : list) {
            System.out.println(s.id + "\t" + s.name + "\t" + s.marks);
        }
    }
}
