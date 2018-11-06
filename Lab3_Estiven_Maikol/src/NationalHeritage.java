
/**
 *
 * @author Maikol Lizano
 * @author Estiven Álvarez
 * @version 3 noviembre 2018
 */
public class NationalHeritage extends NationalMonument implements IncomeNonGovermentalAid {

    private double aditionalAmmount;

    public NationalHeritage(int incomePerEntry, String name, String province) {
        super(incomePerEntry, name, province);
    }

    @Override
    public double incomeNonGovermentalAid() {
        final double PIB_CR = 34588535.3;
        aditionalAmmount = (PIB_CR * 0.002) / 100;
        return aditionalAmmount;
    }

    public double getAditionalAmmount() {
        return aditionalAmmount;
    }

    public void setAditionalAmmount(double aditionalAmmount) {
        this.aditionalAmmount = aditionalAmmount;
    }
    
    @Override
    public double income() {
        return aditionalAmmount + super.getIncomePerEntry();
    }

    @Override
    public String toString() {
        return "NationalHeritage:" + " aditionalAmmount=" + aditionalAmmount;
    }

}
