# POSTTEST2-PBO

## Deskripsi Singkat Program
Program ini adalah aplikasi berbasis Java untuk mengelola data armada pesawat.  
Data yang dikelola meliputi:

- ID Pesawat
- Tipe Pesawat
- Kapasitas Maksimal Penumpang

Program ini dibangun menggunakan struktur **multi-class dan multi-package**, serta sudah menerapkan:

- Constructor dan access modifier  
- Pemisahan class berdasarkan fungsinya (model, service, main)  
- Validasi input  
- Fitur pencarian data (search)

## Struktur Packages
Program ini dibagi menjadi 3 package utama:

- `model` => berisi class `Armada.java` yang menyimpan struktur data pesawat  
- `service` => berisi class `ArmadaService.java` yang menangani logika CRUD dan pencarian  
- `main` => berisi class `Main.java` sebagai entry point dan menu interaktif untuk pengguna

## Penerapan MVC (Model–View–Controller)

Program ini sudah menerapkan **MVC**, yang memisahkan peran masing-masing komponen:

- **Model** (`model.Armada.java`)  
  Menyimpan struktur data pesawat, termasuk atribut dan constructor.

- **View** (`main.Main.java`)  
  Menyediakan antarmuka pengguna berupa menu interaktif dan input/output melalui console.

- **Controller** (`service.ArmadaService.java`)  
  Menangani logika program seperti tambah, ubah, hapus, tampilkan, dan cari data armada.  
  Juga bertanggung jawab atas validasi input dan pengolahan data.

Dengan struktur ini, program menjadi lebih terorganisir dan mudah dikembangkan di masa depan.

## Fitur Program
1. **Tambah Armada** – Menambahkan data pesawat baru  
2. **Lihat Armada** – Menampilkan seluruh data pesawat yang tersimpan  
3. **Ubah Armada** – Mengubah data pesawat berdasarkan nomor urut  
4. **Hapus Armada** – Menghapus data pesawat berdasarkan nomor urut  
5. **Cari Armada** – Mencari data pesawat berdasarkan ID atau tipe  
6. **Keluar** – Mengakhiri program

## Penjelasan Alur Program

### Menu Utama
Saat program dijalankan, pengguna akan melihat 6 pilihan menu:
1. Tambah Armada
2. Lihat Armada
3. Ubah Armada
4. Hapus Armada
5. Cari Armada
6. Keluar

### Pilihan 1 – Tambah Armada
Jika pengguna memilih menu 1, program akan meminta input berupa:
- ID Pesawat
- Tipe Pesawat
- Kapasitas Penumpang

Program akan memvalidasi input:
- ID dan tipe tidak boleh kosong
- Kapasitas harus berupa angka positif

Jika valid, data akan langsung tersimpan dan muncul saat pengguna melihat daftar armada.

### Pilihan 2 – Lihat Armada
Jika pengguna memilih menu 2, program akan menampilkan 5 data armada pesawat yang sudah tersedia, lengkap dengan ID, tipe, dan kapasitas maksimum:

- GA001 – Boeing 777-9 – 440 penumpang  
- GA002 – Airbus A350-1000 – 480 penumpang  
- GA003 – ATR 72-600 – 78 penumpang  
- GA004 – Bombardier Dash 8 Q400 – 90 penumpang  
- GA005 – Airbus A380-800 – 853 penumpang  

### Pilihan 3 – Ubah Armada
Jika pengguna memilih menu 3, program akan meminta nomor urut data yang ingin diubah.  
Setelah pengguna memasukkan nomor dan data baru, program akan memvalidasi input dan langsung memperbarui informasi pesawat tersebut.

### Pilihan 4 – Hapus Armada
Jika pengguna memilih menu 4, program akan meminta nomor urut data yang ingin dihapus.  
Setelah pengguna memasukkan nomor yang valid, data tersebut akan dihapus dari daftar.

### Pilihan 5 – Cari Armada
Jika pengguna memilih menu 5, program akan meminta kata kunci pencarian (ID atau tipe).  
Program akan menampilkan semua armada yang cocok dengan kata kunci tersebut.

### Pilihan 6 – Keluar
Jika pengguna memilih menu 6, program akan menampilkan pesan "Keluar dari program..." dan berhenti berjalan.
