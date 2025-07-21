
import obiectIncapsularePolimorfism.Dacia;
import obiectIncapsularePolimorfism.McLaren;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class OOPTest2 {

    @Test

    public void testMethod() {

        List<String> dotariExterioareLogan = Arrays.asList("Senzori Parcare", "Jante 17", "Camera video");
        obiectIncapsularePolimorfism.Dacia Logan = new Dacia("Dacia", "Logan", "Alba", 55, 10000, dotariExterioareLogan);

        Logan.prezentareDacia();
        System.out.println();

        Logan.setCuloare("Rosu");
        Logan.setModel("Sandero");
        Logan.setDotariExterioare(Arrays.asList("Senzori Parcare", "Jante 17", "Camera video"));


        Logan.prezentareDacia();
        System.out.println();
        Logan.pornesteMotor();
        Logan.procesarePlata();
        Logan.procesarePlata(true);
        Logan.procesarePlata(10);


        List<String> dotariInterioareMcLaren = Arrays.asList("Scaune piele", "Clima", "Navigatie");
        List<String> dotariExterioareMcLaren = Arrays.asList("Senzori", "Jante 22", "Eleron");
        McLaren F1 = new McLaren("McLaren", "F1", "albastru", 500,
                250000, dotariInterioareMcLaren, dotariExterioareMcLaren);
        System.out.println();
        F1.prezentareMcLaren();
        F1.pornesteMotor();
    }


}
