import java.util.Scanner;

public class BioskopWithScanner14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, pilihan;
        String nama;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            pilihan = sc.nextInt();
            sc.nextLine(); // membersihkan buffer

            switch (pilihan) {

                case 1:
                    // Input data penonton
                    while (true) {
                        System.out.print("Masukkan Nama: ");
                        nama = sc.nextLine();

                        // LOOP hinnga mendapatkan kursi yang kosong
                        while (true) {
                            System.out.print("Masukkan Baris (1-4): ");
                            baris = sc.nextInt();

                            System.out.print("Masukkan Kolom (1-2): ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            // Validasi baris dan kolom tersedia
                            if (baris < 1 || baris > penonton.length ||
                                    kolom < 1 || kolom > penonton[0].length) {

                                System.out.println("Baris atau kolom tidak tersedia! Silahkan ulangi.");
                                continue; // mengulang input kolom dan baris
                            }

                            // Validasi apakah kursi kosong
                            if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Kursi sudah ditempati penonton lain!");
                                System.out.println("Silakan pilih baris dan kolom lain.");
                                continue; // mengulang input kolom dan baris
                            }

                            // Jika sampai sini, kursi VALID dan KOSONG → keluar loop
                            break;
                        }

                        // Simpan data ke array
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan!");

                        System.out.print("Input penonton lainnya? (ya/tidak): ");
                        String next = sc.nextLine();
                        if (next.equalsIgnoreCase("tidak")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    // Tampilkan data penonton
                    System.out.println("\n=== Daftar Penonton ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if(penonton[i][j] == null){
                                System.out.print("***\t");
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                
                case 3:
                    //penutup
                    System.out.println("Terima kasih Program Selesai!");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan menu tidak valid! silahkan pilih 1-3");
                    break;
            }
        }
    }
}