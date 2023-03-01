/**
 * Nama FIle : OperasiTitik.java 
 * Tanggal   : 1 Maret 2023
 * Penulis   : Nashirudin Baqiy
 * NIM       : 24060119130045
 * Lab       : B2
 * Deskripsi: Kelas OperasiTitik
 */

class OperasiTitik 
{
    protected double x;
    protected double y;

    private void refleksiSumbuX(Titik titik) 
    {
        x = titik.getOrdinat();
        x = x * (-1);
        titik.setOrdinat(x);
    }

    private void refleksiSumbuY(Titik titik)
    {
        y = titik.getAbsis();
        y = y * (-1);
        titik.setAbsis(y);
    }

    public void refleksiX(Titik titik)
    {
        x = titik.getOrdinat();
        x = x * (-1);
        titik.setOrdinat(x);
        return x;
    }

    public void refleksiY(Titik titik)
    {
        y = titik.getAbsis();
        y = y * (-1);
        titik.setAbsis(y);
        return y;
    }

}