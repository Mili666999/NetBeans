package edunova.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
public class AOL extends Entitet {

    private BigDecimal kolicinaNaLokaciji;
    @ManyToOne
    private Oblik oblik;
    @ManyToOne
    private Lokacija lokacija;
    @ManyToOne
    private Artikal artikal;

    public AOL() {
    }

    public AOL(BigDecimal kolicinaNaLokaciji, Oblik oblik, Lokacija lokacija, Artikal artikal, Integer id) {
        super(id);
        this.kolicinaNaLokaciji = kolicinaNaLokaciji;
        this.oblik = oblik;
        this.lokacija = lokacija;
        this.artikal = artikal;
    }

    public BigDecimal getKolicinaNaLokaciji() {
        return kolicinaNaLokaciji;
    }

    public void setKolicinaNaLokaciji(BigDecimal kolicinaNaLokaciji) {
        this.kolicinaNaLokaciji = kolicinaNaLokaciji;
    }

    public Oblik getOblik() {
        return oblik;
    }

    public void setOblik(Oblik oblik) {
        this.oblik = oblik;
    }

    public Lokacija getLokacija() {
        return lokacija;
    }

    public void setLokacija(Lokacija lokacija) {
        this.lokacija = lokacija;
    }

    public Artikal getArtikal() {
        return artikal;
    }

    public void setArtikal(Artikal artikal) {
        this.artikal = artikal;
    }



    
}
