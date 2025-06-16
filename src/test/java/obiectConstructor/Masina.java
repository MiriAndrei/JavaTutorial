package obiectConstructor;

public class Masina {

    //constructor = are ca rol sa initializeze atributele unei clase
    //recunoastem un constructor intr-o clasa dupa numele clasei care este la fel cu constructorul
    //un constructor poate sa fie public, private, protected urmat de acelasi nume cu clasa
    //intr-o clasa putem sa avem mai multi constructori diferentiati prin numarul sau tipul de parametrii
    //obiect = instanta a unei clase care contine proprietatile si metodele acesteia
    //dintr-o clasa putem sa creem o multime de obiecte diferentiate prin numele acestora
    //in momentul in care se initializeaza un obiect folosim cuvantul "new" urmat de apelarea constructorului din clasa
    //ex: Masina andreiBmw= new Masina("Bmw","X3");
    //in momentul in care am initializat un obiect pe baza lui putem sa accesam proprietatile si metodele din clasa respectiva
    //in momentul in care se creeaza un obiect, se aloca spatiu in memorie special pentru aceasta reprezentare

    public String marca;
    public String model;
    public String consum;
    public String culoare;
    public int caiPutere;
    public int greutate;
    public String nrKm;
    public int pret;

    public Masina(String marca, String model, String consum, String culoare, int caiPutere, String nrKm, int greutate) {
        this.marca = marca;
        this.model = model;
        this.consum = consum;
        this.culoare = culoare;
        this.caiPutere = caiPutere;
        this.nrKm = nrKm;
        this.greutate = greutate;
    }
    public Masina(String marca, String model, String consum, String culoare, int caiPutere, String nrKm, int greutate, int pret) {
        this.marca = marca;
        this.model = model;
        this.consum = consum;
        this.culoare = culoare;
        this.caiPutere = caiPutere;
        this.nrKm = nrKm;
        this.greutate = greutate;
        this.pret = pret;
    }

    public void prezentareComandaMasina(){
        System.out.println("Marca masinii este: "+marca);
        System.out.println("Modelul masinii este: "+model);
        System.out.println("Consumul masinii este: "+consum);
        System.out.println("Culoarea masinii este: "+culoare);
        System.out.println("Masina are "+caiPutere +" de cai");
        System.out.println("Masina are "+nrKm + " de km reali");
        System.out.println("Masina are "+ greutate + " de kg");
        if(pret !=0) {
            System.out.println("Pretul este: " + pret);
        }
    }
    //daca greutatea este pana in 2000 trebuie sa platim 5 lei
    //daca greutatea este cuprinsa intre 2000 si 4000 platim 10 lei
    //daca greutatea > 4000 platim 15 lei

    public void taxaGreutate(){
        if(greutate<=2000){
            System.out.println("Taxa pe greutate este de 5 lei ");
        }
        if (greutate>=2000&&greutate<=4000){
            System.out.println("Taxa pe greutate este de 10 lei");
        }
        if(greutate>4000){
            System.out.println("Taxa pe greutate este de 15 lei");
        }
    }

    //teme sportiv

}
