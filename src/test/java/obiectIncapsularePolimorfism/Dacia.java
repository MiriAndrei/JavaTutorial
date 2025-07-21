package obiectIncapsularePolimorfism;

import java.util.List;

public class Dacia extends Masina {

    private List<String> dotariExterioare;

    public Dacia(String marca, String model, String culoare, int caiPutere, int pret, List<String> dotariExterioare) {
        super(marca, model, culoare, caiPutere, pret);
        this.dotariExterioare = dotariExterioare;
    }

    public void prezentareDacia(){
        prezentareComandaMasina();
        System.out.println("Dotarile exterioare Dacia: ");
        for(int i=0; i<dotariExterioare.size();i++){
            System.out.println(i +". "+dotariExterioare.get(i));
        }
    }

    public void procesarePlata(){
        System.out.println("Plata pentru masina Dacia se proceseaza cu suma de" +getPret());
    }

    public void procesarePlata(int procent){
        System.out.println("Plata pentru masina Dacia vine cu o reducere de " + procent + " %");
    }

    public void procesarePlata(boolean buyBack){
        System.out.println("Plata pentru masina Dacia este influentata de buyback");
    }

    public void pornesteMotor(){
        System.out.println("Masina Dacia poirneste motorul electric");
    }

    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }
}
