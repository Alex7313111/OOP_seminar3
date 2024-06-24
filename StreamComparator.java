import java.util.Comparator;

public class StreamComparator implements Comparator<StreamStudent> {

    @Override
    public int compare(StreamStudent o1, StreamStudent o2) {
        return o1.streamGroup.size() - o2.streamGroup.size();
    }
}


