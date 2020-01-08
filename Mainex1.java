import java.util.Scanner;

public class Mainex1 {
    public static void main(String[] args) {
        double balance,rate;
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap So Tien ban muon vay");
        balance = s.nextDouble();
        System.out.println("Nhap ty le ");
        rate =s.nextDouble();

        ex1 Bank = new ex1(balance , rate);
        Bank.calculateInterest();
        System.out.println("Thu ho:"+Bank.calculateInterest());
    }
}
