package oopAbstractizare;

public class AngajatPartTime extends Angajat implements AngajatInterface{

    private String contractor;

    public AngajatPartTime(String nume, String prenume, int varsta,String contractor) {
        super(nume, prenume, varsta);
        this.contractor = contractor;
    }

    @Override
    public void mergeLaBirou() {
        System.out.println("Angajatul part time nu trebuie sa vina asa des la birou");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul part time primeste salariu");
    }

    @Override
    public void muncesteUnNumarFixDeOre() {
        System.out.println("Angajatul part time munceste mai putin");
    }

    @Override
    public void mergeInConcediu() {
        System.out.println("Angajatul part time are mai putin concediu");
    }
}
