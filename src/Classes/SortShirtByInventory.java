package Classes;

import java.util.Comparator;

public class SortShirtByInventory implements Comparator<Shirt>{

    public int compare(Shirt a, Shirt b){
        int inv1 = a.getInventory();
        int inv2 = b.getInventory();

        if(inv1 > inv2) {
            return 1;
        }
        else if(inv1 < inv2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
