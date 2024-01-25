// WEEK 1 - DAY 1

public class DataTypes {
    public static void main(String[] args) {
        // CFU 1
        int value_int = 20;
        String value_string = "Java";
        double value_double = 11.22;
        System.out.println("CFU 1: " + value_int + ", " + value_string + ", " + value_double);

        // CFU 2
        double doubleNum = 1.2;
        if ((doubleNum % 1) != 0) {
            System.out.println("CFU 2: Double -> " + doubleNum);
        } else {
            System.out.println("CFU 2: NOT double -> " + doubleNum);
        }

        // CFU 3
        int num1 = 200;
        int num2 = 300000;
        int num3 = 1000;
        int smallest = num1 > num2 ? num1 > num3 ? num1 : num3 : num2;
        System.out.println("CFU 3: " + smallest);

        // CFU 4
        String result = productFormatter("My product name", "tomorrow");
        System.out.println("CFU 4: " + result);
    }

    private static String productFormatter(String productName, String date) {
        return productName
                .trim()
                .toUpperCase()
                .replace(" ", "_")
                + date;
    }
}