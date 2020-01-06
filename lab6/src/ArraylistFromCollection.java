import java.util.ArrayList;
import java.util.List;

public class ArraylistFromCollection {
    public static void main(String[] args) {
        List<Integer> so5=new ArrayList<>();
        so5.add(3);
        so5.add(4);
        so5.add(8);
        so5.add(9);
        so5.add(10);
        List<Integer> so10 = new ArrayList<>(so5);

        List<Integer> so5_2 = new ArrayList<>();
        so5_2.add(42);
        so5_2.add(14);
        so5_2.add(31);
        so5_2.add(41);
        so5_2.add(76);

        so10.addAll(so5_2);
        System.out.println(so10);

    }
}
