/**
 * Nama FIle : MOperasiTitik.java 
 * Tanggal   : 1 Maret 2023
 * Penulis   : Nashirudin Baqiy
 * NIM       : 24060119130045
 * Lab       : B2
 * Deskripsi: Kelas MOperasiTitik
 */

public class MOperasiTitik
{
    public static void main(String[] args) {
        Titik t = new Titik(4, 4);
        OperasiTitik o = new OperasiTitik();

        System.out.println("titik (" + t.getAbsis() + ", " + t.getOrdinat() + ")");
        o.refleksiX(t);
        System.out.println("titik setelah refleksi sb X: titik(" + t.getAbsis() + ", " + t.getOrdinat() + ")");
        o.refleksiY(t);
        System.out.println("titik setelah refleksi sb Y: titik(" + t.getAbsis() + ", " + t.getOrdinat() + ")");
    }
}