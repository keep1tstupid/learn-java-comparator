package Classes;

import java.util.Comparator;

public class SortShirtByDesc implements Comparator<Shirt> {

    public int compare(Shirt a, Shirt b) {
        String desc1 = a.getDescription();
        String desc2 = b.getDescription();

        return desc2.compareTo(desc1);
    }
}
