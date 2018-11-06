
/**
 *
 * @author Maikol Lizano
 * @author Estiven Álvarez
 * @version 3 noviembre 2018
 */
public class BiologicalReserve extends ProtectedAreas implements IncomeBySubsidy {

    private double grant;

    public BiologicalReserve() {
    }

    public BiologicalReserve(double grant, String name, String province) {
        super(name, province);
        this.grant = grant;
    }

    public double getGrant() {
        return grant;
    }

    public void setGrant(double grant) {
        this.grant = grant;
    }

    public double getNecessaryGrant(double necessaryGrant) {
        return grant = necessaryGrant;
    }

    @Override
    public double incomeBySubsidy() {
        return grant;
    }

    @Override
    public double income() {
        return grant;
    }

    @Override
    public String toString() {
        return "BiologicalReserve:" + " grant=" + grant;
    }

    @Override
    public String report1() {
        return "Provincia: " + getProvince() + "\nNombre:" + getName() + "\nIngresos :" + income();
    }
}
