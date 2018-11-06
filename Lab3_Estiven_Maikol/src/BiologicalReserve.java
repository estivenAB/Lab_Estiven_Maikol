
/**
 *
 * @author Maikol Lizano
 * @author Estiven Álvarez
 * @version 3 noviembre 2018
 */
public class BiologicalReserve extends ProtectedAreas implements IncomeBySubsidy{
    
    double grant;
    
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
