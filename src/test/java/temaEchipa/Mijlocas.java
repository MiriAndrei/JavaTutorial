package temaEchipa;

public class Mijlocas extends Jucator{
    public String accesorii;
    public String agent;

    public Mijlocas(String nume, int numarTricou, String inaltime, String accesorii, String agent) {
        super(nume, numarTricou, inaltime);
        this.accesorii = accesorii;
        this.agent = agent;
    }

    public void prezentareMijlocas(){
        prezentareJucator();
        System.out.println("Accesoriile sunt "+ accesorii);
        System.out.println("Are agent "+agent);
    }
}
