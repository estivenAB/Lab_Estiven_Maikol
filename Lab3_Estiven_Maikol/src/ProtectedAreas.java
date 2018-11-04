
/**
 *
 * @author Maikol Lizano
 * @author Estiven Álvarez
 * @version 3 noviembre 2018
 */
public abstract class ProtectedAreas {

    private String name;
    private String province;

    public ProtectedAreas() {
        this("", "");
    }

    public ProtectedAreas(String name, String province) {
        this.name = name;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "ProtectedAreas{" + "name=" + name + ", province=" + province + '}';
    }

    public abstract int income();

}
