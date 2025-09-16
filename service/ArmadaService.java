/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import model.Armada;
import java.util.ArrayList;

/**
 *
 * @author user
 */

public class ArmadaService {
    private ArrayList<Armada> daftarArmada = new ArrayList<>();

    public ArmadaService() {
        daftarArmada.add(new Armada("GA001", "Boeing 777-9", 440));
        daftarArmada.add(new Armada("GA002", "Airbus A350-1000", 480));
        daftarArmada.add(new Armada("GA003", "ATR 72-600", 78));
        daftarArmada.add(new Armada("GA004", "Bombardier Dash 8 Q400", 90));
        daftarArmada.add(new Armada("GA005", "Airbus A380-800", 853));
    }

    public void tambahArmada(String id, String tipe, int kapasitas) {
        if (id.isEmpty() || tipe.isEmpty()) {
            System.out.println("ID dan Tipe Pesawat tidak boleh kosong.");
            return;
        }
        if (kapasitas <= 0) {
            System.out.println("Kapasitas harus lebih dari 0.");
            return;
        }

        Armada armadaBaru = new Armada(id, tipe, kapasitas);
        daftarArmada.add(armadaBaru);
        System.out.println("Armada berhasil ditambahkan.");
    }

    public void tampilkanArmada() {
        if (daftarArmada.isEmpty()) {
            System.out.println("Belum ada data armada.");
        } else {
            System.out.println("\n====== DAFTAR ARMADA PESAWAT ======");
            for (int i = 0; i < daftarArmada.size(); i++) {
                Armada a = daftarArmada.get(i);
                System.out.println((i+1) + ". ID: " + a.getId() +
                        ", Tipe: " + a.getTipe() +
                        ", Kapasitas: " + a.getKapasitas());
            }
        }
    }

    public void ubahArmada(int index, String idBaru, String tipeBaru, int kapasitasBaru) {
        if (index < 0 || index >= daftarArmada.size()) {
            System.out.println("Nomor tidak ditemukan.");
            return;
        }
        if (idBaru.isEmpty() || tipeBaru.isEmpty()) {
            System.out.println("ID dan Tipe Pesawat tidak boleh kosong.");
            return;
        }
        if (kapasitasBaru <= 0) {
            System.out.println("Kapasitas harus lebih dari 0.");
            return;
        }

        Armada a = daftarArmada.get(index);
        a.setId(idBaru);
        a.setTipe(tipeBaru);
        a.setKapasitas(kapasitasBaru);
        System.out.println("Data armada berhasil diubah.");
    }

    public void hapusArmada(int index) {
        if (index < 0 || index >= daftarArmada.size()) {
            System.out.println("Nomor tidak ditemukan.");
            return;
        }

        daftarArmada.remove(index);
        System.out.println("Data armada berhasil dihapus.");
    }

    public void cariArmada(String keyword) {
        boolean ditemukan = false;
        System.out.println("\n====== HASIL PENCARIAN ======");
        for (int i = 0; i < daftarArmada.size(); i++) {
            Armada a = daftarArmada.get(i);
            if (a.getId().toLowerCase().contains(keyword.toLowerCase()) ||
                a.getTipe().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println((i+1) + ". ID: " + a.getId() +
                        ", Tipe: " + a.getTipe() +
                        ", Kapasitas: " + a.getKapasitas());
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ditemukan armada dengan kata kunci: " + keyword);
        }
    }
}