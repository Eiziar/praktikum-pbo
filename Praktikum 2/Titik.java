/**
 * Nama FIle : Titik.java 
 * Tanggal   : 3 Maret 2021
 * Penulis : Muhamad Khafidz Haikal
 * Deskripsi : kelas Titik
 * 
 */ 
 
 class Titik{
	double absis; //absis
	double ordinat; //ordinat
	static int counterTitik; //penghitung objek titik yang telah dibuat
	//tugas dalam post test 
	Titik(double a,double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
		
	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat(double o){
		ordinat = o;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}
    void setAbsis(double a, double increment) {
        absis = a;
        ordinat = a + increment;
    }
    public Titik(double a, double b) {
        absis = a;
        ordinat = b;
        counterTitik++;
    }
 }