package h01_anotasyonlar;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import antlr.debug.NewLineEvent;



public class H2_Save {

	public static void main(String[] args) {
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(H1_Sehir.class);
		
		SessionFactory sf =con.buildSessionFactory();      // acacagimiz alanlar parenti,  alan fabrikasi
		
		Session session =sf.openSession();		           //alan fabrikasindan yer baslattik
		
		
		
		// Acilan session icerisinde islemlere baslayabilmek icin Transaction aciyoruz.
		
				/*Transactionlar ile bir işlem yarıda kaldıysa veya 
				 * tam olarak tamamlanadıysa tüm adımlar başa alınır
				 * veri ve işlem güvenliği için önemlidir.Kısacası ya hep 
				 * ya hiç prensibine göre çalışır
				 */
		
		Transaction tx =session.beginTransaction();
		
//        H1_Sehir sehir1 = new H1_Sehir(37, "Istanbul", 10000000);
//        
//		session.save(sehir1);// insert into
//		
//		session.save(new H1_Sehir(35,"Izmir",2500000));
//		
		
		//DISARIDAN VERI GIRELIM
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Plaka gir");
		int plaka =scan.nextInt();
		
		System.out.println("Sehir gir");
		String sehir =scan.next();
		
		System.out.println("Nufus gir");
		int nufus =scan.nextInt();
		
		
		session.save(new H1_Sehir(plaka,sehir,nufus));
		
		
		
		
		tx.commit(); // islemleri database e hizli gitmesini saglar
		
		sf.close();
		session.close();
		scan.close();
		
		
		
		
	}

}
