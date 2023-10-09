package socopan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Artikal extends Entitet {

    @Column(nullable = false)
    private String naziv;
    private BigDecimal kolicinaUkupna;
    @ManyToOne
    private Kategorija kategorija;
    @OneToMany(mappedBy = "artikal")
    private List<AOL> aoli;

    public Artikal() {
    }

    public Artikal(String naziv, BigDecimal kolicinaUkupna, Kategorija kategorija, List<AOL> aoli, Integer id) {
        super(id);
        this.naziv = naziv;
        this.kolicinaUkupna = kolicinaUkupna;
        this.kategorija = kategorija;
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

    public Kategorija getKategorija() {
        return kategorija;
    }

    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
    }

    public List<AOL> getAoli() {
        return aoli;
    }

    public void setAoli(List<AOL> aoli) {
        this.aoli = aoli;
    }



}
