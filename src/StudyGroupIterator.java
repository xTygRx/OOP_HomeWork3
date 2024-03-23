import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<Student> {

    List<Student> studentList = new ArrayList<Student>();

    public StudyGroupIterator(List<Student> studentList) {
        this.studentList = studentList;
    }

    int index;

    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public Student next() {
        return studentList.get(index++);

    }

}
