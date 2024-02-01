import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExamples {

    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("2.3");
        BigDecimal num2 = new BigDecimal("1.5");

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        BigDecimal sum = num1.add(num2);
        BigDecimal sub = num1.subtract(num2);
        BigDecimal mul = num1.multiply(num2);
        BigDecimal div1 = num1.divide(num2, 2, RoundingMode.CEILING);
        BigDecimal div2 = num1.divide(num2, 2, RoundingMode.HALF_UP);

        System.out.println("sum: " + sum);
        System.out.println("sub: " + sub);
        System.out.println("mul: " + mul);
        System.out.println("div1: " + div1);
        System.out.println("div2: " + div2);

        // (2.3 * x + 1.5) / (x - 0.8)
        BigDecimal result = mathOperation(new BigDecimal("2.0"));
        System.out.println("result: " + result);
    }

    private static BigDecimal mathOperation(BigDecimal x) {
        BigDecimal blockA = x.multiply(new BigDecimal("2.3"))
                            .add(new BigDecimal("1.5"));
        BigDecimal blockB = x.subtract(new BigDecimal("0.8"));

        return blockA.divide(blockB, 2, RoundingMode.CEILING);
    }
}
