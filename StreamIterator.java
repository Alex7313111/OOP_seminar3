import java.util.Iterator;

public class StreamIterator implements Iterator<StudentGroup> {

    private StreamStudent potok;
    private int nomerPotoka = 0;

public StreamIterator (StreamStudent potok){
    this.potok = potok;
}
    @Override
    public boolean hasNext() {
        return nomerPotoka < potok.streamGroup.size();
    }

    @Override
    public StudentGroup next() {
        return potok.streamGroup.get(nomerPotoka++);
    }
}
