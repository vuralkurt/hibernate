package h06_ManyToMany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class H4_Fetch {

	public static void main(String[] args) {
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(H1_Ogrenci.class).addAnnotatedClass(H2_Kitap.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		// 1)Id si 111 olan ogrenciyi getir.
		
	//	System.out.println("GETIR "+session.get(H1_Ogrenci.class, 1111));
		
		
		// 2) id si 101 olan kitabi getir.
		
	//System.out.println("Al Sana Kitap   "+session.get(H2_Kitap.class, 101)	);
		
		
		// 3) Adi"math book" olan kitabi getir.
		
//		String sorgu1= "from H2_Kitap k where k.book='math book'";
//		
//		System.out.println(session.createQuery(sorgu1).getSingleResult());   // Yalnizca tek bir eleman icin getSingle kullanilabilir.
//		
		
		//4)Adı "Ali Can" olan öğrenciyi getirin. Kitapları da görmek istiyorum.HQL yazıyoruz, from classismi yazılır.
		//herşey isteniyorsa select* gerek yok
		
//		
//		String hqlQuery3= "SELECT o.name FROM H1_Ogrenci o";
//		
//		List<Object> sorgu3=	session.createQuery(hqlQuery3).getResultList();
//			
//			System.out.println("ogrenciler "+sorgu3);
//		
		
		// 5) sadece student isimlerini getir.
//		
//		String sorgu3="select o.name from H1_Ogrenci o";
//		List<H1_Ogrenci>a1=session.createQuery(sorgu3).getResultList();
//		System.out.println("Yeter ulannn"+a1);
//		
		
		
		// 6) Kitap isimlerini getir
		
		String sorgu4="select k.book from H2_Kitap k";
		List<H2_Kitap>a2=session.createQuery(sorgu4).getResultList();
		System.out.println("Kitaps"+a2);
		
		
		
		
		
		
	tx.commit();	

	}

}
