package containerNew;

import conatainer.Product;

 abstract class ProductNew implements Comparable<Product>{

    protected abstract int deepCompare(Product p);

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
