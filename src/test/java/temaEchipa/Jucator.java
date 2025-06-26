package temaEchipa;

public class Jucator {

    public String nume;
    public int numarTricou;
    public String inaltime;

    public Jucator(String nume, int numarTricou, String inaltime) {
        this.nume = nume;
        this.numarTricou = numarTricou;
        this.inaltime = inaltime;
    }
    public void prezentareJucator(){
        System.out.println("Numele jucatorului este: "+nume);
        System.out.println("Numarul jucatorului este: " +numarTricou);
        System.out.println("Inaltime jucatorului este: "+inaltime);
    }
}
