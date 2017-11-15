package wtc.avajLauncher.simulator;

import wtc.avajLauncher.weather.Coordinates;

public class WeatherTower extends Tower {
    public String getWeather(Coordinates coordinates) {
        if (coordinates.getHeight() > 0 && coordinates.getHeight() < 10 &&
                coordinates.getLatitude() > 0 &&
                coordinates.getLatitude() < 10 &&
                coordinates.getLongitude() > 0 &&
                coordinates.getLongitude() < 10) {
            return("RAIN");
        }
        if (coordinates.getHeight() > 0 && coordinates.getHeight() < 10 &&
                coordinates.getLatitude() > 20 &&
                coordinates.getLatitude() < 25 &&
                coordinates.getLongitude() > 20 &&
                coordinates.getLongitude() < 25) {
            return ("FOG");
        }
        if (coordinates.getHeight() > 0 && coordinates.getHeight() < 10 &&
                coordinates.getLatitude() > 15 &&
                coordinates.getLatitude() < 20 &&
                coordinates.getLongitude() > 15 &&
                coordinates.getLongitude() < 20) {
            return ("SUN");
        }
        if (coordinates.getHeight() > 0 && coordinates.getHeight() < 10 &&
                coordinates.getLatitude() > 10 &&
                coordinates.getLatitude() < 15 &&
                coordinates.getLongitude() > 10 &&
                coordinates.getLongitude() < 15) {
            return ("SNOW");
        }
        return "error in weather condition coordinates";
    }

    void changeWeather() {
        //if (getWeather())
    }
}
