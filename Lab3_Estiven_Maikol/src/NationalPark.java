
/**
 *
 * @author Maikol Lizano
 * @author Estiven Álvarez
 * @version 3 noviembre 2018
 */
public class NationalPark extends ProtectedAreas implements IncomeBySubsidy, IncomePerEntry {

    int grant;
    int incomePerEntry;

    public NationalPark() {
    }

    public NationalPark(int grant, int incomePerEntry, String name, String province) {
        super(name, province);
        this.grant = grant;
        this.incomePerEntry = incomePerEntry;
    }

    public int getGrant() {
        return grant;
    }

    public void setGrant(int grant) {
        this.grant = grant;
    }

    public int getIncomePerEntry() {
        return incomePerEntry;
    }

    public void setIncomePerEntry(int incomePerEntry) {
        this.incomePerEntry = incomePerEntry;
    }

    @Override
    public double income() {
        int incomeResult;
        incomeResult = grant + incomePerEntry;
        return incomeResult;
    }

    @Override
    public double incomeBySubsidy() {
        grant = ICE_CLIENTS * 1200;
        return grant;

    }

    @Override
    public int incomePerEntry(int numTicketsSoldNational, int numTicketsSoldForeign) {

        int incomeByNationals = numTicketsSoldNational * NATIONALS;
        int incomeByForeign = numTicketsSoldForeign * FOREIGN;

        incomePerEntry = incomeByForeign + incomeByNationals;

        return incomePerEntry;

    }

    @Override
    public String toString() {
        return "NationalPark:" + " grant=" + grant + ", incomePerEntry=" + incomePerEntry;
    }

    @Override
    public String report1() {
        return "Provincia: " + getProvince() + "\nNombre:" + getName() + "/ Ingresos :" + income();
    }
}
