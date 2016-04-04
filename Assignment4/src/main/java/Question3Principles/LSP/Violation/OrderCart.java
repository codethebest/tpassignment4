package Question3Principles.LSP.Violation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2016/03/31.
 */
public class OrderCart {

    protected List <String> shoppingItems = new ArrayList<String>();

    public void addElement(String item) {
        shoppingItems.add(item);
    }

    public String getElement(int itemIndex) {
        return shoppingItems.get(itemIndex);
    }
}
