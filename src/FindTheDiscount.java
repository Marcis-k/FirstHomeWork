import java.text.DecimalFormat;

public class FindTheDiscount {
    public static void main(String[] args) {
        finalPrice(1500, 50);
        finalPrice(89, 20);
        finalPrice(100, 75);
    }

    private static void finalPrice(float price, int discount) {
        float finalPrice = price - (price * ((float) discount / 100));
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(finalPrice));
    }
}
