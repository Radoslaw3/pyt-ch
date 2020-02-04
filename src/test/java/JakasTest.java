import org.junit.Assert;

import static org.junit.Assert.*;

public class JakasTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void inPut() {
        String back = Jakas.inPut("cos");
        Assert.assertEquals("bledny wynik","do",back);  //test na Stringu
//        Output:
//        org.junit.ComparisonFailure: bledny wynik
//        Expected :do
//            Actual   :to
    }
}