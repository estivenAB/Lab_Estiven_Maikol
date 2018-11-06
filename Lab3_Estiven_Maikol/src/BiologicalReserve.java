
/**
 *
 * @author Maikol Lizano
 * @author Estiven Álvarez
 * @version 3 noviembre 2018
 */
public class BiologicalReserve extends ProtectedAreas implements IncomeBySubsidy{
    
    double grant;

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
    
    
    public double getNecessaryGrant(double necessaryGrant){
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
    
}
