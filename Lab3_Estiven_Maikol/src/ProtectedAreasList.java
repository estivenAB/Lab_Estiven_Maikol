
/**
 *
 * @author Maikol Lizano
 * @author Estiven Álvarez
 * @version 3 noviembre 2018
 */
public class ProtectedAreasList {

    private ProtectedAreas[] areasList;
    int counter;
    final static int DEFAULT_SIZE = 4;

    public ProtectedAreasList() {
        this.areasList = new ProtectedAreas[DEFAULT_SIZE];
    }

    public ProtectedAreas[] getAreasList() {
        return areasList;
    }

    public void setAreasList(ProtectedAreas[] areasList) {
        this.areasList = areasList;
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
                NationalPark newPark = (NationalPark) areasList[i];
                amountOfTickets += newPark.getIncomePerEntry();
                amountOfSubsidy += newPark.getGrant();
            }
        }

        for (int i = 0; i < counter; i++) {
            if (areasList[i] instanceof NationalMonument) {
                NationalMonument newMonument = (NationalMonument) areasList[i];
                amountOfTickets += newMonument.getIncomePerEntry();
            }
        }

        for (int i = 0; i < counter; i++) {
            if (areasList[i] instanceof WildlifeRefuge) {
                WildlifeRefuge newRefuge = (WildlifeRefuge) areasList[i];
                amountOfSubsidy += newRefuge.getResult();
                AmountOfNoGovernmentHelp += newRefuge.getHelp();
            }
        }

        for (int i = 0; i < counter; i++) {
            if (areasList[i] instanceof BiologicalReserve) {
                BiologicalReserve newReserve = (BiologicalReserve) areasList[i];
                amountOfSubsidy += newReserve.getGrant();
            }
        }

        for (int i = 0; i < counter; i++) {
            if (areasList[i] instanceof NationalHeritage) {
                NationalHeritage newPatrimony = (NationalHeritage) areasList[i];
                AmountOfNoGovernmentHelp += newPatrimony.getAditionalAmmount();
            }
        }

        return "Reporte desglosado:\nValor obtenido por subvención: " + amountOfSubsidy + "\nValor obtenido por entradas: " + amountOfTickets
                + "\nValor obtenido por ayuda no gubernamental: " + AmountOfNoGovernmentHelp;
    }

}
