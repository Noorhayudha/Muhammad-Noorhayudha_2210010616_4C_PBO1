package PenggajihanUAS;

//inheritance
public class DetailKaryawan extends Karyawan {

    // overriding
    public DetailKaryawan(String nama, String idKaryawan, char golongan, int jamKerja) {
        // Memanggil konstruktor superclass (Karyawan)
        super(nama, idKaryawan, golongan, jamKerja);
    }
    
    public int getTahunMasuk() {
        // Mengembalikan tahun masuk karyawan berdasarkan dua digit pertama ID karyawan
        return Integer.parseInt(getIdKaryawan().substring(0, 2)) + 2000;
    }
    
    public String getDepartemen() {
        // Mengembalikan departemen karyawan berdasarkan dua digit setelah tahun di ID karyawan
        String kodeDept = getIdKaryawan().substring(2, 4);
        // seleksi if
        if (kodeDept.equals("10")) {
            return "Departemen IT";
        } else {
            return "Departemen Lain";
        }
    }
    
    public String getJabatan() {
        // Mengembalikan jabatan karyawan berdasarkan dua digit setelah kode departemen di ID karyawan
        String kodeJabatan = getIdKaryawan().substring(4, 6); 
        // seleksi switch
        switch (kodeJabatan) {
            case "01":
                return "Cyber Security";
            case "02":
                return "Sistem Analis";
            default:
                return "Jabatan Lain";
        }
    }
    
    public int getNoBank() {
        // Mengembalikan nomor bank karyawan berdasarkan sisa digit ID karyawan
        return Integer.parseInt(getIdKaryawan().substring(6));
    }

    public int hitungGaji() {
        // Menghitung gaji berdasarkan golongan dan jam kerja
        int upahPerJam;
        switch (getGolongan()) {
            case 'A' -> upahPerJam = 5000;
            case 'B' -> upahPerJam = 7000;
            case 'C' -> upahPerJam = 8000;
            case 'D' -> upahPerJam = 10000;
            default -> upahPerJam = 0;
        }
        
        int totalGaji = getJamKerja() * upahPerJam;

        // Menambah bonus jika jam kerja lebih dari 48 jam
        if (getJamKerja() > 48) {
            totalGaji += (getJamKerja() - 48) * 4000;
        }

        return totalGaji;
    }

    // polymorphism (overriding)
    @Override
    public String tampilkanInfo() {
        // Menampilkan informasi karyawan lengkap termasuk gaji
        return super.tampilkanInfo() + 
                "\nTahun Masuk: " + getTahunMasuk() +
                "\nDepartemen: " + getDepartemen() +
                "\nJabatan: " + getJabatan() +
                "\nNo Bank: " + getNoBank() +
                "\nTotal Gaji: Rp." + hitungGaji();
    }
}