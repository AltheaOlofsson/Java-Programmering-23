package exercises.solutionslocal.collections;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Registry {
    public static void main(String[] args) {
    
    Map<Integer, Employee> mihoyo = new HashMap<>();

    mihoyo.put(1, new Employee("Fu Hua",50000));
    mihoyo.put(2, new Employee("Kiana",17));
    mihoyo.put(3, new Employee("Durandal",17));
    mihoyo.put(4, new Employee("Bronya",16));
    mihoyo.put(5, new Employee("Otto", 500));

    mihoyo.get(5);
    


    System.out.println(mihoyo.get(5));



    }
    
}
