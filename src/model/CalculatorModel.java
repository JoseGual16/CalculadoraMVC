package model;
/**
 * Se crea la clase CalculatorModel donde se va a realozar
 * una suma de dos numeros que son (firstNumber + secondNumber)
 */
public class CalculatorModel {
    // Holds the value of the sum of the number entered in the view
    private int calculationValue;

    // Se crea esta funcion paara realizar la suma de los 2 numeros
    public void addTwoNumbers(int firstNumber, int secondNumber){
        calculationValue = firstNumber + secondNumber;
    }

    public int getCalculationValue(){
        return calculationValue;
    }
}