import java.util.Scanner;
public class SIAKAD01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] nilai = new int [4][3];
        for (int i = 0 ; i < nilai.length ; i++) {
            System.out.println("Input Nilai Mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;

            for (int j = 0 ; j < nilai[i].length ; j++) {
                System.out.print("Input mata kuliah-" + (j+1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerSiswa/3);

            System.out.println("\n========================");
            System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

            for (int j = 0 ; j < 3 ; j++) {
                double totalPerMatKul = 0;

                for (int k = 0 ; k < 4 ; k++) {
                    totalPerMatKul += nilai[k][j];
                }
                System.out.println("Mata Kuliah " + (j+1) + " : " + totalPerMatKul/4);
            }
        }
    }
}
