public class HR extends Angajat{

    public HR(String nume, float salariu, float ani)
    {
        super(nume,salariu,ani);
    }

    @Override
    public void afisareInformatii() {
        super.afisareInformatii();
        System.out.print(", functie HR");
    }
}
