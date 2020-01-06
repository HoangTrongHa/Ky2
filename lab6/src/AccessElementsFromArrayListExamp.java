import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AccessElementsFromArrayListExamp {
    public static void main(String[] args) {
        List<String>top = new ArrayList<>();
        System.out.println("Is the topCompanies list empty:" + top.isEmpty());
        top.add("Google");
        top.add("Samsung");
        top.add("Apple");
        top.add("Amazon");
        top.add("Mircoshop");
        top.add("Facebook");
        top.add("instagram");
        top.add("skype");
        top.add("telegram");
        top.add("highland");
        top.add("coffeebean");

        System.out.println("Here are the top" + top.size() + "companies in the word");
        System.out.println(top);

        String bestCompani = top.get(0);
        String secondCompany = top.get(1);
        String lastCompany = top.get(top.size() - 1);

        System.out.println("so 1:" + bestCompani);
        System.out.println("so 2:" + secondCompany);
        System.out.println("so 3" + lastCompany);

        top.set(4, "Walmart");
        System.out.println("Modified top companies list:" + top);

//        Remove the firt
        top.remove(9);
        System.out.println("Sau khi xoa id 9" + top);


        Boolean isRemoved = top.remove("coffeebean");
        System.out.println("After(\"Coffeebean\")):" + top);


        List<String> ScriptingLanguager = new ArrayList<>();
        ScriptingLanguager.add("Python");
        ScriptingLanguager.add("Ruby");
        ScriptingLanguager.add("c++");
        ScriptingLanguager.add("Laravel");

        ScriptingLanguager.removeAll(ScriptingLanguager);
        System.out.println("Sau khi xoa tat ca"+top);

        top.removeIf(new Predicate<String>(){
                         @Override
                         public boolean test(String s) {
                             return false;
                         }

                         public boolean hoang(String s){
                return s.startsWith("c");
            }
                     }

                );
        System.out.println("Sau khi xoa ham remove if:"+top);
        top.clear();
        System.out.println("Sau khi clear:"+top);

    }

}
