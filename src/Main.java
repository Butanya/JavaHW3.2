public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        double weight = 50; //кг
        double height = 1.50; //метры

        double BMI = service.calculate(weight, height);

        System.out.println("Индекс массы тела = " + BMI);
    }
}
