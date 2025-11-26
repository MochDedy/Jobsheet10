import java.util.Scanner;

public class Tugas14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] data = new int[10][6];
        double[] rataResponden = new double[10];
        double[] rataPertanyaan = new double[6];
        double totalKeseluruhan = 0;

        // Bagian A: input data
        for (int i = 0; i < 10; i++) {
            System.out.println("\nResponden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print("Nilai pertanyaan ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }

        // Bagian B: rata-rata per responden
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += data[i][j];
            }
            rataResponden[i] = (double) total / 6;
        }

        // Bagian C: rata-rata per pertanyaan
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += data[i][j];
            }
            rataPertanyaan[j] = (double) total / 10;
        }

        // Bagian D: rata-rata keseluruhan
        for (int i = 0; i < 10; i++) {
            totalKeseluruhan += rataResponden[i];
        }
        totalKeseluruhan /= 10;

        System.out.println("\nRata-rata tiap responden:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ": " + rataResponden[i]);
        }

        System.out.println("\nRata-rata tiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataPertanyaan[j]);
        }

        System.out.println("\nRata-rata keseluruhan: " + totalKeseluruhan);
    }
}
