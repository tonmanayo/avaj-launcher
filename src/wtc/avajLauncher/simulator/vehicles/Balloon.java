package wtc.avajLauncher.simulator.vehicles;

import wtc.avajLauncher.simulator.WeatherTower;
import wtc.avajLauncher.weather.Coordinates;

public class Balloon extends Aircraft implements Flyable {

    private WeatherTower weatherTower;

    Balloon(String newName, Coordinates newCoordinates) {
        super(newName, newCoordinates);
        name = newName;
        coordinates = newCoordinates;
    }

    public void updateConditions() {
        int longd = coordinates.getLongitude();
        int lat = coordinates.getLatitude();
        int height = coordinates.getHeight();

        switch (weatherTower.getWeather(coordinates)) {
            case "Sun":
                longd += 2;
                height += 4;
                break;
            case "Rain":
                height -= 5;
                break;
            case "Fog":
                height -= 3;
                break;
            case "Snow":
                height -= 15;
                break;
            default:
                break;
        }
        coordinates = new Coordinates(longd, lat, height);
    }

    public void registerTower(WeatherTower newWeatherTower) {
        System.out.print("Tower says: Balloon" + name + "(" + id + ") registered to weather tower.\n");
        weatherTower = newWeatherTower;
    }

}
