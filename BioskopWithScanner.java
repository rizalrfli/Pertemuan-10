import java.util.Scanner;
public class BioskopWithScanner {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    int baris, kolom;
    String nama, next;
    String [][] penonton = new String[4][2];

    while (true) {
    System.out.println("Tampilkan menu Penonton: ");
    System.out.println("1. Tambah Penonton");
    System.out.println("2. Tampilkan Penonton");
    System.out.println("3. Keluar");    
    System.out.print("Pilih menu: ");
    int menu = sc.nextInt();
    sc.nextLine();

    if (menu == 1) {
        while (true) {
            System.out.print("Masukkan Nama   : ");
            nama = sc.nextLine();
            System.out.print("Masukkan Baris (1-4): ");
            baris = sc.nextInt();
            System.out.print( "Masukkan Kolom (1-2) : ");
            kolom = sc.nextInt();
            sc.nextLine();

            if (penonton[baris-1][kolom-1] != null) {
                System.out.println("Kotak sudah terisi, silahkan pilih kotak yang lain");
                continue;
            }
    
            penonton[baris-1][kolom-1] = nama;
            System.out.print("Input Penonton Lagi? (ya/tidak) : ");
        next = sc.nextLine();
        if (next.equalsIgnoreCase("tidak")) {
            break;
                    }
                }
            }
    else if (menu == 2) {
        System.out.println("Daftar penonton: ");
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j] == null) {
                    System.out.print("***\t");
                } else {
                    System.out.print(penonton[i][j] + "\t");}
                            }
                            System.out.println();
                        }
                    }
                else if (menu == 3) {
                    System.out.println("Terima kasih telah menggunakan aplikasi Bioskop");
                    break;
            }   
        }
    }
}  
