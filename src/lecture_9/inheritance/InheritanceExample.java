package lecture_9.inheritance;

/**
 * Created by alpa on 3/29/20
 */
public class InheritanceExample {


    public static void main(String[] args) {
        Plant plant = new Plant("MaskPlant ltd.", "mask", 2018);

        int production = plant.startProduceProduction();
        System.out.println("production: " + production);

        SellerPlant cupPlant = new SellerPlant("Cup company", "cup", 2010);
        cupPlant.getName();

        int cupProduction = cupPlant.startProduceProduction();
        System.out.println("production: " + cupProduction);

        int productionAfterSell = cupPlant.sellProduction(cupProduction);
        System.out.println("productionAfterSell: " + productionAfterSell);

        OverPerformedPlant mivinaPlant = new OverPerformedPlant("Mivina company", "food", 2000);
        int mivinaProduction = mivinaPlant.startProduceProduction(10);
//        int mivinaProduction = mivinaPlant.startProduceProduction();
        System.out.println("mivinaProduction: " + mivinaProduction);
    }
}
