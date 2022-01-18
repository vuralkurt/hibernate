package h07_crudProje;

public class Main {

	public static void main(String[] args) {
		
		CrudMetodlar metod= new CrudMetodlar();
		
		metod.sessionFactoryOlustur();
		
		// veritabanina personel ekle methodu cagirilacak
//		metod.personelEkle("Vural", "Kurt", 7500);
//		metod.personelEkle("Ömer", "Bilgic", 6000);
//		metod.personelEkle("Ahmet", "Can", 5000);
//		metod.personelEkle("Bobby", "Dixon", 8500);
//		metod.personelEkle("Bojan", "Bogdonoic", 9000);
		
		
	//	metod.idIlePersonelSil(3);
		
		
	//	metod.idIleMaasGuncelle(1, 20000);
		
		metod.tumPersoneliListele();
		
		//metod.sil();
		
		// Dersler  akici ve yeterliydi,eksik birsey kalmadi.Hersey icin  Tesekkürler

	}

}
