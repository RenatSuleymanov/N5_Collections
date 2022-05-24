import java.util.Arrays;
import java.util.HashMap;

public class Base {
    public static void main(String[] args) {

        String[] m = Test.getStr();
        System.out.println("Not sorting list: ");
        for (String o : m) System.out.print(o + " ");
        System.out.println();

        Arrays.sort(m);
        System.out.println("Sorting list: ");
        for (String o : m) System.out.print(o + " ");
        System.out.println();

        HashMap<String, Integer> h = new HashMap<String, Integer>();
        for (int i = 0; i < m.length; i++) {
            if (h.containsKey(m[i])) {
                h.replace(m[i], h.get(m[i]) + 1);
            } else {
                h.put(m[i], 1);
            }
        }
        String s = null;
        int p = 0;
        for (String w : h.keySet()) {
            if (p < h.get(w)) {
                p = h.get(w);
                s = w;
            }
        }
        h.forEach((k, v) -> System.out.printf("Word %s meets %d times.\n", k, v));
        System.out.println("word: " + s + " (meets " + h.get(s) + " times)");
    }
}