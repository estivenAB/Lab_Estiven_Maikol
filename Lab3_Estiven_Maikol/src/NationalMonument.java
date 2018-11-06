
/**
 *
 * @author Maikol Lizano
 * @author Estiven Álvarez
 * @version 3 noviembre 2018
 */
public abstract class NationalMonument extends ProtectedAreas implements IncomePerEntry {
    int incomePerEntry;
    @Override
    public double income() {
        return incomePerEntry;
    }

    @Override
    public int incomePerEntry(int numTicketsSoldNational, int numTicketsSoldForeign) {
        int incomeByNationals = numTicketsSoldNational * NATIONALS;
        int incomeByForeign = numTicketsSoldForeign * FOREIGN;

        incomePerEntry = incomeByForeign + incomeByNationals;

        return incomePerEntry;
    }
    
    
}
