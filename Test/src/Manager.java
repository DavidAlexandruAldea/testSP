import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Manager extends Angajat{
    List<Angajat> angajati;
    public Manager(String nume, float salariu, float ani, List<Angajat> ang)
    {
        super(nume,salariu,ani);
        this.angajati = ang;
    }
    @Override
    public void afisareInformatii() {
        super.afisareInformatii();
        System.out.print(", functie Manager");
    }
}
