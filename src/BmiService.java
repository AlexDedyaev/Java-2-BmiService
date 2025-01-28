public class BmiService {
    public int Calculate(float weight, float height) {
        float bmi = weight / (height * height);
        return (int) bmi;

    }
}
