public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 185;
        int weight = 90;
        int bodyMassIndex = (int) service.calculate(height, weight);
        System.out.println(bodyMassIndex);
    }
}
