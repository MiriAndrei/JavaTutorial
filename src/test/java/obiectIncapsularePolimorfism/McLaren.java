package obiectIncapsularePolimorfism;


import java.util.List;

public class McLaren extends Masina {

    public List<String> dotariInterioare;
    public List<String> dotariExterioare;

    public McLaren(String marca, String model, String culoare, int caiPutere,
                   int pret, List<String> dotariInterioare, List<String> dotariExterioare) {
        super(marca, model, culoare, caiPutere, pret);
        this.dotariInterioare = dotariInterioare;
        this.dotariExterioare = dotariExterioare;
    }

    public void prezentareMcLaren(){
        prezentareComandaMasina();
        System.out.println("Dotarile interioare McLaren: ");
        for(int i=0; i<dotariInterioare.size(); i++){
            System.out.println(i + ". "+ dotariInterioare.get(i));
        }
        System.out.println("Dotarile exterioare McLaren: ");
        for(int i=0; i<dotariExterioare.size(); i++){
            System.out.println(i + ". "+ dotariExterioare.get(i));
        }
    }

    public void pornesteMotor(){
        System.out.println("Masina porneste motorul din telefon");
    }
}
