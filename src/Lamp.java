/**
 * Created by Adesh on 06-08-2019
 */

public class Lamp {
    private String type;
    private int rating;

    public Lamp(String type, int rating) {
        this.type = type;
        this.rating = rating;
    }

    public void turnOn(){
        System.out.println("Lamp is on");
    }

    public String getType() {
        return type;
    }

    public int getRating() {
        return rating;
    }
}
