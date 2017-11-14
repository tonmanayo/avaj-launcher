package wtc.avajLauncher.weather;

public class WeatherProvider {
   private WeatherProvider weatherProvider;
   private String weather[];

   private WeatherProvider(){

   }

    public WeatherProvider getProvider() {
       return weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates) {
       return "";
    }


}
