import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExIterate {
    public static void main(String[] args) {
        List<Integer> sohoc = new ArrayList<>();
        sohoc.add(12);
        sohoc.add(123);
        sohoc.add(124);
        sohoc.add(125);
        sohoc.add(126);
        sohoc.add(127);
        sohoc.add(129);
        sohoc.add(121);
        sohoc.add(122);
        sohoc.add(120);

        Iterator<Integer> sohocIterator = sohoc.iterator();
        while (sohocIterator.hasNext()){
            Integer num = sohocIterator.next();
            if(num % 2 !=0){
                sohocIterator.remove();

            }
        }
        System.out.println("lô 3 càng hôm nay là:"+sohoc);

    }
}
