public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        long height = 185;
        long weight = 90;
        long BMI = service.calculate(height, weight);
        System.out.println(BMI);
    }
}
