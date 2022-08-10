public class BmiService {
    public double calculate(double tall, double weight) { //рост в метрах и вес в кг
        double bmiResult = (weight / (tall * tall)); //вычисляем ИМТ
        return bmiResult; //результат на вывод
    }

}
