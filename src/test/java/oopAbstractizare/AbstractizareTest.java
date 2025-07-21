package oopAbstractizare;

import org.testng.annotations.Test;

public class AbstractizareTest {

    @Test

    public void testMethod(){
        AngajatFullTime andrei = new AngajatFullTime("Miri","Andrei",32,"firma");
        andrei.mergeInConcediu();

        AngajatPartTime andreii = new AngajatPartTime("Miri","Andrei",32,"da");
        andreii.mergeInConcediu();
    }
}
