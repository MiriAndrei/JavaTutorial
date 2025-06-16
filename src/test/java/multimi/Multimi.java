package multimi;

import com.beust.jcommander.StringKey;
import org.testng.annotations.Test;

import java.util.*;

public class Multimi {
    //multimi = array, list(arrayList), map


    @Test

    public void testMethod(){
      //  colegiCurs();
        //multimeFructe();
        //multimeFructeLista();
       // colegiCursV2();
        //obiectiveTuristice();
        //obiectiveTuristicev2();
        //obiectiveTuristicev3();
        obiectiveTuristicev4();
    }
    //afisam numele colegilor de la curs

    public void colegiCurs(){
        String[] colegi = new String[10];
        colegi[0] = "Andrei";
        colegi[1] = "Vasile";
        colegi[2] = "Ion";
        colegi[3] = "Radu";
        colegi[4] = "Viorel";
        for (int index=0;index< colegi.length;index++){
            System.out.println("Numele colegului este: " + colegi[index]);
        }
    }

    public void colegiCursV2(){
        List<String> colegi = new ArrayList<>();
        colegi.add("Andrei");
        colegi.add("Maria");
        colegi.add("Ion");
        for (int index=0; index<colegi.size(); index++){
            System.out.println("Colegii de la curs sunt: " + colegi.get(index));
        }
    }

    //afisam o multime de fructe

    public void multimeFructe(){
        String[] fruct = new String[4];
        fruct[0]="mar";
        fruct[1]="para";
        fruct[2]="strugure";
        fruct[3]="mango";
        for (int index=0; index<fruct.length; index++){
            System.out.println("Fructele sunt:" +fruct[index]);
        }
    }

    //Afisam o multime de fructe - V2 lista
    public void multimeFructeLista(){
        List<String> fructe=new ArrayList<>();
        fructe.add("mar");
        fructe.add("para");
        fructe.add("strugure");
        fructe.add("mango");
        for (int index=0; index<fructe.size(); index++) {
            System.out.println("Fructele sunt:" + fructe.get(index));
        }
    }

    //Afisam niste obiective turistice alaturi de orasele in care se afla
    //Map = key-value
    public void obiectiveTuristice(){
        Map<String,String> obiective=new HashMap<>();
        obiective.put("Paris","Turn Efel");
        obiective.put("Constanta","Casino");
        obiective.put("Brasov", "Piata");
        obiective.put("Roma", "Panteon");
        obiective.put("Barcelona", "Sagrada");
        obiective.put("Berlin", "Zid");
        for (String key: obiective.keySet()){
            System.out.println("Orasul curent este: " + key);
            System.out.println("Obiectivul din oras este: "+ obiective.get(key));
        }
    }
//afisate in ordine -LinkedHashMap
    public void obiectiveTuristicev2() {
        Map<String, String> obiective = new LinkedHashMap<>();
        obiective.put("Paris", "Turn Efel");
        obiective.put("Constanta", "Casino");
        obiective.put("Brasov", "Piata");
        obiective.put("Roma", "Panteon");
        obiective.put("Barcelona", "Sagrada");
        obiective.put("Berlin", "Zid");
        for (String key : obiective.keySet()) {
            System.out.println("Orasul curent este: " + key);
            System.out.println("Obiectivul din oras este: " + obiective.get(key));
        }
    }

    public void obiectiveTuristicev3() {
        Map<String, List<String>> obiective = new LinkedHashMap<>();
        obiective.put("Paris", Arrays.asList("Turn Efel","S.E","Louvre"));
        obiective.put("Constanta", Arrays.asList("Casino"));
        obiective.put("Brasov", Arrays.asList("Piata","Biserica"));
        obiective.put("Roma", Arrays.asList("Panteon"));
        obiective.put("Barcelona", Arrays.asList("Sagrada"));
        obiective.put("Berlin", Arrays.asList("Zid"));
        for (String key : obiective.keySet()) {
            System.out.println("Orasul curent este: " + key);
            System.out.println("Obiectivele din oras sunt: " + obiective.get(key));
        }
    }

    public void obiectiveTuristicev4(){
        Map<String, Map<String, List<String>>> obiective = new LinkedHashMap<>();

        Map<String, List<String>> oraseObiectiveFranta = new LinkedHashMap<>();
        oraseObiectiveFranta.put("Paris", Arrays.asList("Turn Efel","S.E","Louvre"));
        oraseObiectiveFranta.put("Lyon", Arrays.asList("f2"));
        oraseObiectiveFranta.put("Nice", Arrays.asList("f3","f4"));

        Map<String, List<String>> oraseObiectiveItalia = new LinkedHashMap<>();
        oraseObiectiveItalia.put("Roma", Arrays.asList("Turn Efel","S.E","Louvre"));
        oraseObiectiveItalia.put("Milano", Arrays.asList("Casino"));

        Map<String, List<String>> oraseObiectiveSpania = new LinkedHashMap<>();
        oraseObiectiveSpania.put("Barcelona", Arrays.asList("Turn Efel","S.E","Louvre"));
        oraseObiectiveSpania.put("Madrid", Arrays.asList("Casino"));
        oraseObiectiveSpania.put("Sevilla", Arrays.asList("Piata","Biserica"));

        obiective.put("Franta",oraseObiectiveFranta);
        obiective.put("Italia", oraseObiectiveItalia);
        obiective.put("Spania", oraseObiectiveSpania);

        for (Map.Entry<String, Map<String, List<String>>> taraEntry : obiective.entrySet()) {
            String tara = taraEntry.getKey();
            //System.out.println("Țara: " + tara);

            Map<String, List<String>> orase = taraEntry.getValue();
            for (Map.Entry<String, List<String>> orasEntry : orase.entrySet()) {
                String oras = orasEntry.getKey();
               // System.out.println("  Oraș: " + oras);

                List<String> obiectiveOras = orasEntry.getValue();
                for (String obiectiv : obiectiveOras) {
                   // System.out.println("    - " + obiectiv);
                    System.out.println("Țara: " + tara +"  Oraș: " + oras +" Obiectiv:  " + obiectiv );

                }
            }
        }
    }

    //Definiti o carte de retete cu mai multe retete care se diferentiaza prin numele lor, cu ingrediente

}
