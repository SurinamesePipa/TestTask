package SecondTask;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SecondTaskPojo {


    public SecondTaskPojo(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public SecondTaskPojo(){
    }
    private String latitude;
    private String longitude;


    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }



}
