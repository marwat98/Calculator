package calculator;

public class typesOfEquations implements Types{
    @Override
    public int addition(int number1, int number2) {
        return number1 + number2;
    }

    @Override
    public int substraction(int number1, int number2) {
        return number1 - number2;
    }

    @Override
    public int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    @Override
    public int division(int number1, int number2) {
        return number1 / number2;
    }
}
