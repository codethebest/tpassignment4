package Question3Principles.LSP.Obey;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2016/03/31.
 */
public class OrderCart implements MyCart {
    protected List<String> shoppingItems = new ArrayList<String>();

    public void addItem(String item) {
        shoppingItems.add(item);
    }

    public String getItem(int itemIndex) {
        return shoppingItems.get(itemIndex);
    }
}
