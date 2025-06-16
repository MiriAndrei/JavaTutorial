package variabilaMetoda;

import org.testng.annotations.Test;

public class Telefon {
    public String model;
    public String marca;
    public String culoare;
    public double pret;
    public String caracteristici;

    @Test
    public void testMethod(){
       prezentareTelefon("15 PRO","Iphone","negru",12.345,"oooooooo");
       discountTelefon();
        System.out.println();
       prezentareTelefon("14 PRO","Iphone","alb",5700,"pppppp");
        System.out.println();
       prezentareTelefon("S24","Samsung","negru",6000,"uuuuuu");


    }

    //metodele pot sau nu sa contina parametri
    //scopul parametrilor este sa defineasca intr-un mod generic o anumita actiune
    //o metoda poate avea unul sau mai multi parametrii delimitati prin virgula
    //un parametru trebuie sa contina tipul de data si numele acestuia
    public void prezentareTelefon(String param1,String param2,String param3, double param4, String param5){
        model=param1;
        marca=param2;
        culoare=param3;
        pret=param4;
        caracteristici=param5;

        System.out.println("Modelul telefonului este: "+model);
        System.out.println("Marca telefonului este: "+marca);
        System.out.println("Culoarea telefonului este: "+ culoare);
        System.out.println("Pretul este: "+ pret);
        System.out.println("Caracteristicile telefonului sunt: "+ caracteristici);
    }

    //exemplu variabila locala
    public void discountTelefon(){
        int discount=10;
        System.out.println("Pretul initial al telefonului este: "+ pret);
        double pretFinal=pret-(pret * discount)/100;
        System.out.println("Noul pret al telefonului est: " + pretFinal);
    }
}
