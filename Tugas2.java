package tugas;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        System.out.println("Daftar Vaksin");
        System.out.println("Masukan nama lengkap");
        Scanner input1 = new Scanner(System.in);
        String nama = input1.nextLine();
        System.out.println("Masukan alamat lengkap");
        Scanner input2 = new Scanner(System.in);
        String alamat = input2.nextLine();
        System.out.println("Masukan NIK");
        Scanner input3 = new Scanner(System.in);
        int NIK = input3.nextInt();
        System.out.println("Masukan tanggla lahir");
        Scanner input4 = new Scanner(System.in);
        int ttl = input4.nextInt();
        System.out.println("Sebelumnya sudah pernah vaksin belum (ya/tidak)");
        Scanner input5 = new Scanner(System.in);
        String bul = input5.nextLine();
        int terakhir = 0;
        if (bul.equals("ya")) {
            System.out.println("Terakhir vaksin ke berapa");
            Scanner inputAkhir = new Scanner(System.in);
             terakhir = inputAkhir.nextInt();
        }

        Tugas2Model tugas2Model = new Tugas2Model(nama,alamat,NIK,ttl,bul,terakhir);
        System.out.println(tugas2Model);
    }
}
