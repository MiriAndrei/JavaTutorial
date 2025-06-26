package temaEchipa;

import org.testng.annotations.Test;

import java.util.List;

public class EchipaDeFotbal {
    public List<Fundas> fundas;
    public List<Mijlocas> mijlocas;
    public List<Atacant> atacant;

    public EchipaDeFotbal(List<Fundas> fundas, List<Mijlocas> mijlocas, List<Atacant> atacant) {
        this.fundas = fundas;
        this.mijlocas = mijlocas;
        this.atacant = atacant;
    }

    public void prezentareEchipa(){
        System.out.println("Avem "+fundas.size()+ " fundasi in echipa");
        for(int index=0;index<fundas.size();index++){
            fundas.get(index).prezentareFundas();
        }
        System.out.println();
        System.out.println("Avem "+mijlocas.size()+ " mijlocasi in echipa");
        for(int index=0;index<mijlocas.size();index++){
            mijlocas.get(index).prezentareMijlocas();
        }
        System.out.println();
        System.out.println("Avem "+atacant.size()+ " atacanti in echipa");
        for (int index=0; index< atacant.size(); index++){
            atacant.get(index).prezentareAtacant();
        }
    }
}
