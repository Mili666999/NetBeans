package edunova.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Kategorija extends Entitet {
	
        @Column(nullable = false)
	private String naziv;
	
	
	public Kategorija() {
		
	}

	public Kategorija(int id, String naziv) {
		super(id);
		this.naziv = naziv;
	}


	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@Override
	public String toString() {
		return naziv;
	}

}
