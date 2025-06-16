package teme;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class teme2 {

    public String helloWorld;
    public int age;
    public String nume;
    public String prenume;
    public String salut;
    public String hello;
    public String ana;
    public String are;
    public String mere;
    public String pere;
    public String prune;


    @Test

    public void testMethod(){
//        helloWorld="Hello World";
//        age=31;
//        nume="Miritescu";
//        prenume="Andrei";
//        salut="Salut";
//        hello="Hello";
//
//
//        System.out.println(helloWorld);
//        System.out.println(age);
//        System.out.println(nume);
//        System.out.println(prenume);
//        System.out.println(salut + "M");
//        System.out.println("H"+ hello);

        prezentare("Hello World", 31,"Miritescu","Andrei", "Salut", "Hello" );
        propozitie("Ana","are","mere","pere","prune");
        salariuAngajat("Andrei", 3000, 3, "IT");
        salariuAngajat("Popescu", 5000, 1, "Marketing");
        numarDepartament(290);
        rezultatCorect();
    }

     public void prezentare(String param1, int param2, String param3, String param4, String param5, String param6){
        helloWorld=param1;
        age=param2;
        nume=param3;
        prenume=param4;
        salut=param5;
        hello=param6;


        System.out.println(helloWorld);
        System.out.println(age);
        System.out.println(nume);
        System.out.println(prenume);
        System.out.println(salut + "M");
        System.out.println("H"+ hello);

         System.out.println(helloWorld + " Poti pleca acasa dupa ce iti verific munca!");
         System.out.println(age+" Poti pleca acasa dupa ce iti verific munca!");
         System.out.println(nume+" Poti pleca acasa dupa ce iti verific munca!");
         System.out.println(prenume+" Poti pleca acasa dupa ce iti verific munca!");
         System.out.println(salut + "M" + " Poti pleca acasa dupa ce iti verific munca!");
         System.out.println("H"+ hello + " Poti pleca acasa dupa ce iti verific munca!");
    }

    public void propozitie(String cuvant1, String cuvant2, String cuvant3, String cuvant4, String cuvant5){
        String ana=cuvant1;
        String are=cuvant2;
        String mere=cuvant3;
        String pere=cuvant4;
        String prune=cuvant5;
        if (ana.endsWith("a") || ana.endsWith("e") || ana.endsWith("i") || ana.endsWith("o") || ana.endsWith("u")) {
            ana = ana + "Z";
        }
        if (are.endsWith("a") || are.endsWith("e") || are.endsWith("i") || are.endsWith("o") || are.endsWith("u")){
            are= are + "Z";
        }
        if (mere.endsWith("a") || mere.endsWith("e") || mere.endsWith("i") || mere.endsWith("o") || mere.endsWith("u")){
            mere = mere + "Z";
        }
        if (pere.endsWith("a") || pere.endsWith("e") || pere.endsWith("i") || pere.endsWith("o") || pere.endsWith("u")){
            pere = pere + "Z";
        }
        if (prune.endsWith("a") || prune.endsWith("e") || prune.endsWith("i") || prune.endsWith("o") || prune.endsWith("u")){
            prune = prune + "Z";
        }

        System.out.println(ana+" "+ are+" " + mere +","+ pere+"," +prune);
        System.out.println(ana+" "+ are+" " + mere +","+ pere+"," +prune + " Poti pleca acasa dupa ce iti verific munca!");
    }

    public void salariuAngajat(String nume, int salariu, int id, String departament){
        if (nume.equals("Andrei")){
            System.out.println("Salariul este "+ salariu);
        }
        if (nume.equals("Popescu")){
            System.out.println("ID-ul de angajat este: "+ id +","+ " departamentul este: "+ departament);
        }
    }

    public void numarDepartament(int numarDepartament){
        if (numarDepartament>287){
            System.out.println("Numarul departamentului este: "+numarDepartament);
        }
    }
    public void rezultatCorect(){
        double rezultat=(2 + (3 * 4) - 3) / 3.0;
        System.out.println("Rezultatul corect este: "+rezultat);

    }








}
