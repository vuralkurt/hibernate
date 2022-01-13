package h01_anotasyonlar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class H2_Save {

	public static void main(String[] args) {
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(H1_Sehir.class);
		
		SessionFactory sf =con.buildSessionFactory();  // acacagimiz alanlar parenti,  alan fabrikasi
		
		Session session =sf.openSession();		//alan fabrikasindan yer baslattik
		
		
		
		// Acilan session icerisinde islemlere baslayabilmek icin Transaction aciyoruz.
		
				/*Transactionlar ile bir işlem yarıda kaldıysa veya 
				 * tam olarak tamamlanadıysa tüm adımlar başa alınır
				 * veri ve işlem güvenliği için önemlidir.Kısacası ya hep 
				 * ya hiç prensibine göre çalışır
				 */
		Transaction tx =session.beginTransaction();
        H1_Sehir sehir1 = new H1_Sehir(37, "Istanbul", 10000000);
		
		session.save(sehir1);
		
		
		
		tx.commit();
		
		sf.close();
		session.close();
		
		
		
		
		
	}

}
