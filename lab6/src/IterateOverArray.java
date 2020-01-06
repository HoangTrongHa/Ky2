import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArray {
    public static void main(String[] args) {
        List<String> tvShows =new ArrayList<>();
        tvShows.add("Breaking add");
        tvShows.add("Friends");
        tvShows.add("Prison break");
        tvShows.add("chay ngay di ");
        System.out.println("===Lặp lại bằng cách sử dụng java 8 cho bãi biển và lambda===");

        tvShows.forEach(tvShow ->{
            System.out.println(tvShow);
        });
        System.out.println("===Interate using an iterator()===");
        Iterator<String> tvshowIterator = tvShows.iterator();
        while (tvshowIterator.hasNext()){
        String tvshow2 = tvshowIterator.next();
            System.out.println(tvshow2);
        }
        System.out.println("Iterate using an iterator()and java 8 for each remaining()method");
        tvshowIterator = tvShows.iterator();
        tvshowIterator.forEachRemaining(tvShow ->{
            System.out.println(tvShow);
        });
        System.out.println("Interate using a listIterator()");
        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
        while (tvShowListIterator.hasPrevious()){
            String tvShow = tvShowListIterator.previous();
            System.out.println(tvShow);
        }
        System.out.println("Using simple for each loop");
        for (String tvShow:tvShows){
            System.out.println(tvShow);

        }
        System.out.println("Using for loop with index");
        for( int i = 0;i<tvShows.size();i++){
            System.out.println(tvShows.get(i));
        }
    }
}
