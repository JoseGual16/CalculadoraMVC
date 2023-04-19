package controller;

/**
 * Se importan 2 clases
 */
import model.CalculatorModel;
import view.CalculatorView;

public class CalculatorController {
    CalculatorView theView;
    CalculatorModel theModel;

    /**
     * Avisa a la vista que siempre que el botón Calcular se hace clic se ejecuta el
     * método actionPerformed en la clase interna CalculateListener
     * 
     * @param theView
     * @param theModel
     */
    public CalculatorController(CalculatorView theView, CalculatorModel theModel){
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalculateListener(new CalculateListener(this));
    }
}


