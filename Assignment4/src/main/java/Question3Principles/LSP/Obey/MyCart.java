package Question3Principles.LSP.Obey;

/**
 * Created by student on 2016/03/31.
 */
public interface MyCart {

    abstract  void addItem(String item);

    abstract String getItem(int itemIndex);
}
