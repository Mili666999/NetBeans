package edunova.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Artikal extends Entitet  {
	
        @Column(nullable = false)
	private String naziv;
	private BigDecimal kolicinaUkupna;
        @ManyToOne
	private Kategorija kategorije;
        @ManyToOne
	private AOL aol;
	
	public Artikal() {
		
	}

	public Artikal(int id, String naziv, BigDecimal kolicinaUkupna, Kategorija kategorije, AOL aol) {
		super(id);
		this.naziv = naziv;
		this.kolicinaUkupna = kolicinaUkupna;
		this.kategorije = kategorije;
		this.aol = aol;
	}


	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public BigDecimal getKolicinaUkupna() {
		return kolicinaUkupna;
	}
	
	public void setKolicinaUkupna(BigDecimal kolicinaUkupna) {
		this.kolicinaUkupna = kolicinaUkupna;
	}
	
	public Kategorija getKategorije() {
		return kategorije;
	}
	
	public void setKategorije(Kategorija kategorije) {
		this.kategorije = kategorije;
	}
	
	public AOL getAol() {
		return aol;
	}
	
	public void setAol(AOL aol) {
		this.aol = aol;
	}

}
