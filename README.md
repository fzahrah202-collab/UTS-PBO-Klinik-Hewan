# UTS-PBO-Sistem-Manajemen-Klinik-Hewan

## Deskripsi Singkat Program

Sistem Manajemen Klinik Hewan merupakan program berbasis Java yang digunakan untuk mengelola data klinik hewan secara sederhana.

Program ini dapat digunakan untuk:
- Menambahkan data klinik
- Menampilkan data klinik
- Menghapus data klinik
- Memperbarui data klinik
- Menyimpan data hewan, pemilik, dan pemeriksaan menggunakan `ArrayList`

---

## Struktur Package

Program memiliki struktur package sebagai berikut:

<img width="403" height="335" alt="image" src="https://github.com/user-attachments/assets/853855ed-a720-47f8-9abe-81fdca69fad8" />


1. Package com.mycompany.klinikhewan

Berisi class `KlinikHewan.java` yang digunakan sebagai class utama untuk menjalankan program.

Class ini berisi:

- Menu utama program
- Input pilihan menu
- Perulangan program
- Pemanggilan method pada class Service

2. Package model

Berisi class yang digunakan untuk menyimpan data dan mengatur proses program, yaitu:

- `Service` : mengatur proses tambah, tampil, hapus, dan update data.
- `Hewan` : superclass untuk data hewan.
- `Kucing` : subclass dari Hewan.
- `Anjing` : subclass dari Hewan.
- `Pemilik` : menyimpan data pemilik hewan.
- `Pemeriksaan` : menyimpan data pemeriksaan hewan.
- `KucingPersia` : subclass dari Kucing yang digunakan untuk merepresentasikan kucing dengan ras Persia.

---

## Alur Program

Saat program dijalankan, sistem akan menampilkan menu utama:

<img width="424" height="242" alt="image" src="https://github.com/user-attachments/assets/ac1d09ac-c1fd-4e0d-aa9d-655704201176" />

Pengguna dapat memilih menu sesuai kebutuhan.

### 1. Tambah Data

<img width="401" height="721" alt="image" src="https://github.com/user-attachments/assets/c732f7fb-c204-4fd9-b0a0-d51adad6a3a2" />

Pada menu tambah data, pengguna memasukkan:

Data Pemilik:

- ID Data
- Nama Pemilik
- Nomor Telepon

Data Hewan:

- Nama Hewan
- Jenis Hewan
- Umur Hewan

Jika jenis hewan adalah:

- Kucing, maka pengguna mengisi status vaksin F3.
- Kucing Persia, maka pengguna mengisi status vaksin F3 dan ras otomatis ditetapkan sebagai Persia.
- Anjing, maka pengguna mengisi status vaksin rabies.
- Jenis hewan lainnya tidak meminta data vaksin tersebut.

Data Pemeriksaan:

- Keluhan
- Diagnosa

Setelah semua data valid, data akan disimpan ke dalam ArrayList.

### 2. Tampilkan Data

<img width="410" height="997" alt="image" src="https://github.com/user-attachments/assets/b04a3342-e3d4-4c76-a399-b4e2c3751b7c" />

Menu tampilkan data digunakan untuk menampilkan seluruh data yang sudah tersimpan.

Data yang ditampilkan meliputi:

- ID Data
- Data pemilik
- Data hewan
- Jenis hewan
- Status vaksin F3 untuk Kucing dan Kucing Persia
- Status vaksin rabies untuk Anjing
- Ras Persia untuk objek KucingPersia
- Data pemeriksaan

Program juga sudah memiliki dummy data awal sehingga saat menu tampilkan data dijalankan, data sudah langsung tersedia tanpa harus melakukan input terlebih dahulu.

### 3. Hapus Data

<img width="406" height="268" alt="image" src="https://github.com/user-attachments/assets/8d842646-7209-4a24-a41e-d94145c04995" />

Pengguna memasukkan ID Data yang ingin dihapus.

Program akan mencari ID tersebut di dalam ArrayList.

Jika ID ditemukan, maka data:

- Hewan
- Pemilik
- Pemeriksaan

akan dihapus.

Jika ID tidak ditemukan, program akan menampilkan pesan bahwa data tidak ditemukan.

### 4. Update Data

<img width="409" height="640" alt="image" src="https://github.com/user-attachments/assets/f6a7f27f-bd61-4164-9a51-d381f2f6ce4d" />

Pengguna memasukkan ID Data yang ingin diperbarui.

Jika ID ditemukan, pengguna dapat memperbarui:

- Nama pemilik
- Nomor telepon
- Nama hewan
- Umur hewan
- Status vaksin F3 untuk Kucing dan Kucing Persia
- Status vaksin rabies untuk Anjing
- Keluhan
- Diagnosa

