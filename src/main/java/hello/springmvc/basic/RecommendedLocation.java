package hello.springmvc.basic;

import lombok.Data;

@Data
public class RecommendedLocation {
    private String name;
    private double lat;
    private double lng;
    private double rating;

    public RecommendedLocation() {}

    public RecommendedLocation(String name, double lat, double lng, double rating) {
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.rating = rating;
    }
}
