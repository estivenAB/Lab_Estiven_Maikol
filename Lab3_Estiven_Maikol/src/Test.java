
/**
 *
 * @author Estiven Alvarez
 * @author Maikol Lizano
 * @version 03 noviembre 2018
 */
public class Test {

    public static void main(String[] args) {
        ProtectedAreasList test = new ProtectedAreasList();
        NationalPark p = new NationalPark();
        BiologicalReserve b = new BiologicalReserve();
        NationalMonument m = new NationalMonument() {};
        WildlifeRefuge r = new WildlifeRefuge();
        
        p.incomeBySubsidy();
        p.incomePerEntry(2, 3);
        
        
        NationalPark park = new NationalPark(p.grant, p.getIncomePerEntry(), " Manuel Antonio ", " Puntarenas ");
        NationalPark park2 = new NationalPark(p.grant, p.getIncomePerEntry(), "Volcán Poás ", " Alajuela ");
        BiologicalReserve reserve = new BiologicalReserve(100 ,"Carara", "Puntarenas");
        NationalMonument monument = new NationalMonument(20, "Juan Santa María", "Alajuela") {};
        WildlifeRefuge refuge = new WildlifeRefuge(10, 20, true, "Gandoca", "Limón");
        
        
        test.addArea(park);
        test.addArea(reserve);
        test.addArea(refuge);
        test.addArea(monument);
        test.addArea(park2);
        
        System.out.println(test.report1());
        System.out.println(test.report2());
        
        
    }

}
