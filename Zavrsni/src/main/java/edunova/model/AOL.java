package edunova.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class AOL extends Entitet {
	
	private BigDecimal kolicinaNaLokaciji;
        @ManyToMany
	private List<Oblik> oblici;
        @ManyToMany
	private List<Lokacija> lokacije;
	
	public AOL() {
		
	}

	public AOL(int id, BigDecimal kolicinaNaLokaciji, Oblik oblici, Lokacija lokacije) {
		super(id);
		this.kolicinaNaLokaciji = kolicinaNaLokaciji;
		this.oblici = (List<Oblik>) oblici;
		this.lokacije = (List<Lokacija>) lokacije;
	}


	public BigDecimal getKolicinaNaLokaciji() {
		return kolicinaNaLokaciji;
	}

	public void setKolicinaNaLokaciji(BigDecimal kolicinaNaLokaciji) {
		this.kolicinaNaLokaciji = kolicinaNaLokaciji;
	}

	public Oblik getOblici() {
		return (Oblik) oblici;
	}

	public void setOblici(Oblik oblici) {
		this.oblici = (List<Oblik>) oblici;
	}

	public Lokacija getLokacije() {
		return (Lokacija) lokacije;
	}

	public void setLokacije(Lokacija lokacije) {
		this.lokacije = (List<Lokacija>) lokacije;
	}
	
}
