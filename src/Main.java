public class Main {

    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();

        double index = service.calculate(60., 1.7);

        System.out.println("Ваш индекс тела = " + index);

    }
}
