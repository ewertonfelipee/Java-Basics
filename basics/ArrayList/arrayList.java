package basics.ArrayList;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>(10);
        integers.add(10);
        integers.add(24);
        integers.add(31);
        integers.add(49);
        integers.add(52);
        integers.add(67);
        integers.add(76);
        integers.add(88);

        System.out.println(integers);
        System.out.println(integers.size());
        System.out.println(integers.contains(14));
        System.out.println(integers.get(5));
    }
}
