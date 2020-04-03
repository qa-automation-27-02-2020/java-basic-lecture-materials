package lecture_10.inner;

/**
 * Created by alpa on 4/2/20
 */
public class AddressMain {

    public static void main(String[] args) {
        Address myAddress = new Address("myStreen", 21);
        Address.GeoPosition geoPosition = myAddress.setGeoPosition();
//        Address.GeoPosition geoPosition = new Address.GeoPosition();

        System.out.println(myAddress);
    }
}
