package edunova.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Lokacija extends Entitet {

    @Column(nullable = false)
    private String naziv;
    @OneToMany(mappedBy = "lokacija")
    private List<AOL> aoli;

    public Lokacija() {

    }

    public Lokacija(int id, String naziv) {
        super(id);
        this.naziv = naziv;
    }

    public List<AOL> getAoli() {
        return aoli;
    }

    public void setAoli(List<AOL> aoli) {
        this.aoli = aoli;
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
