
/**
 *
 * @author Maikol Lizano
 * @author Estiven Álvarez
 * @version 3 noviembre 2018
 */
public interface IncomePerEntry {

    final static int NATIONALS = 5000;
    final static int FOREIGN = 6000;

    public abstract double incomePerEntry(int numTicketsSoldNational, int numTicketsSoldForeign);

}
