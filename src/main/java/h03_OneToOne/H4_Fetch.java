package h03_OneToOne;

import java.util.Arrays;
import java.util.List;

import javax.persistence.criteria.From;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class H4_Fetch {

	public static void main(String[] args) {
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(H1_Kisi.class)
				.addAnnotatedClass(H2_Gunluk.class);

        SessionFactory sf = con.buildSessionFactory();
         Session session = sf.openSession();

         Transaction tx = session.beginTransaction();
         
         
         
//         
//         // 1)id=101 olan kisi bilgileri getir.
//         
//         
//       System.out.println("1.soru"+  session.get(H1_Kisi.class, 101));
//         
//               
//                  
//         System.out.println();
//         
//         // 2) id=12 olan gunluk bilgileri getir.
//         
//         
//         System.out.println("2.soru"+session.get(H2_Gunluk.class, 12));
//         
         
         
         // 3)Gunluk classindaki tum verileri getir.(DONGULU)====> istenilmeyen
         
//         for (int i=12; i<15 ; i++) {
//        	 
//        	 System.out.println("tercih edilmeyen yol"+session.get(H2_Gunluk.class, i));
//			
//		}
         
         // iki tablodaki kayitlarin hepsini getir.  =======> daha efektif
         
         
    //  List<Object>list= session.createQuery( "from H1_Kisi k JOIN H2_Gunluk g ON k.kisiId=g.kisi").getResultList();
         
    //  list.stream().forEach((t)->System.out.println(Arrays.deepToString((Object[]) t)));
        
         
         
         
         
      
      //SQL komutlari
      
    //3) Kisiler ve Gunlukler tablolarindaki ortak olan (one to one ile birebir bağladığımız) kayıtların,
	// Kisi adi, gunluk yazisi(yazilar) ve kisi yası (kisiYas) bilgilerini sorgulayiniz.
      
      String sorgu ="select k.kisi_ad,g.owner,k.kisiYas from kisiler k inner join gunlukler g on k.kisi_id=g.baglanti";
      
      
      List<Object[]>sonuc=session.createSQLQuery(sorgu).getResultList();
      
      for (Object[] w : sonuc) {
    	  
    	  System.out.println(Arrays.deepToString((Object[]) w));
		
	}
     
      
  
         tx.commit();

	}

}
