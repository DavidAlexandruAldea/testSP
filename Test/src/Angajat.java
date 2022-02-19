public abstract class Angajat {
    String nume;
    float salariu;
    float aniVechime;

    public Angajat(String n, float s, float a)
    {
        this.nume = n;
        this.salariu = s;
        this.aniVechime = a;
    }
    public void afisareInformatii()
    {
        System.out.println("Angajat: " + this.nume + ", salariu: "+ this.salariu+", ani vechime: "+this.aniVechime);
    }
}
