import java.util.Scanner;

class midTeori {
	public static void main (String[] args){
	String nama;
	double tugas1, tugas2, tugas3, mid, fin, nilaiAkhir, rata;
	rata = 0;

	Scanner input = new Scanner(System.in);	
	proses a = new proses();
	
	System.out.print("Nama : ");
	nama = input.nextLine();
	System.out.print("Nilai Tugas 1 : ");
	tugas1 = input.nextDouble();
	System.out.print("Nilai Tugas 2 : ");
	tugas2 = input.nextDouble();
	System.out.print("Nilai Tugas 3 : ");
	tugas3 = input.nextDouble();
	System.out.print("Nilai MID : ");
	mid = input.nextDouble();
	System.out.print("Nilai Final : ");
	fin = input.nextDouble();
	

	a.hitung(tugas1,tugas2,tugas3);
	a.akhir(rata, mid, fin);
	a.huruf(nama);
	}
	
}