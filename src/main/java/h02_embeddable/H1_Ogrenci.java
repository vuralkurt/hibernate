package h02_embeddable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ogrenciler") 
public class H1_Ogrenci {
	
	


	@Id
	private int ogrId;
	private String adString;
	private int ogrNot;
	private H2_Dersler dersler;
	
	public H1_Ogrenci() {
		
	}
	
	
	public H1_Ogrenci(int ogrId, String adString, int ogrNot, H2_Dersler dersler) {
		super();
		this.ogrId = ogrId;
		this.adString = adString;
		this.ogrNot = ogrNot;
		this.dersler = dersler;
	}


	public int getOgrId() {
		return ogrId;
	}


	public void setOgrId(int ogrId) {
		this.ogrId = ogrId;
	}


	public String getAdString() {
		return adString;
	}


	public void setAdString(String adString) {
		this.adString = adString;
	}


	public int getOgrNot() {
		return ogrNot;
	}


	public void setOgrNot(int ogrNot) {
		this.ogrNot = ogrNot;
	}


	public H2_Dersler getDersler() {
		return dersler;
	}


	public void setDersler(H2_Dersler dersler) {
		this.dersler = dersler;
	}


	@Override
	public String toString() {
		return "H1_Ogrenci [ogrId=" + ogrId + ", adString=" + adString + ", ogrNot=" + ogrNot + ", dersler=" + dersler
				+ "]";
	}


	
	
	
}
