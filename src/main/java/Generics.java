import conatainer.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List rawList = new ArrayList();
        List<String> list = new ArrayList<>();

        rawList = list;

        rawList.add(8);
        rawList.add("Hello");
        System.out.println(rawList);

        SomeType<Number> first = new SomeType<>();
        SomeType<String> second = new SomeType<>();

        second.test(list);
        SomeType someType = new SomeType();
        List<String> list1 = Arrays.asList("value");

// Class cast exeception because compiler search what is nearer to object
        // List is more near than Collection so compiler will use second method with Integer as parameter
        //TODO      someType.test(list1);

        SomeType<Object> someTypeSecond = new SomeType();
        List<String> list2 = Arrays.asList("value");

//If we add generics for this object it will work fine
        someTypeSecond.test(list2);

        List<String> lstr = new ArrayList<>();
        List<Object> lobj = new ArrayList<>();
        List<String> strList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();
        print(strList);
        ///       print(objList);

        Container<Product> c1 = new Container<>();
        c1.setItem(new Phone());
        c1.setItem(new Camera());
        Product p = c1.getItem();

        Container<Camera> c2 = new Container<>();
        Camera c = c2.getItem();

        Container<String> c3 = new Container<>();
        ContainerProd<Product> productsContainer;
        ContainerProd<Camera> camerasConatiner;
        ContainerProd<Phone> phoneContainer;
        //ContainerProd<Object> objectContainerProd;
        //ContainerProd<String> stringContainer;

        //Object camera extends products but list of cameras do not extends list of products
        List<Camera> cameras = new ArrayList<>();
        //TODO ERROR will cause , find require Product list it re
        //   find(cameras, new Camera());

        findWild(cameras, new Camera());
        // OK but looks weird
        findWild(cameras, new Phone());
//DO NOT Do SUCH things
        //If we want to use list its better to use it without word extends just better to use Product
        List<? extends Product> listBad = new ArrayList<>();
        //  Conatainer<?> holder=
        //

    }

    static void print(Collection<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }

    static boolean find(List<Product> all, Product p) {
        for (Product product : all) {
            if (product.getName().equals(p.getName()))
                return true;
        }
        return false;
    }

    //TODO Bounded wildcard

    static <T extends Product> boolean findWild(List<? extends Product> all, Product p) {
        for (Product product : all) {
            if (product.getName().equals(p.getName()))
                return false;
        }
        return true;
    }

    // Don't ever do so

//    public List<? super Product> someWTFMethod () {
//        return null;
//
//    }
//
//    public Collection <?> someStrangeMethod(){
//        return null;
//    }


}
