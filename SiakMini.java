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
                System.out.println("Login berhasil!\n");
                login = true;
            } else {
                System.out.println("Username atau password salah!\n");
            }

            if (login) {
                System.out.println("=== Nilai Mahasiswa ===");
                String[] matkul = {"Algoritma", "Basis Data", "PBO", "Jaringan", "AI"};
                for (String m : matkul) {
                    int nilai = 60 + a.nextInt(41); // 60–100
                    System.out.println(m + ": " + nilai);
                }

                System.out.println("\nKetik 'keluar' untuk logout atau tekan Enter untuk lanjut...");
                String keluar = sc.nextLine();
                if (keluar.equalsIgnoreCase("keluar")) {
                    System.out.println("Logout berhasil. Terima kasih!");
                    break;
                }
            }
        }
    }
}
