public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService(); //создаем переменную
        double myBmi = service.calculate(1.7, 52.0); //выбираем рост и вес
        System.out.printf("Ваш индекс массы тела " + "%.0f", myBmi); // выводим результат + округляем его до целого числа


    }
}
