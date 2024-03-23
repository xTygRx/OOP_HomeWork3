import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student>{
    String groupName;
    public StudyGroup(String groupName){
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    List<Student> studentList = new ArrayList<Student>();


    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudyGroupIterator(studentList);
    }

    @Override
    public String toString() {
        return String.format("%s", groupName);
    }
}
