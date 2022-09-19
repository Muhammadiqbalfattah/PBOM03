
public class latihanArray {
    public static void main (String []args){
        /* array digunakan untuk menyimpan data lebih dari 1 */
        String [] motor = {"Honda", "Yamahal", "Vespa"};
        int [] angka = {4,5,6,7,8,10};

        //akses nilai array dari total baris dikurangi dengan 1 sehingga pas di target.
        System.out.println("Menampilkan data secara manual : ");
        System.out.println("Nilai  ke satu adalah : " + angka[0]);
        System.out.println("Nilai  ke dua adalah : " + angka[1]);
        System.out.println("Nilai  ke tiga adalah : " + angka[2]);
        System.out.println("Nilai  ke empat adalah : " + angka[3]);
        System.out.println("Nilai  ke lima adalah : " + angka[4]);

        // menampilkan data secara loop (cara 1) :
        System.out.println("Menampilakn data dengan loop !");
        for (int i =0; i <= 5;i++){
            System.out.println(" Nilai ke - " + (i+1) + " adalah " + angka[i]);
        }
        // menampilkan data secara loop (cara 2)
        System.out.println("Menampilakn data dengan loop 2 !");
        int j = 1;
        for (int nilai : angka) {
            System.out.println(" Nilai ke - " + j + " adalah" + angka );
            j++;
        }


        //mengganti nilai array
       // angka[6] = 30;

        //tampilkan nilai yang telah diubah
      //  System.out.println("Nilai ketiga adalah : "+ angka[6]);
    }
}
