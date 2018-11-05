
/**
 *
 * @author Maikol Lizano
 * @author Estiven Álvarez
 * @version 3 noviembre 2018
 */
public class NationalMonument extends ProtectedAreas implements IncomePerEntry, IncomeNonGovermentalAid {

    @Override
    public int income() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int incomePerEntry(int numTicketsSoldNational, int numTicketsSoldForeign) {
        int incomeByNationals = numTicketsSoldNational * NATIONALS;
        int incomeByForeign = numTicketsSoldForeign * FOREIGN;

        int incomePerEntry = incomeByForeign + incomeByNationals;

        return incomePerEntry;
    }

    @Override
    public double incomeNonGovermentalAid() {
        final double PIB_CR = 34588535.3;
        double aditionalAmmount;
        aditionalAmmount = (PIB_CR * 0.002) / 100;
        return aditionalAmmount;
    }

}
