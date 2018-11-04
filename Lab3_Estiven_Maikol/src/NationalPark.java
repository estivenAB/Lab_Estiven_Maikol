/**
 *
 * @author Maikol Lizano
 * @author Estiven Álvarez
 * @version 3 noviembre 2018
 */
public class NationalPark extends ProtectedAreas implements IncomeBySubsidy , IncomePerEntry{
    
    @Override
    public int income() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int incomeBySubsidy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public int incomePerEntry(int numTicketsSoldNational, int numTicketsSoldForeign) {

        int incomeByNationals = numTicketsSoldNational * NATIONALS;
        int incomeByForeign = numTicketsSoldForeign * FOREIGN;
        
        int incomePerEntry = incomeByForeign + incomeByNationals;
        
        return incomePerEntry;
        
    }

    
    
}