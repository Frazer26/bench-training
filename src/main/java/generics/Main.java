package generics;

import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<String> stringList = Convert.fromArrayToList(intArray, Objects::toString);
        System.out.println(stringList);

//        Bounded generics
//        String[] stringArray = {"1", "2"};
//        Convert.fromArrayToList(stringArray);

        //Simple generic constructor
        GenericEntry<String> entry = new GenericEntry<>("test", 1);
        System.out.println(entry.getData().equals("test"));
    }
}
