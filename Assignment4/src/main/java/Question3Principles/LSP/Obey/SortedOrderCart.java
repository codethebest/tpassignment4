package Question3Principles.LSP.Obey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by student on 2016/03/31.
 */
public class SortedOrderCart implements MyCart{

    private List<String> shoppingItems = new ArrayList<String>();

    public String getItem(int itemIndex) {
        return shoppingItems.get(itemIndex);
    }
    public void addItem(String item) {
        shoppingItems.add(item);
        Collections.sort(shoppingItems);
    }
}
