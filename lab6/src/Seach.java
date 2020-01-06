import java.util.ArrayList;
import java.util.List;

public class Seach {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Hoang Ha");
        names.add("Xuan Huy");
        names.add("Hoang nam");
        names.add("Trong Ha");
        names.add("Diem Quynh");
        names.add("Xuan cu");
        System.out.println("Hinh nhu co Chua oong ha :\"Hoang Ha\""+names.contains("Hoang Ha"));

        System.out.println("Index of:\"Tim ong Xuan Huy\""+names.indexOf("Xuan Huy"));
        System.out.println("Index of:\"Tim ong Dien Quynh\""+names.indexOf("Diem Quynh"));

        System.out.println("Last indexof:\n ong trong ha\n"+names.lastIndexOf("Trong Ha"));
        System.out.println("Last indexof:\n ong Xuan cu\n"+names.lastIndexOf("Xuan cu"));


    }
}
