package hello.springmvc.basic;

import lombok.Data;

@Data
public class Location {
    private double lat;
    private double lng;

    public Location() {}

    public Location(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }
}
