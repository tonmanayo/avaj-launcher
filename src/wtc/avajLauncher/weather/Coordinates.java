package wtc.avajLauncher.weather;

public class Coordinates {
    private int longitude = 0;
    private int latitude = 0;
    private int height = 0;

   public Coordinates(int newLongitude, int newLatitude, int newHeight) {
       longitude = newLongitude;
       latitude = newLatitude;
       height = newHeight;
    }

    public int getHeight() {
        return height;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getLongitude() {
        return longitude;
    }
}
