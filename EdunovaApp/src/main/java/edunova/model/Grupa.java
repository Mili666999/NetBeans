package edunova.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

@Entity
public class Grupa extends Entitet {
	
	private String naziv;
        @ManyToOne
	private Smjer smjer;
	private Integer maxPolaznika;
        @ManyToOne
	private Predavac predavac;
	private Date datumPocetka;
        @ManyToMany
	private List<Polaznik> polaznici;

    public Grupa() {
    }

    public Grupa(String naziv, Smjer smjer, Integer maxPolaznika, Predavac predavac, Date datumPocetka, List<Polaznik> polaznici, Integer sifra) {
        super(sifra);
        this.naziv = naziv;
        this.smjer = smjer;
        this.maxPolaznika = maxPolaznika;
        this.predavac = predavac;
        this.datumPocetka = datumPocetka;
        this.polaznici = polaznici;
    }

    public String getNaziv() {
        return naziv;
    }

    public Smjer getSmjer() {
        return smjer;
    }

    public Integer getMaxPolaznika() {
        return maxPolaznika;
    }

    public Predavac getPredavac() {
        return predavac;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public List<Polaznik> getPolaznici() {
        return polaznici;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }

    public void setMaxPolaznika(Integer maxPolaznika) {
        this.maxPolaznika = maxPolaznika;
    }

    public void setPredavac(Predavac predavac) {
        this.predavac = predavac;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public void setPolaznici(List<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }
	
}
