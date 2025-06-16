package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    //clasa = sablon specific unei entitati care contine variabilie si metode
    //intr-un fisier java recunoastem o clasa dupa cuvantul "class"
    //o clasa trebuie sa aibe un nume
    //variabilele / metodele unei clase se regasesc intre acolade
    //intr-un fisier java putem avea mai multe clase diferentiate prin nume
    // nu este un practice bun sa ai mai multe clase intr-un fisier java
    //varabila = proprietatea unei clase
    //variabilele pot fi de 2 feluri: globale si locale
    //variabila gloabala = variabila care este prezenta peste tot in fisierul java
    //variabila globala = public tipvariabila numevariabila
    //o variabila poate sau nu sa primeasca o valoare
    //variabila locala = variabila care este prezenta doar in locul in care a fost definita
    //variabila locala = tipvariabila numevariabila
    //metoda = actiunea unei clase
    //metodele pot sa fie de 2 feluri : void si return
    //metoda void = metoda care afiseaza rezultatul codului scris
    //metoda void = public void numemetoda(){}

    //VARIABILE GLOBALE
    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;
    public double inaltime; //mai multe zecimale
    public float greutate;
    public char sex; // caracter
    public boolean areBursa; // true/false

    @Test

    public void prezentareStudent(){
        nume="Miritescu";
        prenume="Andrei";
        varsta=31;
        adresa="mun. Bucuresti blvd. Iancu de Hunedoara nr.8";
        inaltime=1.75;
        greutate=78.3f;
        sex='M';
        areBursa=true;

        System.out.println("Nume:"+nume);
        System.out.println("Prenume:"+prenume);
        System.out.println("Varsta:"+varsta);
        System.out.println("Adresa:"+adresa);
        System.out.println("Inaltime:"+inaltime);
        System.out.println("Greutatea:"+greutate);
        System.out.println("SEX:"+sex);
        System.out.println("Are Bursa? "+areBursa);



    }

}


