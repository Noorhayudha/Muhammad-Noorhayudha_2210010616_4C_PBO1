package PenggajihanUAS;

// class
public class Karyawan {
    // atribut dan encapsulation
    private String nama; // Atribut nama karyawan
    private String idKaryawan; // Atribut ID karyawan
    private char golongan; // Atribut golongan karyawan
    private int jamKerja; // Atribut jam kerja karyawan

    // constructor
    public Karyawan(String nama, String idKaryawan, char golongan, int jamKerja) {
        // Inisialisasi atribut dengan parameter yang diberikan
        this.nama = nama;
        this.idKaryawan = idKaryawan;
        this.golongan = golongan;
        this.jamKerja = jamKerja;
    }

    // mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public void setGolongan(char golongan) {
        this.golongan = golongan;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    // accessor (getter)
    public String getNama() {
        return nama;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public char getGolongan() {
        return golongan;
    }

    public int getJamKerja() {
        return jamKerja;
    }
    
    // method untuk menampilkan informasi
    public String tampilkanInfo() {
        // Mengembalikan informasi karyawan dalam format string
        return "Nama: " + getNama() + "\nID Karyawan: " + getIdKaryawan() +
               "\nGolongan: " + getGolongan() + "\nJam Kerja: " + getJamKerja();
    }
    
    // polymorphism (overloading)
    public String tampilkanInfo(String departemen) {
        // Mengembalikan informasi karyawan dan departemen dalam format string
        return tampilkanInfo() + "\nDepartemen: " + departemen;
    }
}
