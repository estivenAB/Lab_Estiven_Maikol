
/**
 *
 * @author Maikol Lizano
 * @author Estiven Álvarez
 * @version 3 noviembre 2018
 */
public class ProtectedAreasList {

    private ProtectedAreas[] areasList;
    private int counter;
    private final int DEFAULT_SIZE = 4;

    public ProtectedAreasList() {
        this.areasList = new ProtectedAreas[DEFAULT_SIZE];
    }

    public ProtectedAreas[] getAreasList() {
        return areasList;
    }

    public void setAreasList(ProtectedAreas[] areasList) {
        this.areasList = areasList;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void addArea(ProtectedAreas newArea) {
        if (areasList.length == counter) {
            duplicateSizeList();
        }
        areasList[counter++] = newArea;
    }

    private void duplicateSizeList() {
        ProtectedAreas[] areasListAux = new ProtectedAreas[areasList.length * 2];
        for (int i = 0; i < areasList.length; i++) {
            areasListAux[i] = areasList[i];
        }
        areasList = areasListAux;
    }

    public String report1() {
        String txt = "";
        int finalIncome = 0;
        for (int i = 0; i < counter; i++) {
            finalIncome += areasList[i].income();

        }
        for (int i = 0; i < counter; i++) {
            txt += areasList[i].report1() + "\n";
        }
        return txt + "\nIngresos totales: " + finalIncome;

    }

    public String report2() {
        int amountOfTickets = 0;
        int amountOfSubsidy = 0;
        int AmountOfNoGovernmentHelp = 0;

        for (int i = 0; i < counter; i++) {
            if (areasList[i] instanceof NationalPark) {
                NationalPark newV = (NationalPark) areasList[i];
                amountOfTickets += newV.getIncomePerEntry();
            }
        }

        for (int i = 0; i < counter; i++) {
            if (areasList[i] instanceof NationalMonument) {
                NationalMonument newV = (NationalMonument) areasList[i];
                amountOfTickets += newV.getIncomePerEntry();
            }
        }

        for (int i = 0; i < counter; i++) {
            if (areasList[i] instanceof NationalPark) {
                NationalPark newV = (NationalPark) areasList[i];
                amountOfSubsidy += newV.getGrant();
            }
        }

        for (int i = 0; i < counter; i++) {
            if (areasList[i] instanceof WildlifeRefuge) {
                WildlifeRefuge newV = (WildlifeRefuge) areasList[i];
                amountOfSubsidy += newV.getResult();
            }
        }

        for (int i = 0; i < counter; i++) {
            if (areasList[i] instanceof BiologicalReserve) {
                BiologicalReserve newV = (BiologicalReserve) areasList[i];
                amountOfSubsidy += newV.getGrant();
            }
        }

        for (int i = 0; i < counter; i++) {
            if (areasList[i] instanceof WildlifeRefuge) {
                WildlifeRefuge newV = (WildlifeRefuge) areasList[i];
                AmountOfNoGovernmentHelp += newV.getHelp();
            }
        }

        for (int i = 0; i < counter; i++) {
            if (areasList[i] instanceof NationalHeritage) {
                NationalHeritage newV = (NationalHeritage) areasList[i];
                AmountOfNoGovernmentHelp += newV.getAditionalAmmount();
            }
        }

        return "Reporte desglosado:\nValor obtenido por subvención: " + amountOfSubsidy + "\nValor obtenido por entradas: " + amountOfTickets
                + "\nValor obtenido por ayuda no gubernamental: " + AmountOfNoGovernmentHelp;
    }

}
