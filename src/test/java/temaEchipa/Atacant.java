package temaEchipa;

public class Atacant extends Jucator{
    public String varsta;
    public String masina;

    public Atacant(String nume, int numarTricou, String inaltime, String varsta, String masina) {
        super(nume, numarTricou, inaltime);
        this.varsta = varsta;
        this.masina = masina;
    }

    public void prezentareAtacant(){
        prezentareJucator();
        System.out.println("Varsta atacantului este: "+varsta);
        System.out.println("Masina atacantului este: "+masina);
    }
}
