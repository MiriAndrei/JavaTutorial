package temaEchipa;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestEchipa {

    @Test

    public void testMethod(){

        Fundas fundasCentral = new Fundas("Popescu",3,"1.7","stang","negre");
        Fundas fundasStanga = new Fundas("Ionescu", 2,"1.75","drept","maro");
        Fundas fundasDreapta = new Fundas("Marinescu", 4,"1.76","drept","alb");
        List<Fundas> fundasList = Arrays.asList(fundasCentral, fundasStanga, fundasDreapta);

        Mijlocas mijlocasCentral = new Mijlocas("Petrescu", 7,"1.8","nu are accesorii","nu are agent");
        Mijlocas mijlocasDreapta = new Mijlocas("Georgescu", 8,"1.78","ceas","are agent");
        List<Mijlocas> mijlocasList = Arrays.asList(mijlocasDreapta, mijlocasCentral);

        Atacant atacantBanda= new Atacant("Hagi",10,"1.67","60","BMW");
        Atacant atacantCentral = new Atacant("Ilie",11,"1.71","45","nu are masina");
        List<Atacant> atacantList = Arrays.asList(atacantCentral, atacantBanda);

        EchipaDeFotbal primaEchipa = new EchipaDeFotbal(fundasList,mijlocasList,atacantList);
        primaEchipa.prezentareEchipa();
    }
}
