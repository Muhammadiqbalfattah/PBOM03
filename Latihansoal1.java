    //Buatlah program untuk menginput nilai array berikut dari coding
    //{10,3,40,50,15,10,5,7,8}

    //Buatlah mekanisme untuk :
    /* 1) menjumlah data array di atas
    2) Nilai rata-rata data array di atas
    3) mencari nilai tertentu dari array diatas, jika ada datanya ditampilkan dan tidak ada beri pesan error
    output :
        masukkan nilai : (10)
        angka 10 ada pada array.
        masukkan bilai :(20)
        angka 20 tidak ada pada array.
     */

    //Nomor 1

    import java.util.Scanner;

    public class Latihansoal1 {
    public static void main (String[] args){
        int [] angka = {10,3,40,50,15,10,5,7,8};
        System.out.println("----------------------------------------------------");
        System.out.println("    Menampilkan data input dari coding/komputer ! ");
        for (int i =0; i <= 8;i++) {
            System.out.println("            Angka ke - " + ( i+ 1)+ " adalah : " + angka[i]);
        }
        System.out.println("----------------------------------------------------");

        //Program Menjumlah Array
        int sum = 0;
        System.out.println(    "Program Penjumlahan Angka !");
        System.out.println("----------------------------------------------------");
        for (int x : angka) {
            sum = sum+x;
        }
        System.out.println(" Jumlah total dalam Array : " + sum);

        System.out.println("----------------------------------------------------");

        //Nomor 2
        //Program mencari nilai rata-rata
        int rata = 0;
        System.out.println("Program Mencari Rata-rata !");
        System.out.println("----------------------------------------------------");
        for ( int o : angka){
            rata= sum/8;
        }
        System.out.println(" Rata-rata nya adalah : "+ rata);

        System.out.println("---------------------------------------------------");

        //Nomor 3
        //Mencari nilai array
        int in;
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan angka di antara 10,3,40,50,15,10,5,7,8 : ");
        in = sc.nextInt();
        //Validasi
            if (in == 10) {
                System.out.println("--------------------------------------------------------");
                System.out.println("                Angka 10 ada pada Array                 ");
            } else if (in == 3) {
                System.out.println("--------------------------------------------------------");
                System.out.println("                Angka 3 ada pada Array                  ");
            } else if (in == 40) {
                System.out.println("--------------------------------------------------------");
                System.out.println("                Angka 40 ada pada Array                 ");
            } else if (in == 50) {
                System.out.println("--------------------------------------------------------");
                System.out.println("                Angka 50 ada pada Array                 ");
            } else if (in == 15) {
                System.out.println("--------------------------------------------------------");
                System.out.println("                Angka 15 ada pada Array                 ");
            } else if (in == 5) {
                System.out.println("--------------------------------------------------------");
                System.out.println("                Angka 5 ada pada Array                  ");
            } else if (in == 7) {
                System.out.println("--------------------------------------------------------");
                System.out.println("                Angka 7 ada pada Array                  ");
            } else if (in == 8) {
                System.out.println("--------------------------------------------------------");
                System.out.println("                Angka 8 ada pada Array                  ");
            } else {
                System.out.println("-----------------------------------------------");
                System.out.println("                Masukkan nilai : " + in);
                System.out.println("        Angka " + in + " Tidak ada pada Array !");
             }
    }

}

//DONE