package bca.util;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BCAMapTestSpeed {

    public static void main(String[] args) throws Exception {
        test (new BCAMapBaseline<String, Integer>());
        // test (new BCAMapByArrayList<String, Integer>());
        // test (new BCAHashMap<String, Integer>(1));
        // test (new BCAHashMap<String, Integer>(5));
        // test (new BCAHashMap<String, Integer>(10));
        // test (new BCAHashMap<String, Integer>(100));
        // test (new BCAHashMap<String, Integer>(1000));
    }

    public static ArrayList<String> readDictionary() throws FileNotFoundException{
        Scanner in = new Scanner(new FileReader("bca/util/words_large.txt"));
        ArrayList<String> list = new ArrayList<>();

        while (in.hasNextLine()) {
            list.add(in.nextLine());
        }
        return list;
    }

	public static void test(BCAMap<String, Integer> map) throws FileNotFoundException {
        System.out.println("\n" + map.getClass() + "\n");
        Random r = new Random(15);
        ArrayList<String> dictionary = readDictionary();

        long start = System.currentTimeMillis();

        // 50000 might take a long time on some machines.  If so, try 20000.
        for (int i = 0; i < 50000; i++) {
            String n = dictionary.get(r.nextInt(dictionary.size()));
            map.put(n, ((Integer) map.getOrDefault(n, 0)) + 1);
        }

        long end = System.currentTimeMillis();

        double seconds = (end - start) / 1000.0;
        System.out.printf("Total seconds: %.3f\n", seconds);

    }
}
