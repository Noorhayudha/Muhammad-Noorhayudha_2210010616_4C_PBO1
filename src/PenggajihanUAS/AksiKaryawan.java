package PenggajihanUAS;

import java.util.Scanner;

public class AksiKaryawan {
    public static void main(String[] args) {
        // error handling
        try {
            // IO Sederhana
            Scanner scanner = new Scanner(System.in);
            
            // array
            DetailKaryawan[] karyawan = new DetailKaryawan[2];
            //Perulangan
            for (int i = 0; i < karyawan.length; i++) {
                System.out.print("Masukkan Nama Karyawan " + (i + 1) + ": ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan ID Karyawan " + (i + 1) + ": ");
                String idKaryawan = scanner.nextLine();
                System.out.print("Masukkan Golongan Karyawan " + (i + 1) + ": ");
                char golongan = scanner.next().charAt(0);
                System.out.print("Masukkan Jam Kerja Karyawan " + (i + 1) + ": ");
                int jamKerja = scanner.nextInt();
                scanner.nextLine(); // consume the newline

                // objek
                karyawan[i] = new DetailKaryawan(nama, idKaryawan, golongan, jamKerja);
            }
            
            for (DetailKaryawan data : karyawan) {
                System.out.println("");
                System.out.println("Data Karyawan: ");
                // Menampilkan informasi karyawan
                System.out.println(data.tampilkanInfo());
            }
        } catch (NumberFormatException e) {
            // Menangkap kesalahan format angka
            System.out.println("Kesalahan Format Angka: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            // Menangkap kesalahan format ID karyawan
            System.out.println("Kesalahan Format ID Karyawan: " + e.getMessage());
        } catch (Exception e) {
            // Menangkap kesalahan umum lainnya
            System.out.println("Kesalahan Umum: " + e.getMessage());
        }
    }   
}