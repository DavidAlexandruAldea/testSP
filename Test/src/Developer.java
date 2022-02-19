public class Developer extends Angajat{
    static List<String> tipuri = Arrays.asList("Front-end", "Back-end", "Full-stack", "");
    String tipDev;

    public Developer(String nume, float salariu, float aniVechime ,String tipDev) {
        super(nume, salariu, aniVechime);
        if(Developer.tipuri.contains("tipDev")) this.tipDev = tipDev;
        else this.tipDev = "";
    }

    public void setTipDev(String tip)
    {
        if(Developer.tipuri.contians(tip)) this.tipDev = tip;
        else this.tipDev = "";
    }

    public String getTipDev() {
        if(this.tipDev.equals(""))
            return new String("Necunoscut");
        else
            return this.tipDev;
    }

    @Override
    public void afisareInformatii() {
        super.afisareInformatii();
        System.out.print(", functie: Developer de tip "+  getTipDev());
    }
}
