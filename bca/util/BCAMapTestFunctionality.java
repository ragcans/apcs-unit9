package bca.util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Set;

public class BCAMapTestFunctionality {

    public static void main(String[] args) {
        test (new BCAMapBaseline<String, Integer>());
        // test (new BCAMapByArrayList<String, Integer>());
        // test (new BCAHashMap<String, Integer>(10));
    }

	public static void test(BCAMap<String, Integer> map) {
        System.out.println("\n" + map.getClass() + "\n");

        map.put("Jennifer", 14);
        map.put("Thomas", 12);
        map.put("Luke", 18);
        map.put("Emily", 14);

        if (map.get("Thomas").equals(12))
            System.out.println("Passed 0");
        else
            System.out.println("Failed 0");

        if (map.get("Alden") == null)
            System.out.println("Passed 1");
        else
            System.out.println("Failed 1");


        if (map.getOrDefault("Jong", 95).equals(95))
            System.out.println("Passed 2");
        else
            System.out.println("Failed 2");

        if (map.getOrDefault("Luke", 18).equals(18))
            System.out.println("Passed 3");
        else
            System.out.println("Failed 3");

        if (map.put("Luke", 19).equals(18) && map.get("Luke").equals(19))
            System.out.println("Passed 4");
        else
            System.out.println("Failed 4");

        if (map.containsKey("Emily"))
            System.out.println("Passed 5");
        else
            System.out.println("Failed 5");

        if (map.remove("Emily").equals(14))
            System.out.println("Passed 6");
        else
            System.out.println("Failed 6");

        if (!map.containsKey("Emily"))
            System.out.println("Passed 7");
        else
            System.out.println("Failed 7");

        if (map.containsValue(14))
            System.out.println("Passed 8");
        else
            System.out.println("Failed 8");

        if (!map.containsValue(-14))
            System.out.println("Passed 9");
        else
            System.out.println("Failed 9");

        if (!map.isEmpty())
            System.out.println("Passed 10");
        else
            System.out.println("Failed 10");

        if (map.size() == 3)
            System.out.println("Passed 11");
        else
            System.out.println("Failed 11");

        Set<Entry<String,Integer>> entries = map.entrySet();
        if (entries.size() == 3)
            System.out.println("Passed 12");
        else
            System.out.println("Failed 12");

        ArrayList<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        if (keys.get(0).equals("Jennifer") && keys.get(1).equals("Luke")
        && keys.get(2).equals("Thomas") && keys.size() == 3)
            System.out.println("Passed 13");
        else
            System.out.println("Failed 13");

        if (map.size() == 3)
            System.out.println("Passed 14");
        else
            System.out.println("Failed 14");


        map.clear();

        if (map.isEmpty())
            System.out.println("Passed 15");
        else
            System.out.println("Failed 15");

        try {
            map.put(null, 15);
            System.out.println("Failed 16");
        } catch (NullPointerException ex) {
            System.out.println("Passed 16");
        }

        try {
            map.put("Missy", null);
            System.out.println("Failed 17");
        } catch (NullPointerException ex) {
            System.out.println("Passed 17");
        }
    }
}
