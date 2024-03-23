import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup>{
    List<StudyGroup> listGroup = new ArrayList<StudyGroup>();
    public Stream(List<StudyGroup> listGroup){
        this.listGroup = listGroup;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return listGroup.iterator();
    }


    public int compareTo(Stream o2) {
        return listGroup.get(1).getGroupName().compareTo(o2.listGroup.get(1).getGroupName());
    }

}
