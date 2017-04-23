import Classes.Shirt;
import Classes.SortShirtByDesc;
import Classes.SortShirtByInventory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Sasha on 23.04.2017.
 */

public class mySort {
    public static void main(String[] args) {
        List<Shirt> poloList = new ArrayList<>();

        Shirt polo1 = new Shirt();
        polo1.setInventory(123123);
        polo1.setShirt_ID("123qwe");
        polo1.setDescription("123123");
        polo1.setColor("brown");
        polo1.setSize("S");


        Shirt polo2 = new Shirt();
        polo2.setInventory(234234);
        polo2.setShirt_ID("234qwe");
        polo2.setDescription("234234");
        polo2.setColor("blue");
        polo2.setSize("M");

        Shirt polo3 = new Shirt();
        polo3.setInventory(345345);
        polo3.setShirt_ID("345qwe");
        polo3.setDescription("345345");
        polo3.setColor("red");
        polo3.setSize("L");

        Shirt polo4 = new Shirt();
        polo4.setInventory(456456);
        polo4.setShirt_ID("456qwe");
        polo4.setDescription("456456");
        polo4.setColor("white");
        polo4.setSize("XL");

        poloList.add(polo1);
        poloList.add(polo2);
        poloList.add(polo3);
        poloList.add(polo4);


        SortShirtByDesc sortDescription = new SortShirtByDesc();
        SortShirtByInventory sortCount = new SortShirtByInventory();

        Collections.sort(poloList, sortCount);
        for (Shirt a : poloList){
            System.out.println(a.getShirt_ID());
        }

        Collections.sort(poloList, sortDescription);
        for (Shirt a : poloList) {
            System.out.println(a.getDescription());
        }
    }
}
