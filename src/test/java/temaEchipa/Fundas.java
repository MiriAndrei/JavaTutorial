package temaEchipa;

public class Fundas extends Jucator {
    public String piciorFavorit;
    public String culoareGhete;

    public Fundas(String nume, int numarTricou, String inaltime, String piciorFavorit, String culoareGhete) {
        super(nume, numarTricou, inaltime);
        this.piciorFavorit = piciorFavorit;
        this.culoareGhete = culoareGhete;
    }

    public void prezentareFundas(){
        prezentareJucator();
        System.out.println("Piciorul favorit este: "+piciorFavorit);
        System.out.println("Culoarea ghetelor este: "+culoareGhete);
    }
}
