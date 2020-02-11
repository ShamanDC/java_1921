import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String [] values) {

        Collection<Integer> collection = new ArrayList<>();
        collection.add(123);
        collection.add(100);
        collection.add(1000);
//        System.out.println(collection.add(39));
//        System.out.println(collection.size());
//        collection.clear();
//        System.out.println(collection.size());
        Collection<Integer> collection1 = new ArrayList<>();
        collection1.addAll(collection);
//        System.out.println(collection1);
//        collection1.clear();
//        System.out.println(collection1.isEmpty());

        Object [] objects = collection1.toArray();

        for (int i = 0; i < objects.length; i++) {

        }

//        for (int i = 0; i < objects.length; i++) {
//            System.out.println(objects[i]);
//        }




    }

}
