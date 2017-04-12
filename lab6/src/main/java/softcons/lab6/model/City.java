package softcons.lab6.model;

/**
 *
 * @author MaryamBaig
 */
import javax.persistence.*;

/**
 *
 * @author MaryamBaig
 */
@Entity
public class City {

    @Id
    private int locId;
    @Column
    private String Country;
    @Column
    private String Region;
    @Column
    private String City;
    @Column
    private float latitude;
    @Column
    private float longitude;
    


    public String getCity() {
        return City;
    }

    public void setCity(String name){
        this.City = name;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public int getLocId() {
        return locId;
    }

    public void setLocId(int locId) {
        this.locId = locId;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }
    
}

