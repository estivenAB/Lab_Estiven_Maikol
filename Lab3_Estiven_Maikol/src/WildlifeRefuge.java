/**
 *
 * @author Maikol Lizano
 * @author Estiven Álvarez
 * @version 3 noviembre 2018
 */
public class WildlifeRefuge extends ProtectedAreas {
    
    double help;
    double result;
    boolean property;

    public WildlifeRefuge() {
    }

    public WildlifeRefuge(double help, double result, boolean property, String name, String province) {
        super(name, province);
        this.help = help;
        this.result = result;
        this.property = property;
    }

    public double getHelp() {
        return help;
    }

    public void setHelp(double help) {
        this.help = help;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public boolean isProperty() {
        return property;
    }

    public void setProperty(boolean property) {
        this.property = property;
    }
    
    
    public double income(boolean stateProperty, double fuelTax, double privateHelp){
        property = stateProperty;
        if (stateProperty == true) {
           result = fuelTax * 0.005;
           return result;
        }
        return help = privateHelp;
    }

    @Override
    public double income() {
        if (property == true) {
            return result;
        }
        return help;
    }

    @Override
    public String toString() {
        return "WildlifeRefuge:" + " help=" + help + ", result=" + result + ", property=" + property;
    }
     @Override
    public String report1() {
        return "Provincia: " + getProvince() + "\nNombre:" + getName() + "/ Ingresos :" + income();
    }
    
}
