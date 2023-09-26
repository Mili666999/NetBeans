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

    public AOL(BigDecimal kolicinaNaLokaciji, List<Oblik> oblici, List<Lokacija> lokacije, Integer id) {
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

    public List<Oblik> getOblici() {
        return oblici;
    }

    public void setOblici(List<Oblik> oblici) {
        this.oblici = oblici;
    }

    public List<Lokacija> getLokacije() {
        return lokacije;
    }

    public void setLokacije(List<Lokacija> lokacije) {
        this.lokacije = lokacije;
    }

    
}
