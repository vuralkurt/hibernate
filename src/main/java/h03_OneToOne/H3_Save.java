package h03_OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class H3_Save {

	public static void main(String[] args) {
		
		
		//gunluk bilgileri
		H2_Gunluk gunluk1 = new H2_Gunluk(11, "Mehmet'in Gunlugu");//insert into
		H2_Gunluk gunluk2 = new H2_Gunluk(12, "Alinin Gunlugu");
		H2_Gunluk gunluk3 = new H2_Gunluk(13, "Tayyarın Gunlugu");
		H2_Gunluk gunluk4 = new H2_Gunluk(14, "Osman ın Gunlugu");
		//kisiler bilgileri 
		H1_Kisi kisi1 = new H1_Kisi(101, "Mehmet Can", 10);
		H1_Kisi kisi2 = new H1_Kisi(102, "Ali Han", 9);
		H1_Kisi kisi3 = new H1_Kisi(103, "Tayyar Tan", 11);
		
		
		//gunluklere sahip atanacak
		
		gunluk1.setKisi(kisi1);
		gunluk2.setKisi(kisi2);
		gunluk3.setKisi(kisi3);
		
		// buraya kadar olan seyler java ile ilgili
		
		//mysql baglama kismina geciyoruz
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(H1_Kisi.class)
				.addAnnotatedClass(H2_Gunluk.class);

        SessionFactory sf = con.buildSessionFactory();
         Session session = sf.openSession();

         Transaction tx = session.beginTransaction();
		
		//  gunluklerin ve kisilerin veritabanina kaydedilmesi
        //  hersey mysql icindedir.
         session.save(gunluk1);
         session.save(gunluk2);
         session.save(gunluk3);
         session.save(gunluk4);
         session.save(kisi1);
         session.save(kisi2);
         session.save(kisi3);
         
         gunluk1.getKisi();
         
         
         
         
         
         tx.commit();
		

	}

}
