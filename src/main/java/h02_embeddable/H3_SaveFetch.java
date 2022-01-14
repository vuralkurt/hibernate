package h02_embeddable;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import h01_anotasyonlar.H1_Sehir;

public class H3_SaveFetch {

	public static void main(String[] args) {
	
		SessionFactory sf	= new Configuration().configure("hibernate.cfg.xml")
			    .addAnnotatedClass(H1_Ogrenci.class).buildSessionFactory();
			
			
		Session session =sf.openSession();	
			
		Transaction tx =session.beginTransaction();
		
		
//		H2_Dersler ders1=new H2_Dersler("MUZIK","FIZIK");
//		
//		H1_Ogrenci ogrenci1= new H1_Ogrenci(111, "Vural Kurt", 95,ders1);
//		
//		session.save(ogrenci1);
//		
//		
//		H1_Ogrenci ogrenci2 = new H1_Ogrenci(222, "Turgay Okur", 90, new H2_Dersler("MUZIK","FIZIK"));
//		
//		session.save(ogrenci2);
//		
		
//		H1_Ogrenci ogrenci3 = new H1_Ogrenci(333, "Gokhan Ozturk", 100, new H2_Dersler("Resim","Matematik"));
//		
//		session.save(ogrenci3);
		
//		H1_Ogrenci ogrenci4 = new H1_Ogrenci(444, "Ali Gel", 70, new H2_Dersler("Beden","Kimya"));
//		session.save(ogrenci4);
//		
//		
		// Fetch Islemi
		
		
//		System.out.println("Ogrenci 1"+ session.get(H1_Ogrenci.class,111));
		
//		Scanner scan= new Scanner(System.in);
//		
//		System.out.println("Silinecek no gir");
//		int no=scan.nextInt();
//		
//		session.delete(session.get(H1_Ogrenci.class,no));
		
		session.get(H1_Ogrenci.class, 222).setAdString("Husamettin");
		
		
		
		
		
		
		
	tx.commit();	
	}

}
