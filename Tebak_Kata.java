package Tebak_Kata;

import java.util.Scanner;

public class Tebak_Kata {

    static Scanner input = new Scanner(System.in);

    static int a = (int) (Math.random() * 9 + 1);
    static int c = 2;
    static int i;
    static int min = 25;
    static int[] c0 = {100};
    static String[] nama = new String[1];

    public static void main(String[] args) {
        game();
    }

    static void game() {

        System.out.println("===================================================");
        System.out.println("| MARI MENEBAK ANGKA 1 - 10 dengan 3X Kesempatan  |");
        System.out.println("===================================================");

        for (i = 0; i < nama.length; i++) {
            System.out.print("\tMasukkan Nama User : ");
            nama[i] = input.nextLine();
        }

        do {
            System.out.println("***********************************************");
            System.out.print("        Masukkan Angka Yang Anda Tebak : ");
            Scanner jawab = new Scanner(System.in);
            int b = jawab.nextInt();
            System.out.println("-----------------------------------------------");

            if (c == 2) {
                if (b == a) {
                    System.out.println("Selamat!!! Angka yang anda masukkan BENAR!");
                    System.out.println("\tNama  : " + nama[0]);
                    System.out.println("\tScore : " + c0[0]);
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
                    break;
                } else if (b < a) {
                    System.out.println("Maaf, angka yang anda masukkan terlalu KECIL.");
                } else if (b > a) {
                    System.out.println("Maaf, angka yang anda masukkan terlalu BESAR.");
                }

                System.out.println("    Anda Memiliki " + c + " Kesempatan Lagi!!");
                System.out.println("-----------------------------------------------");
                c--;
            } else if (c == 1) {
                if (b == a) {
                    System.out.println("Selamat!!! Angka yang anda masukkan BENAR!");
                    System.out.println("\tNama  : " + nama[0]);
                    System.out.println("\tScore : " + (c0[0] - 25));
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
                    break;
                } else if (b < a) {
                    System.out.println("Maaf, angka yang anda masukkan terlalu KECIL.");
                } else if (b > a) {
                    System.out.println("Maaf, angka yang anda masukkan terlalu BESAR.");
                }

                System.out.println("    Anda Memiliki " + c + " Kesempatan Lagi!!");
                System.out.println("-----------------------------------------------");
                c--;
            } else if (c == 0) {
                if (b == a) {
                    System.out.println("Selamat!!! Angka yang anda masukkan BENAR!");
                    System.out.println("\tNama  : " + nama[0]);
                    System.out.println("\tScore : " + (c0[0] - 50));
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
                    break;
                }
                System.out.println("Kesempatan Anda Habis !");
                System.out.println("Angka yang dimaksud adalah : " + a);
                System.out.println("\tNama  : " + nama[0]);
                System.out.println("\tScore : " + (c0[0] - 100));
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
                c--;
            }

        } while (c >= 0);
    }
}
