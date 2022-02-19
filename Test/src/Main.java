import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[])
    {
        Developer dev1 = new Developer("Dorel",4500.0,5.2, "Full-stack");
        Developer dev2 = new Developer("Cornel",2000.0,1.1, "");

        dev1.afisareInformatii();
        dev2.afisareInformatii();

        List<Angajat> angajati = new List<Angajat>();
        angajati.add(dev1);
        angajati.add(dev2);
        Manager m1 = new Manager("Alina", 6300.0, 15.2,angajati );
    }

}
