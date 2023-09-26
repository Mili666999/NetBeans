package edunova.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Artikal extends Entitet {

    @Column(nullable = false)
    private String naziv;
    private BigDecimal kolicinaUkupna;
    @ManyToMany
    private List<Kategorija> kategorije;
    @ManyToMany
    private List<AOL> aoli;

    public Artikal() {
    }

    public Artikal(String naziv, BigDecimal kolicinaUkupna, List<Kategorija> kategorije, List<AOL> aoli, Integer id) {
        super(id);
        this.naziv = naziv;
        this.kolicinaUkupna = kolicinaUkupna;
        this.kategorije = kategorije;
        this.aoli = aoli;
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

    public List<Kategorija> getKategorije() {
        return kategorije;
    }

    public void setKategorije(List<Kategorija> kategorije) {
        this.kategorije = kategorije;
    }

    public List<AOL> getAoli() {
        return aoli;
    }

    public void setAoli(List<AOL> aoli) {
        this.aoli = aoli;
    }

}
