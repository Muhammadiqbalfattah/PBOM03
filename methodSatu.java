public class methodSatu {
    /*   static void welcome(String namaDepan, double absen, double tugas, double uts, double uas) {
           System.out.println(" Selamat Datang, " + namaDepan);
       }
       static void
       public static void main(String[] args) {
           welcome("Raka");
           welcome("Radeus");
           welcome("Sisca");
           welcome("Vania");
           String nd = "Mayden";
           welcome(nd);
       }
   } */
    static void welcome(String namaDepan, double absen, double tugas, double uts, double uas) {
        System.out.println(" Selamat Datang, " + namaDepan);
        double nilaiAkhir = (0.1 * absen) + (0.2 * tugas) + (0.3 * uts) + (0.4 * uas);
        System.out.println(" Nilai " + namaDepan + "adalah" + nilaiAkhir);
    }

    public static void main(String[] args) {
        String nd = "Mayden";
        double absen = 70;
        double tugas = 50;
        double uts = 100;
        double uas = 40;
       welcome(nd,absen,tugas,uts,uas);
    }
}
