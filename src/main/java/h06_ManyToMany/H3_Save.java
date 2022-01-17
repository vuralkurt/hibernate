package h06_ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class H3_Save {

	public static void main(String[] args) {
		
		H2_Kitap art = new H2_Kitap(101,"art book");
		H2_Kitap math = new H2_Kitap(102,"math book");
		H2_Kitap science = new H2_Kitap(103,"science book");
		H1_Ogrenci student1 = new H1_Ogrenci(1111,"Beyhan Can",11);
		H1_Ogrenci student2 = new H1_Ogrenci(2222, "Ali Can",10);
		H1_Ogrenci student3 = new H1_Ogrenci(3333,"Ayse Tan",12);

		student1.getBooks().add(art);
		student1.getBooks().add(science);
		student1.getBooks().add(math);
		
		student2.getBooks().add(art);
		
		student3.getBooks().add(art);
		student3.getBooks().add(math);
		
		
//		art.getStudents().add(student1);            TERSTEN BIRLESTIRME
//		art.getStudents().add(student2);	
//		art.getStudents().add(student3);
//		math.getStudents().add(student1);
//		math.getStudents().add(student3);
//		science.getStudents().add(student1);	
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(H1_Ogrenci.class).addAnnotatedClass(H2_Kitap.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		session.save(student1);
		session.save(student2);
		session.save(student3);
		session.save(art);
		session.save(math);
		session.save(science);
		
		
	tx.commit();	
		
	}

}
