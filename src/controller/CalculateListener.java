package controller;

/**
 * Se importan las clases necesarias para poder 
 * realizar la funcion del programa
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculateListener implements ActionListener {
    /**
     * Las variables finales solo se usan en aquellos valores que sabemos de
     * antemano que no van a variar, o sea, que permanecerán constantes durante la
     * ejecucíon del programa.
     */
    private final CalculatorController calculatorController;

    /**
     * @param calculatorContoller
     */
    CalculateListener(CalculatorController calculatorController){
        this.calculatorController = calculatorController;
    }

    /**
     * Las acciones envolventes con las vista con un bloque de prueba en caso de que los números no se hayan intoducido correctamnete
     */
    public void actionPerformed(ActionEvent e){
        int firstNumber;
        int secondNumber = 0;
        try {
            firstNumber = this.calculatorController.theView.getFirstNumber();
            secondNumber = this.calculatorController.theView.getSecondNumber();

            this.calculatorController.theModel.addTwoNumbers(firstNumber, secondNumber);
            this.calculatorController.theView.setCalcSolution(this.calculatorController.theModel.getCalculationValue());
        }catch (NumberFormatException ex){
            System.out.println(ex);
            this.calculatorController.theView.displayErrorMessage("Ingrese dos números enteros");
        }
    }
}
