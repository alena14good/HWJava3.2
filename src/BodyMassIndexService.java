public class BodyMassIndexService {
    public double calculate(double weight, double height) {

        double height2 = height * height;
        double index = weight / height2 ;

        return index;
    }
}