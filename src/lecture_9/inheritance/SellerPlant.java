package lecture_9.inheritance;

/**
 * Created by alpa on 3/29/20
 */
public class SellerPlant extends Plant {

    public SellerPlant(String name, String type, int startYear) {
        super(name, type, startYear);
    }

    @Override
    public String getName() {
        System.out.println("Call name SellerPlant");
        return super.getName();
    }

    public int sellProduction(int productionNumber) {
        int onePercent = productionNumber / 100;
        return productionNumber - onePercent;
    }
}
