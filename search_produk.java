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
        else if(produk.equalsIgnoreCase("Indomie")){
            database_jadi2an.indomie();
        }
        else if(produk.equalsIgnoreCase("Lemonilo")){
            database_jadi2an.lemonilo();
        }
        else if(produk.equalsIgnoreCase("Fruit Tea")){
            database_jadi2an.fruit_tea();
        }
        else if(produk.equalsIgnoreCase("Indomilk")){
            database_jadi2an.indomilk();
        }
        else if(produk.equalsIgnoreCase("Mie Sedap")){
            database_jadi2an.mie_sedap();
        }
        else if(produk.equalsIgnoreCase("Aqua")){
            database_jadi2an.aqua();
        }
        else if(produk.equalsIgnoreCase("Le Minerale")){
            database_jadi2an.le_minerale();
        }
    }
}
