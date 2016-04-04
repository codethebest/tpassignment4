package Question3Principles.LSP.Violation;

import java.util.Collections;

/**
 * Created by student on 2016/03/31.
 */
public class SortedOrderCart extends OrderCart{

    public void addElement(String item) {
        super.addElement(item);
        Collections.sort(super.shoppingItems);
    }
}
