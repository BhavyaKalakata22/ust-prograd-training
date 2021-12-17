import java.util.*;

public class TreeMapDescending {
    public static void main(String[] args) {
        TreeMap<Integer , Integer> asc = new TreeMap<>();
        asc.put(1 , 10);
        asc.put(3 , 50);
        asc.put(2 , 30);
        asc.put(4 , 40);
        asc.put(5 , 20);
        System.out.println(asc);

        TreeMap<Integer , Integer> desc = new TreeMap<Integer , Integer>(Collections.reverseOrder());
        desc.put(1 , 10);
        desc.put(3 , 50);
        desc.put(2 , 30);
        desc.put(4 , 40);
        desc.put(5 , 20);
        System.out.println(desc);

        TreeMap<String , String> str = new TreeMap<String , String>(Collections.reverseOrder());
        str.put("a2" , "Programming");
        str.put("a1", "Language");
        str.put("a4" , "Love");
        str.put("a3" , "Java");
        str.put("a5", "I");
        System.out.println(str);

        Set<Map.Entry<String, String>> set = str.entrySet();
        for (Map.Entry<String, String> entry : set) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }

    }
}