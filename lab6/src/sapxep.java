import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sapxep {
    public static void main(String[] args) {
        List<Integer> so = new ArrayList<>();
        so.add(1);
        so.add(4);
        so.add(2);
        so.add(6);
        so.add(85);
        so.add(25);
        so.add(6456);
        so.add(24);
        so.add(756);
        so.add(42);
        Collections.sort(so);
        System.out.println("in ra"+so);
    }
}
