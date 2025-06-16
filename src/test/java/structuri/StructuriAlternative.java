package structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //Structuri alternative: IF (conditie 1...conditie N) Then...Else, Switch
    //Putem avea mai multe conditii intre paranteze care sa delimiteze folosind operatori logici: &&, ||, !
    //Nu este obligatoriu ca si IF sa aibe Else
    //Putem adauga mai multe structuri de tipul IF cu ajutorul lui Else folosing Else/IF


    @Test
    public void testMethod() {
//        celMaiMareNumar(25,31);
//        celMaiMareNumar(-2,3);
//        celMaiMareNumar(10,10);
//        celMaiMareNumar(-5,-7);
//        celMaiMareNumar(0,-1);

//        numarPar(2);
//        numarPar(1);
//        numarPar(0);
//        numarPar(-3);
//        numarPar(-4);

//        numarParV2(2);
//        numarParV2(1);
//        numarParV2(0);
//        numarParV2(-3);
//        numarParV2(-4);

//        lungimeParola("1234567");
//        lungimeParola("12345657");
//        lungimeParola("123456577");
//        lungimeParola("12345678901234");
//        lungimeParola("123456789012345");
//        lungimeParola("");
//        lungimeParola("parola11dsagdsgsdgf");

        lungimeParolaV2("153Mfdshghb!");
        lungimeParolaV2("oiuytnj!");
        lungimeParolaV2("Abcdefg1!");      // ✅ validă
        lungimeParolaV2("abcdefg1!");      // ❌ fără majusculă
        lungimeParolaV2("ABCDEFGH!");      // ❌ fără cifră
        lungimeParolaV2("Abcdefghi");      // ❌ fără cifră și special
        lungimeParolaV2("Abcdefg!");       // ❌ fără cifră, dar lungime ok
        lungimeParolaV2("Ab1!");   // ❌ prea scurtă
        lungimeParolaV2("Abcdefg1!@#");     // ✅ validă
        lungimeParolaV2("Abcdefg1!@#XYZ");  // ✅ validă (lungime max 15)
        lungimeParolaV2("Abcdefg1!@#XYZ123"); // ❌ prea lungă
        

    }

    //Verificam care este numarul cel mai mare dintre 2 valori

    public void celMaiMareNumar(int nr1, int nr2) {

        if (nr1 > nr2) {
            System.out.println("cel mai mare numar dintre " + nr1 + " si " + nr2 + " este: " + nr1);
        } else {
            System.out.println("cel mai mare numar dintre " + nr1 + " si " + nr2 + " este: " + nr2);
        }
    }

    //Verificam daca un numar este par
    //Daca vrem sa lucaram cu catul unei impartiri folosim /(divide)
    //Daca vrem sa lucram cu restul unei impartiri folosim %(modulo)

    public void numarPar(int nr) {
        if (nr % 2 == 0) {
            System.out.println("Numarul " + nr + " este par");
        } else {
            System.out.println("Numarul " + nr + " este impar");
        }
    }

    //Verificam daca un numar este par si pozitiv
    public void numarParV2(int nr) {
        if (nr % 2 == 0) {
            if (nr > 0) {
                System.out.println("Numarul " + nr + " este par si pozitiv");
            } else {
                System.out.println("Numarul " + nr + " este par si negativ");
            }
        } else if (nr > 0) {
            System.out.println("Numarul " + nr + " este impar si pozitiv");
        } else {
            System.out.println("Numarul " + nr + " este impar si negativ");
        }
    }


    //Verificam daca lungimea unei valori(parole) este cuprinsa intre 8 si 15 caractere

    public void lungimeParola(String parola) {
        if (parola.length() >= 8 && parola.length() <= 15) {
            System.out.println("Parola " + parola + " are lungimea intre 8 si 15 caractere");
        } else {
            System.out.println("Parola " + parola + " nu are lungimea intre 8 si 15 caractere ");
        }
    }

    //Adaugam extra verificari legate de continutul parolei
    //Aceste verificari se focuseaza pe faptul ca parola trebuie sa contina o majuscula, un caracter special, o cifra

    public void lungimeParolaV2(String parola) {
        if (parola.length() >= 8 && parola.length() <= 15) {
            // Verifică dacă parola conține cel puțin:
            // o majusculă: (?=.*[A-Z])
            // o cifră: (?=.*\\d)
            // un caracter special: (?=.*[!@#$%^&*()_+\\-={}\\[\\]:;\"'<>,.?/])
            // lungime: deja verificată separat

            if (parola.matches(".*[A-Z].*") &&
                    parola.matches(".*\\d.*") &&
                    parola.matches(".*[!@#$%^&*()_+\\-={}\\[\\]:;\"'<>,.?/].*")) {

                System.out.println("Parola " + parola + " este validă: are lungimea corectă, majusculă, cifră și caracter special.");
            } else {
                System.out.println("Parola " + parola + " NU este validă:");
                if (!parola.matches(".*[A-Z].*")) {
                    System.out.println("- Nu conține majusculă");
                }
                if (!parola.matches(".*\\d.*")) {
                    System.out.println("- Nu conține cifră");
                }
                if (!parola.matches(".*[!@#$%^&*()_+\\-={}\\[\\]:;\"'<>,.?/].*")) {
                    System.out.println("- Nu conține caracter special");
                }
            }
        } else {
            System.out.println("Parola " + parola + " nu are lungimea între 8 și 15 caractere.");
        }
    }
}

