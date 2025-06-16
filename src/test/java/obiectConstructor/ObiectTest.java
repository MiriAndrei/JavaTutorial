package obiectConstructor;

import org.testng.annotations.Test;

public class ObiectTest {

    @Test
    public void testMethod(){
        Masina andreiBmw = new Masina("Bmw","X3","10L/100km", "neagra",
                200, "10.000km",5000);
        andreiBmw.prezentareComandaMasina();
        andreiBmw.taxaGreutate();
        System.out.println();

        Masina andreiAudi = new Masina("Audi","A4","11L/100km", "alb",
                250, "130.000km",2800);
        andreiAudi.prezentareComandaMasina();
        andreiAudi.taxaGreutate();
        System.out.println();
        andreiAudi.culoare="roz";
        andreiAudi.model="A5";
        andreiAudi.prezentareComandaMasina();
        andreiAudi.taxaGreutate();
        System.out.println();

        Masina andreiMercedes = new Masina("Mercedes","CLS","9L/100km", "galben",
                150, "15.000km",1800, 12000);
        andreiMercedes.prezentareComandaMasina();
        andreiMercedes.taxaGreutate();
        System.out.println();

    }
}
