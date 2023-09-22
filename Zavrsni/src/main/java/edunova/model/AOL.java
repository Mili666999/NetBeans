package edunova.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
public class AOL extends Entitet {
	
	private BigDecimal kolicinaNaLokaciji;
        @ManyToOne
	private Oblik oblici;
        @ManyToOne
	private Lokacija lokacije;
	
	public AOL() {
		
	}

	public AOL(int id, BigDecimal kolicinaNaLokaciji, Oblik oblici, Lokacija lokacije) {
		super(id);
		this.kolicinaNaLokaciji = kolicinaNaLokaciji;
		this.oblici = oblici;
		this.lokacije = lokacije;
	}


	public BigDecimal getKolicinaNaLokaciji() {
		return kolicinaNaLokaciji;
	}

	public void setKolicinaNaLokaciji(BigDecimal kolicinaNaLokaciji) {
		this.kolicinaNaLokaciji = kolicinaNaLokaciji;
	}

	public Oblik getOblici() {
		return oblici;
	}

	public void setOblici(Oblik oblici) {
		this.oblici = oblici;
	}

	public Lokacija getLokacije() {
		return lokacije;
	}

	public void setLokacije(Lokacija lokacije) {
		this.lokacije = lokacije;
	}
	
}
