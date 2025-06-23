package oopMostenireIncapsulare;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class OOPTest {

    @Test

    public void testMethod() {

        List<String> dotariExterioareLogan = Arrays.asList("Senzori Parcare", "Jante 17", "Camera video");
        Dacia Logan = new Dacia("Dacia", "Logan", "Alba", 55, 10000, dotariExterioareLogan);
        Logan.prezentareDacia();
        System.out.println();

        List<String> dotariInterioareMcLaren = Arrays.asList("Scaune piele", "Clima", "Navigatie");
        List<String> dotariExterioareMcLaren = Arrays.asList("Senzori", "Jante 22", "Eleron");
        McLaren F1 = new McLaren("McLaren", "F1", "albastru", 500,
                250000, dotariInterioareMcLaren, dotariExterioareMcLaren);
        F1.prezentareMcLaren();
    }
}
