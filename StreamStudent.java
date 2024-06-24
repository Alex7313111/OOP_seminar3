import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StreamStudent implements Iterable<StudentGroup> {

    public List<StudentGroup> streamGroup  = new ArrayList<>();

    public void addStreamGroup (StudentGroup group) {
        streamGroup.add(group);

    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public String toString() {
        return streamGroup.toString();
    }
}

