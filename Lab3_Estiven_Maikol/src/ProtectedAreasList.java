
/**
 *
 * @author Maikol Lizano
 * @author Estiven Álvarez
 * @version 3 noviembre 2018
 */
public class ProtectedAreasList extends ProtectedAreas {

    private ProtectedAreas[] areasList;

    public ProtectedAreasList() {

    }

    public ProtectedAreasList(ProtectedAreas[] areasList, String name, String province) {
        super(name, province);
        this.areasList = areasList;
    }

    public void addArea(ProtectedAreas newArea) {
        int counter = 0;
        if (counter >= areasList.length) {
            duplicateSizeList();
        } else {
            if (newArea != null) {
                for (int i = counter; i >= 0; i--) {
                    areasList[counter] = newArea;
                    counter += 1;
                }
            }
        }
    }

    private void duplicateSizeList() {
        ProtectedAreas[] areasListAux = new ProtectedAreas[areasList.length * 2];
        for (int i = 0; i < areasList.length; i++) {
            areasListAux[i] = areasList[i];
        }
        areasListAux = areasList;
    }

    @Override
    public int income() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
