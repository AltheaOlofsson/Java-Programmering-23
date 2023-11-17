package codealongs;
import java.util.*;

public class lists {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("David");
        names.add("Jimmy");
        names.add("Althea");

        System.out.println(names);

        names.add("David");

        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);

        List<String> otherNames = new ArrayList<>();

        otherNames.add("Ophelia");
        otherNames.add("Hamlet");

        System.out.println(Collections.disjoint(names,otherNames));

        otherNames.add("Jimmy");
        System.out.println(Collections.disjoint(names,otherNames));

        int index = Collections.binarySearch(names, "Jimmy");

        System.out.println(index);

        Collections.swap(names,index,0);

        System.out.println(names);

        // swap does not work???


    }
    
}
