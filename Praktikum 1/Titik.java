/**
 * Nama FIle : Titik.java 
 * Tanggal   : 27 Februari 2023
 * Penulis   : Nashirudin Baqiy
 * NIM       : 24060119130045
 * Lab       : B2
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
	//end tugas
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

 }