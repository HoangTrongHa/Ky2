import java.util.ArrayList;
import java.util.List;

public class Arraylisttest {
    public static void main(String[] args) {
        List<String> danhsachnguoiyeucu = new ArrayList<>();
        danhsachnguoiyeucu.add("nguyễn thanh tú");
        danhsachnguoiyeucu.add("trương thi cam tu");
        danhsachnguoiyeucu.add("hoang phuong thao");
        danhsachnguoiyeucu.add("huynh thi truc quynh");
        danhsachnguoiyeucu.add("tran diem quynh");
        System.out.println(danhsachnguoiyeucu);
danhsachnguoiyeucu.add(2,"hoang trong ha");
//        thêm một yếu tố tại một chỉ mục cụ thể
        System.out.println(danhsachnguoiyeucu);
    }
}
