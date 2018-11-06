
/**
 *
 * @author Maikol Lizano
 * @author Estiven Álvarez
 * @version 3 noviembre 2018
 */
public class WildlifeRefuge extends ProtectedAreas {
    
    double result;
    
    public double income(boolean stateProperty, double fuelTax, double privateHelp){
        if (stateProperty == true) {
           result = fuelTax * 0.005;
           return result;
        }
        return privateHelp;
    }

    @Override
    public double income() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
