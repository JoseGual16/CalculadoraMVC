package app;

/**
 * Se importan las clases necesarias para que el programa funcione 
 */
import controller.CalculatorController;
import model.CalculatorModel;
import view.CalculatorView;

// Creamos la clase para que el programa funcione
public class MVCCalculator {
    public static void main(String[] args){

    CalculatorView theView = new CalculatorView();
    CalculatorModel theModel = new CalculatorModel();
    //CalculatorController theController = new CalculatorController(theView, theModel);
    // Para no generar un error se instancia un objeto de calcularController
    new CalculatorController(theView, theModel);
    theView.setVisible(true);
    }
}
