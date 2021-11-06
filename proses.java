public class proses{
	double nilaiAkhir;
	void hitung(double tugas1, double tugas2, double tugas3){
	double	rata = (tugas1+tugas2+tugas3)/3;
	}
	
	double akhir(double rata, double mid, double fin){
	return nilaiAkhir = (rata*30/100)+(mid*30/100)+(fin*40/100);
	
	}
	
	void huruf(String nama){
		System.out.println();
		System.out.println("OUTPUT : ");
		System.out.println("Nama : " +nama);
		System.out.println("Nilai Akhir : " +nilaiAkhir);
		if(nilaiAkhir>=80 && nilaiAkhir <=100){
			System.out.println("Nilai Huruf : A");
		} else if(nilaiAkhir>=60 && nilaiAkhir <=79){
			System.out.println("Nilai Huruf : B");
		} else if(nilaiAkhir>=50 && nilaiAkhir <=59){
			System.out.println("Nilai Huruf : C");
		} else if(nilaiAkhir>=40 && nilaiAkhir <=49){
			System.out.println("Nilai Huruf : D");
		} else {
			System.out.println("Nilai Huruf : E");
		}
	}
}