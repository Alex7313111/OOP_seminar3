// Создать класс Студент
// � Создать класс УчебнаяГруппа
// � Создать класс УчебнаяГруппаИтератор, заставив его реализовать
// интерфейс Iterator
// � Реализовать его контракты (включая удаление)

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {

        StudentGroup studentGroup1 = new StudentGroup();
        StreamStudent stream1 = new StreamStudent();
        StreamStudent stream2 = new StreamStudent();

        Student van = new Student("Van", 4);
        Student igor = new Student("Igorechick", 1);
        Student alex = new Student("Alex", 2);
        Student alexey = new Student("Alexey", 3);



        studentGroup1.addStudent(van);
        studentGroup1.addStudent(igor);
        studentGroup1.addStudent(alex);
        studentGroup1.addStudent(alexey);
        stream1.addStreamGroup(studentGroup1);     //добавление групп в поток

        StudentGroup studentGroup2 = new StudentGroup();
        Student kolya = new Student("Kolya", 2);
        Student vasya = new Student("Vasya", 1);
        studentGroup2.addStudent(kolya);
        studentGroup2.addStudent(vasya);


        stream2.addStreamGroup(studentGroup1); //добавление групп в поток
        stream1.addStreamGroup(studentGroup2);
        System.out.println(stream1);



        StudentGroup studentGroup3 = new StudentGroup();
        Student pol = new Student("Pol", 2);
        Student andrey = new Student("Andrey", 1);
        Student alexandr = new Student("Alexandr", 3);
        studentGroup3.addStudent(pol);
        studentGroup3.addStudent(andrey);
        studentGroup3.addStudent(alexandr);
        stream2.addStreamGroup(studentGroup3);        //добавление групп в поток
        StudentGroup studentGroup4 = new StudentGroup();
        Student tayson = new Student("Tayson", 2);
        studentGroup4.addStudent(tayson);




        // System.out.println("студенты " + studentGroup.students);
        // Iterator<Student> iterator = new StudentGroupIterator(studentGroup);

        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

       /* for(Student student: studentGroup1) {
            System.out.println(student);
        }
*/
        ArrayList<StreamStudent> arrayList = new ArrayList<>(List.of(stream1, stream2));

        System.out.println(arrayList);

        // public int compare(Student o1, Student o2) {
        //     return o1.id - o2.id;
        // }
        Collections.sort(arrayList, (s1, s2) -> s1.streamGroup.size() - s2.streamGroup.size()); // лямда выражение

        // Collections.sort(arrayList, new StudentComparator()); // сортировка, второй аргумент обратная сортировка
        System.out.println(arrayList);
    }

}