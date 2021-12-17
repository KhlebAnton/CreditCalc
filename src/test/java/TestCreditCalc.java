import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestCreditCalc {

    @Test
    public void testCalculationOfMonthlyPayment() {
        CreditCalc creditCalculator = new CreditCalc();
        int actualResult = 46144;
        int expectedResult = (int) creditCalculator.calculationOfMonthlyPayment(1000000.0, 10.0, 24.0);
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCalculationTotalRefundAmount() {
        CreditCalc creditCalculator = new CreditCalc();
        int actualResult = 1107478;
        int expectedResult = (int) creditCalculator.calculationTotalRefundAmount(1000000.0, 10.0, 24.0);
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public  void testCalculationOverpayment() {
        CreditCalc creditCalculator = new CreditCalc();
        int actualResult = 107478;
        int expectedResult = (int) creditCalculator.calculationOverpayment(1000000.0, 10.0, 24.0);
        Assertions.assertEquals(actualResult, expectedResult);
    }
}
