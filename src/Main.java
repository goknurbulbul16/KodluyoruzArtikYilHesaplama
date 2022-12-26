import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil;
        Scanner scan = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        yil = scan.nextInt();


        if (yil >= 0) {
            if (yil % 100 == 0 && yil % 400 == 0) {
                System.out.println(yil + " " + " Artık Yıl!");
            } else if (yil % 4 == 0) {
                System.out.println(yil + " " + " Artık Yıl!");
            } else {
                System.out.println(yil + " " + "Artık Yıl Değil!");
            }
        } else {
            System.out.println("Hatalı Giriş !");
        }
    }
}