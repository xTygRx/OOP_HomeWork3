import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<StudyGroup> groupList1 = new ArrayList<StudyGroup>(List.of(
                new StudyGroup("first"),
                new StudyGroup("Second"),
                new StudyGroup("third"),
                new StudyGroup("fourth")));

        List<Student> studentList = new ArrayList<Student>(List.of
                (new Student("Ivan", "Ivanov", 13),
                 new Student("Petr", "Petrov", 18),
                 new Student("Vasilii", "Vasiliev", 20)));


        StudyGroupIterator iterator = new StudyGroupIterator(studentList);
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }

        List<StudyGroup> groupList2 = new ArrayList<StudyGroup>(List.of(
                new StudyGroup("fifth"),
                new StudyGroup("sixth"),
                new StudyGroup("seventh")));
        StreamIterator iter1 = new StreamIterator(groupList1);
        System.out.println("Список групп потока номер 1");
        while (iter1.hasNext()){
            System.out.println(iter1.next());
        }
        StreamIterator iter2 = new StreamIterator(groupList2);
        System.out.println("Список групп потока номер 2");
        while (iter2.hasNext()){
            System.out.println(iter2.next());
        }

        System.out.println("Сравниваем два потока");

        Stream newflow1 = new Stream(groupList1);
        Stream newflow2 = new Stream(groupList2);

        System.out.println(newflow1.compareTo(newflow2));

//        StudyGroup students = new StudyGroup();
//        students.setStudentList(studentList);
//        Iterator<Student> iterator1 = students.iterator();
//
//        while (iterator1.hasNext()){
//            System.out.println(iterator1.next());
//
//        }
//        System.out.println(studentList.get(0).compareTo(studentList.get(2)));
//        Collections.sort(studentList, new StudentComparotor());
//        System.out.println(studentList);




    }
}