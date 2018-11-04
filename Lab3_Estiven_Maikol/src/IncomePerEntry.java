
/**
 *
 * @author Maikol Lizano
 * @author Estiven Álvarez
 * @version 3 noviembre 2018
 */
public interface IncomePerEntry {

    final int NATIONALS = 5000;
    final int FOREIGN = 6000;

    public abstract int incomePerEntry(int numTicketsSoldNational, int numTicketsSoldForeign);

}
