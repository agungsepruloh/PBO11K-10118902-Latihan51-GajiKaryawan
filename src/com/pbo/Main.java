package com.pbo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println("===== Perhitungan Gaji Karyawan =====");
        System.out.print("Masukkan NIK\t: ");
        Scanner scanner = new Scanner(System.in);
        manager.setNik(scanner.nextLine());
        System.out.print("Masukkan Nama\t: ");
        manager.setNama(scanner.nextLine());
        System.out.print("Masukkan Golongan (1/2/3)\t\t: ");
        Scanner scanner1 = new Scanner(System.in);
        manager.setGolongan(scanner1.nextInt());
        System.out.print("Masukkan Jabatan(Manager/Kabag)\t: ");
        manager.setJabatan(scanner.nextLine());
        System.out.print("Masukkan Jumlah Kehadiran\t\t: ");
        manager.setKehadiran(scanner1.nextInt());

        System.out.println();
        System.out.println("===== Hasil Perhitungan =====");
        System.out.println("NIK\t\t\t: ".concat(manager.getNik()));
        System.out.println("NAMA\t\t: ".concat(manager.getNama()));
        System.out.println("GOLONGAN\t: ".concat(String.valueOf(manager.getGolongan())));
        System.out.println("JABATAN\t\t: ".concat(manager.getJabatan()));
        System.out.println();

        System.out.println("TUNJANGAN GOLONGAN\t: " + manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: " + manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: " + manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println("\nGAJI TOTAL\t\t\t: " + manager.gajiTotal());
    }

}
