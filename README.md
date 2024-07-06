# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan id Karyawan, dan memberikan output berupa informasi detail dari no tersebut seperti tahun masuk, golongan, jam kerja, jabatan, total gaji, departemen dan nomor bank.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Karyawan`, `KaryawanDetail`, dan `AksiKaryawan` adalah contoh dari class.

```bash
public class Karyawan {
    ...
}

public class KaryawanDetail extends Karyawan {
    ...
}

public class AksiKaryawan {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mhs[i] = new MahasiswaDetail(nama, npm);` adalah contoh pembuatan object.

```bash
karyawan[i] = new DetailKaryawan(nama, idKaryawan, golongan, jamKerja);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `npm` adalah contoh atribut.

```bash
String nama;
String idKaryawan;
char golongan;
int jamKerja;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mahasiswa` dan `MahasiswaDetail`.

```bash
public Karyawan(String nama, String idKaryawan, char golongan, int jamKerja) {
    this.nama = nama;
    this.idKaryawan = idKaryawan;
    this.golongan = golongan;
    this.jamKerja = jamKerja;
}

public DetailKaryawan(String nama, String idKaryawan, char golongan, int jamKerja) {
    super(nama, idKaryawan, golongan, jamKerja);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNpm` adalah contoh method mutator.

```bash
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
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNpm`, `getTahunMasuk`, `getFakultas`, `getProdi`, dan `getNoRegistrasi` adalah contoh method accessor.

```bash
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
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `npm` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String idKaryawan;
private char golongan;
private int jamKerja;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
public class DetailKaryawan extends Karyawan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
public String tampilkanInfo(String departemen) {
    return tampilkanInfo() + "\nDepartemen: " + departemen;
}

@Override
public String tampilkanInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
public String getDepartemen() {
    if (getIdKaryawan().substring(2, 4).equals("10")) {
        return "Departemen IT";
    } else {
        return "Departemen Lain";
    }
}

public String getJabatan() {
    switch (getIdKaryawan().substring(4, 6)) {
        case "01":
            return "Cyber Security";
        case "02":
            return "Sistem Analis";
        default:
            return "Jabatan Lain";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < karyawan.length; i++) {
    ...
}

for (DetailKaryawan data : karyawan) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Karyawan " + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("Data Karyawan:");
System.out.println(data.tampilkanInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
DetailKaryawan[] karyawan = new DetailKaryawan[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (NumberFormatException e) {
    System.out.println("Kesalahan Format Angka: " + e.getMessage());
} catch (StringIndexOutOfBoundsException e) {
    System.out.println("Kesalahan Format ID Karyawan: " + e.getMessage());
} catch (Exception e) {
    System.out.println("Kesalahan Umum: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Noorhayudha
NPM: 2210010616
