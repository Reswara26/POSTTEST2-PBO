/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import java.util.ArrayList;
import java.util.Scanner;
import service.ArmadaService;

/**
 *
 * @author user
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArmadaService service = new ArmadaService();

        int menu = 0;

        while (menu != 6) {
            System.out.println("\n====== MENU ARMADA PESAWAT ======");
            System.out.println("1. Tambah Armada");
            System.out.println("2. Lihat Armada");
            System.out.println("3. Ubah Armada");
            System.out.println("4. Hapus Armada");
            System.out.println("5. Cari Armada");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            if (!sc.hasNextInt()) {
                System.out.println("Input harus berupa angka.");
                sc.nextLine();
                continue;
            }

            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan ID Pesawat: ");
                String id = sc.nextLine().trim();
                System.out.print("Masukkan Tipe Pesawat: ");
                String tipe = sc.nextLine().trim();
                System.out.print("Masukkan Kapasitas Penumpang: ");

                if (!sc.hasNextInt()) {
                    System.out.println("Kapasitas harus berupa angka.");
                    sc.nextLine();
                    continue;
                }

                int kapasitas = sc.nextInt();
                sc.nextLine();

                service.tambahArmada(id, tipe, kapasitas);

            } else if (menu == 2) {
                service.tampilkanArmada();

            } else if (menu == 3) {
                System.out.print("Masukkan nomor data yang ingin diubah: ");

                if (!sc.hasNextInt()) {
                    System.out.println("Nomor harus berupa angka.");
                    sc.nextLine();
                    continue;
                }

                int no = sc.nextInt();
                sc.nextLine();

                System.out.print("ID Pesawat baru: ");
                String idBaru = sc.nextLine().trim();
                System.out.print("Tipe Pesawat baru: ");
                String tipeBaru = sc.nextLine().trim();
                System.out.print("Kapasitas baru: ");

                if (!sc.hasNextInt()) {
                    System.out.println("Kapasitas harus berupa angka.");
                    sc.nextLine();
                    continue;
                }

                int kapasitasBaru = sc.nextInt();
                sc.nextLine();

                service.ubahArmada(no - 1, idBaru, tipeBaru, kapasitasBaru);

            } else if (menu == 4) {
                System.out.print("Masukkan nomor data yang ingin dihapus: ");

                if (!sc.hasNextInt()) {
                    System.out.println("Nomor harus berupa angka.");
                    sc.nextLine();
                    continue;
                }

                int no = sc.nextInt();
                sc.nextLine();

                service.hapusArmada(no - 1);

            } else if (menu == 5) {
                System.out.print("Masukkan kata kunci pencarian (ID atau Tipe): ");
                String keyword = sc.nextLine().trim();
                service.cariArmada(keyword);

            } else if (menu == 6) {
                System.out.println("Keluar dari program...");
            } else {
                System.out.println("Pilihan tidak tersedia.");
            }
        }

        sc.close();
    }
}