public class BmiService {
    public int calculate(float weight, float height) {
        float bmi = weight / (height * height);
        return (int) bmi;

    }
}