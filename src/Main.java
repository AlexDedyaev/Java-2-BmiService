public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = 1.87f;
        float weight = 98f;

        float bmi = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела равен " + bmi);
    }
}