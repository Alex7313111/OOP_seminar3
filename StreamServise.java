import java.util.*;

public class StreamServise {
    public void sort(List<StreamStudent> arrayList){
        Collections.sort(arrayList, new StreamComparator());
    }
}
