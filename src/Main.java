public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = 1.77f;
        float  weight = 90;

        int bmi = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела равен " + bmi);
    }
}