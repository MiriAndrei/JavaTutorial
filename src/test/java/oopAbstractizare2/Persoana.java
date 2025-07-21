package oopAbstractizare2;

public abstract class Persoana {

    //Abstractizare = conceptul prin care definim comportamentul unei clase
    //clasa abstracta se identifica prin cuvantul abstract la nivelul clasei
    //o clasa abstracta poate sau nu sa contina metode abstracte
    //intr-o clasa abstracta putem avea metode de tip public, private, protected
    //intr-o clasa abstracta putem avea un constructor => nu putem facem un obiect dintr-o clasa abstracta
    //o clasa poate mosteni o singura clasa/clasa abstracta
    //cand o clasa abstracta este mostenita trebuie sa i se implementeze toate metodele abstracte

    public String nume;
    public String prenume;
    public int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public abstract void mergeLaBirou();
    public abstract void primesteSalariu();
    public abstract void muncesteUnNumarFixDeOre();
    public abstract void mergeInConcediu();

    public abstract void mergeLaScoala();
    public abstract void primesteBursa();
    public abstract void mergeInVacanta();


}