Untuk Kucing Persia, ras tidak perlu diinput karena ras sudah ditentukan otomatis oleh class `KucingPersia`.

Setelah proses selesai, data akan diperbarui di dalam ArrayList.

### 5. Keluar

Jika pengguna memilih menu 5, program akan berhenti dan menampilkan pesan:

<img width="713" height="386" alt="image" src="https://github.com/user-attachments/assets/3e455974-803a-44ad-9436-33006779a434" />

## Penerapan Konsep PBO
### 1. Access Modifier

Program menerapkan access modifier untuk mengatur akses terhadap atribut dan method.

Contohnya pada class `Hewan`:

<img width="411" height="141" alt="image" src="https://github.com/user-attachments/assets/3e653675-2f78-464a-9910-64ad3c5af0b3" />

Atribut dibuat menggunakan private sehingga tidak dapat diakses secara langsung dari class lain.

Method seperti constructor, getter, setter, dan tampilkanInfo() menggunakan access modifier public agar dapat digunakan sesuai kebutuhan program.

### 2. Encapsulation

Encapsulation diterapkan dengan membuat atribut class menggunakan private dan menyediakan getter serta setter untuk mengakses atau mengubah data.

Contoh pada class `Hewan`:

<img width="409" height="520" alt="image" src="https://github.com/user-attachments/assets/1e694390-3c29-46b5-b6a7-64464dee0740" />

Dengan demikian, data tidak diakses secara langsung dari luar class, tetapi melalui method getter dan setter.

Encapsulation juga diterapkan pada class:

- `Hewan`
- `Kucing`
- `KucingPersia`
- `Anjing`
- `Pemilik`
- `Pemeriksaan`

### 3. Inheritance

Inheritance diterapkan pada program dengan menggunakan class `Hewan` sebagai superclass. Class turunan mewarisi atribut dan method yang dimiliki oleh superclass.

Program menerapkan dua tipe inheritance, yaitu **Hierarchical Inheritance** dan **Multilevel Inheritance**.

### a. Hierarchical Inheritance

Hierarchical inheritance terjadi ketika satu superclass memiliki lebih dari satu subclass.

Pada program ini, class `Hewan` memiliki dua subclass langsung, yaitu `Kucing` dan `Anjing`.

Class `Kucing` dan `Anjing` menggunakan keyword extends:

<img width="436" height="36" alt="image" src="https://github.com/user-attachments/assets/4f3fac81-a5e5-400a-889a-dca2f6f75db2" />

<img width="434" height="42" alt="image" src="https://github.com/user-attachments/assets/1f1660d7-5b80-4af2-b2f8-3ff24b5a48b5" />

Kedua subclass tersebut mewarisi atribut dan method yang dimiliki oleh superclass Hewan.

Selain atribut yang diwariskan, masing-masing subclass memiliki atribut khusus:

**Kucing**

<img width="434" height="45" alt="image" src="https://github.com/user-attachments/assets/b9da4c96-c970-465e-ad69-8f47bd6f9b4a" />

Atribut tersebut digunakan untuk menyimpan status vaksin F3 pada kucing.

**Anjing**

<img width="453" height="39" alt="image" src="https://github.com/user-attachments/assets/b692ae30-3753-497a-a8c5-694ea53d9d88" />

Atribut tersebut digunakan untuk menyimpan status vaksin rabies pada anjing.

b. Multilevel Inheritance

Multilevel inheritance terjadi ketika sebuah subclass memiliki subclass lain.

Pada program ini, hubungan multilevel inheritance diterapkan melalui class Hewan, Kucing, dan KucingPersia.

Class `KucingPersia` merupakan subclass dari `Kucing`:

<img width="381" height="36" alt="image" src="https://github.com/user-attachments/assets/0c3f35fb-e7fd-4c77-aedb-0935641b122f" />

Dengan demikian, KucingPersia mewarisi atribut dan method dari Kucing, yang sebelumnya juga mewarisi atribut dan method dari Hewan.

Class KucingPersia digunakan untuk merepresentasikan kucing dengan ras Persia. Ras Persia ditentukan secara otomatis oleh program sehingga pengguna tidak perlu memasukkan ras secara manual.

Dengan penerapan tersebut, program memiliki dua tipe inheritance, yaitu Hierarchical Inheritance dan Multilevel Inheritance.

### 4. Validasi Input

Program menerapkan validasi input untuk mencegah data yang tidak sesuai masuk ke dalam sistem.

Validasi yang diterapkan antara lain:

## Validasi angka

Program menggunakan hasNextInt() untuk memastikan input tertentu berupa angka.

Contohnya:

- Pilihan menu
- ID Data
- Umur hewan

