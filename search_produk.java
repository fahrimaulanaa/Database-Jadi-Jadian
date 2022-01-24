import java.util.Scanner;

public class search_produk {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Selamat datang di system pencarian produk");
        System.out.println("Masukkan produk yang ingin dicari: ");
        String produk = sc.next();

        if(produk.equalsIgnoreCase("Cimory")){
            database_jadi2an.cimory();
        }
    }
}
