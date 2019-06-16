package conatainer;

import java.util.List;

public class Container<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    static void copy(List<? extends Product> src, List<? super Product> dest) {
        for (Product p : src) {
            dest.add(p);
        }

    }

    // IN - argument
    /*
    -- Supplies the value (src)
    -- Use extends
    -- If only methods of Object will be accessed in the value, then use ? wildcard without extends
     */
    // OUT - argument
    /*
    -- Receives the value(dest)
    -- Use super
     */
    // Single variable is IN and OUT
    /*
    --Do not use bounded wildcards
    */
}
