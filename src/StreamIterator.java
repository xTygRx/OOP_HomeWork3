import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudyGroup> {
    List<StudyGroup> groupList = new ArrayList<StudyGroup>();

    public StreamIterator(List<StudyGroup> groupList){
        this.groupList = groupList;
    }

    int index;

    @Override
    public boolean hasNext() {
        return index < groupList.size();
    }

    @Override
    public StudyGroup next() {
        return groupList.get(index++);
    }
}
