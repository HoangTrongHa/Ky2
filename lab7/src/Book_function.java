import java.util.Scanner;

public class Book_function {
    public static void main(String[] args) {

//        du lieu sach
        Book_management List = new Book_management();
        List.addList("php");
        List.addList("Laravel");
        List.addList("Java");
        List.addList("Tinh nhat phai");
        List.addList("THuy thuy mat trang");
        List.addList("wibu");
        List.addList("nhanh");
        List.addList("cham");



        Book_management nguoi_muon = new Book_management();
        String Ten_Dang_Nhap = Book_management.save().getUser();
        String Pass = Book_management.save().getMasv();


        String Ten_Dang_Nhap2 = Book_management.save1().getUser();
        String Pass2 = Book_management.save1().getMasv();

//        dang nhap
        Scanner myObj = new Scanner(System.in);
        System.out.println("Tên đăng nhập");
        String sothe1 = myObj.nextLine();
        System.out.println("Passwork");
        String mapin1 = myObj.nextLine();

        if (sothe1.equals(Ten_Dang_Nhap) && mapin1.equals(Pass)||sothe1.equals(Ten_Dang_Nhap2) && mapin1.equals(Pass2) ) {
            System.out.println("Dang nhap thanh cong");

            System.out.println("Chung toi co: \n"+"\nBan muon chon sach nao?");
            List.displayList();
            System.out.println("Ban muon muon sach nao:");

            Scanner s = new Scanner(System.in);
            System.out.println("Sach toi muon muon:");
            String muon =s.nextLine();
            Boolean has =  List.search(muon);
            if (has) {
                List.remove(muon);
                List.displayList();
                System.out.println("Sach ban da muon la"+muon);
            }else {
                System.out.println("deo co");
            }
            System.out.println("m muon muon ");


        }else {
            System.out.println("Mission fail");
        }

    }
}
