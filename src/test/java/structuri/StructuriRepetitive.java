package structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {
    //Structuri repetitive = for, while, forEach
    //diferenta intre for si while sunt conditiile cum se pun(sintaxa)

    @Test

    public void testMethod(){
        //afisareNumere();
        //afisareNumereWhile();
        //numerePare();
       // numerePareV2();
        //numarDivizibil();
        //afisarePrimeleCinci();
        sumaCifre();
    }

    // afisam primele 50 de numere incepand de la 0
    public void afisareNumere(){
        for (int index=0; index<100; index++){
            System.out.println("Valoarea curenta este: " + index);
        }
    }

    public void afisareNumereWhile(){
        int index=0;
        while (index < 100){
            System.out.println("Valoarea curenta este: " + index);
            index++;
        }
    }

    //afisam numerele pare de la 0 la 50
    public void numerePare(){
        for (int index=0; index<50;index=index+2){
            System.out.println("Numarul par este: " +index);
        }
    }

    public void numerePareV2(){
        for (int index=0; index<50;index++){
            if (index%2==0){
                System.out.println("Numarul par este: " +index);
            }
        }
    }

    //afisam numerele divizibile cu 3 de la 0 la 50
    public void numarDivizibil(){
        int index=0;
        while (index < 50){
            if (index%3==0){
                System.out.println("Numarul divizibil cu 3 este: " +index);
            }
            index++;
        }
    }

    //afisam primele 5 numere divizibile cu 5 de la 0 la 50
    public void afisarePrimeleCinci(){
        int counter=0;
        for (int index=0; index<50; index++){
            if (index%5==0){
                System.out.println("Numarul divizibil cu 5 este: " +index);
                counter++;
            }
            if (counter==5){
                break;
            }
        }
    }

    //calculam suma cifrelor pana la 10
    public void sumaCifre(){
        int suma=0;
        for ( int index=0; index < 10; index++ ){
            suma = suma + index; //aceleasi lucru cu suma += index
        }
        System.out.println("Suma este : " + suma);
    }
}
