package obiectIncapsularePolimorfism;

public class Masina {

    //OOP - object oriented programming
    //4 concepte : Mostenire, Incapsulare, Abstractizare, Polimorfism
    //Mostenire = conceptul prin care o clasa parinte este mostenita de una sau mai multe clase copil
    //in java o clasa copil, poate mosteni o singura clasa parinte
    //cand copilul mosteneste parintele, copilul trebuie sa apeleze constructorul din parinte
    //copilul apeleaza constructorul din parinte folosind "super"
    //ca sa folosim mostenirea apelam la cuvantul "extends"
    //cand copilul mosteneste parintele, copilul are acces la variabile/metode din interiorul parintelui daca
    // sunt public/protected


    // Incapsularea e un concept pe baza caruia tinem departe de exterior valorile proprietatilor pe care nu vrem sa le modificam
    //Incapsularea se poate aplica la nivel de proprietati dar si de metode
    //Private = access control care are ca rol sa restranga vizibilitatea unei proprietati/metode doar la nivelul clasei unde este definita
    //get/set

    //Polimorfism = concept pe baza caruia o metoda poate avea implementari diferite pentru fiecare circumstanta
    //este de 2 feluri : dinamic(override) si static(overload)
    //dinamic = intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferita
    // polimorfismul dinamic se regaseste doar la relatia de tip parinte-copil
    //static= posibilitatea de a defini de mai multe ori o metoda cu acelasi nume insa cu numar/tip de parametrii diferiti
    //polimorfismul static nu este fortat de prezenta unei relatii de tip parinte-copil

    private String marca;
    private String model;
    private String culoare;
    private int caiPutere;
    private int pret;

    public Masina(String marca, String model, String culoare, int caiPutere, int pret) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.caiPutere = caiPutere;
        this.pret = pret;
    }


    public void prezentareComandaMasina() {
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Masina are " + caiPutere + " de cai");
        System.out.println("Pretul este: " + pret);
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getCaiPutere() {
        return caiPutere;
    }

    public int getPret() {
        return pret;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void pornesteMotor(){
        System.out.println("Masina se porneste de la buton");
    }
}
//