Program juga memeriksa agar nilai tidak negatif.

Contoh:

<img width="540" height="79" alt="image" src="https://github.com/user-attachments/assets/55ae5595-bc02-4665-8169-e7885fcb1672" />

<img width="305" height="251" alt="image" src="https://github.com/user-attachments/assets/992b1557-e581-46b1-a4e7-14b4b0cad6fa" />


## Validasi data kosong

Program menggunakan isEmpty() untuk memastikan input teks tidak kosong.

Contohnya:

<img width="541" height="69" alt="image" src="https://github.com/user-attachments/assets/b8d64d8f-8a5c-4627-8f15-54af0bda3e00" />

<img width="310" height="93" alt="image" src="https://github.com/user-attachments/assets/b799c3f3-1322-4929-8559-1aa84075f8aa" />


## Validasi nomor telepon

Nomor telepon juga memiliki validasi panjang karakter, yaitu minimal 10 digit dan maksimal 13 digit.

<img width="540" height="121" alt="image" src="https://github.com/user-attachments/assets/57ccf6bf-7097-4ebf-947a-712b0eea9c58" />

<img width="306" height="66" alt="image" src="https://github.com/user-attachments/assets/95d3df7a-e2e5-4f5b-8d75-deefd1eee3c6" />


## Validasi ID Data

Program melakukan pengecekan ID agar ID yang sama tidak dapat digunakan kembali.

Jika ID sudah terdaftar, program akan meminta pengguna memasukkan ID lain.

<img width="532" height="209" alt="image" src="https://github.com/user-attachments/assets/ca101ba4-ef21-4558-aab5-88d34ff31f2a" />

<img width="319" height="65" alt="image" src="https://github.com/user-attachments/assets/94673396-2004-4480-8ca7-fd8ddf3838ca" />

### 5. Dummy Data

Program memiliki dummy data awal yang dimasukkan ke dalam ArrayList melalui constructor pada class Service.

Contohnya:

<img width="542" height="78" alt="image" src="https://github.com/user-attachments/assets/f58568d8-1afd-48af-9e54-193a5b5f8163" />

Dummy data tersebut digunakan agar ketika program pertama kali dijalankan dan pengguna memilih menu Tampilkan Data, data sudah langsung tersedia tanpa harus melakukan input terlebih dahulu.

### Polymorphism

Program menerapkan polymorphism melalui dua bentuk, yaitu method overriding dan method overloading.

**a. Method Overriding**

Method overriding diterapkan ketika subclass memiliki method dengan nama dan parameter yang sama seperti method pada superclass.

Pada class `Hewan` terdapat method tampilkanInfo():

<img width="406" height="58" alt="image" src="https://github.com/user-attachments/assets/7cb86d0a-f36c-4249-bdcb-da8e76489a7b" />

Pada class `Kucing`, method tersebut dioverride:

<img width="417" height="89" alt="image" src="https://github.com/user-attachments/assets/c3f355a8-99e7-410f-9585-1ab5693097bb" />

Pada class `Anjing`, method tersebut juga dioverride:

<img width="428" height="77" alt="image" src="https://github.com/user-attachments/assets/8265590f-cf87-4496-b613-22f2d291bbd1" />

Pada class `KucingPersia`, method tampilkanInfo() kembali dioverride:

<img width="394" height="125" alt="image" src="https://github.com/user-attachments/assets/48cd602b-ae89-464d-92bf-3e6dfadeca0a" />

Pemanggilan method polymorphism dilakukan pada class `Service`:

<img width="378" height="29" alt="image" src="https://github.com/user-attachments/assets/4ce5bdb4-759f-40f4-bdd2-e6acada39f50" />

<img width="306" height="37" alt="image" src="https://github.com/user-attachments/assets/edfb287f-8b2c-4fe9-9db9-f65bd0a44ce5" />

Dengan demikian, method yang dijalankan akan menyesuaikan dengan objek sebenarnya, seperti `Kucing`, `Anjing`, atau `KucingPersia`.

**b. Method Overloading**

Method overloading diterapkan pada class Hewan dengan menggunakan nama method yang sama tetapi memiliki parameter yang berbeda.

Method pertama:

<img width="510" height="76" alt="image" src="https://github.com/user-attachments/assets/c99fff77-6731-40d7-8507-0d685de61d74" />

Method kedua:

<img width="520" height="103" alt="image" src="https://github.com/user-attachments/assets/3dfe481a-5fdb-4144-b3c5-cf8ce30e8531" />

Perbedaan parameter tersebut menunjukkan penerapan method overloading pada class `Hewan`.

Dengan demikian, program menerapkan dua bentuk polymorphism, yaitu method overriding dan method overloading.
