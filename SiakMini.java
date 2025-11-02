import java.util.Scanner;
import java.util.Random;

public class SiakMini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random a = new Random();

        String username = "arkhan";
        String password = "12345";
        boolean login = false;

        while (true) {
            System.out.print("Masukkan username: ");
            String user = sc.nextLine();
            System.out.print("Masukkan password: ");
            String pass = sc.nextLine();

            if (user.equals(username) && pass.equals(password)) {
                System.out.println("\nLogin berhasil!\n");
                login = true;
            } else {
                System.out.println("\nLogin gagal!");
                System.out.print("Apakah anda ingin keluar? (ya/tidak): ");
                String keluar = sc.nextLine();
                if (keluar.equalsIgnoreCase("ya")) {
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                } else {
                    System.out.println();
                    continue;
                }
            }

            if (login) {
                System.out.println("=== Nilai Mahasiswa ===");
                int kuis = 60 + a.nextInt(41);
                int uts = 60 + a.nextInt(41);
                int uas = 60 + a.nextInt(41);

                System.out.println("Kuis : " + kuis);
                System.out.println("UTS  : " + uts);
                System.out.println("UAS  : " + uas);

                double rata = (kuis + uts + uas) / 3.0;
                System.out.printf("Rata-rata Nilai: %.2f\n", rata);

                System.out.println("\nTerima kasih telah menggunakan SIAK Mini!");
                break;
            }
        }

        sc.close();
    }
}
