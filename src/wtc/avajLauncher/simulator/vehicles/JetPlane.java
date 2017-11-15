package wtc.avajLauncher.simulator.vehicles;

import wtc.avajLauncher.simulator.WeatherTower;
import wtc.avajLauncher.weather.Coordinates;

public class JetPlane extends Aircraft implements Flyable{
   private WeatherTower weatherTower;

   JetPlane(String newName, Coordinates newCoordinates) {
      super(newName, newCoordinates);
      name = newName;
      coordinates = newCoordinates;
   }

   public  void updateConditions() {
      int longd = coordinates.getLongitude();
      int lat = coordinates.getLatitude();
      int height = coordinates.getHeight();

      switch (weatherTower.getWeather(coordinates)) {
         case "Sun":
            lat += 10;
            height += 2;
            break;
         case "Rain":
            lat += 5;
            break;
         case "Fog":
            lat += 1;
            break;
         case "Snow":
            height -= 7;
            break;
         default:
            break;
      }
      coordinates = new Coordinates(longd, lat, height);
   }

   public void registerTower(WeatherTower newWeatherTower) {
      System.out.print("Tower says: JetPlane" + name + "(" + id + ") registered to weather tower.\n");
      weatherTower = newWeatherTower;
   }
}
