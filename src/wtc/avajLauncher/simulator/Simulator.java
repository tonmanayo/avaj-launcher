package wtc.avajLauncher.simulator;

import wtc.avajLauncher.simulator.vehicles.AircraftFactory;
import wtc.avajLauncher.simulator.vehicles.Flyable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Simulator {
    private static WeatherTower weatherTower;
    private static List<Flyable>flyables = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
            String line = bufferedReader.readLine();
            if (line != null) {
                weatherTower = new WeatherTower();
                int simulations = Integer.parseInt(line.split(" ")[0]);
                if (simulations < 0) {
                    System.out.print("Invalid simulation count " + simulations + "\n");
                    System.exit(1);
                }
                while ((line = bufferedReader.readLine()) != null) {
                    int checkHeight = Integer.parseInt(line.split(" ")[4]);
                    if (checkHeight > 100 ) {
                        checkHeight = 100;
                    } else if (checkHeight < 0) {
                        checkHeight = 0;
                    }
                    Flyable flyable = AircraftFactory.newAircraft(line.split(" ")[0], line.split(" ")[1],
                            Integer.parseInt(line.split(" ")[2]), Integer.parseInt(line.split(" ")[3]), checkHeight);
                    flyables.add(flyable);

                }

                for (Flyable flyable: flyables) {

                    flyable.registerTower(weatherTower);
                }

                for (int i = 1; i < simulations; i++) {
                    weatherTower.changeWeather();
                }

            }
        } catch (FileNotFoundException e){
            System.out.print("Could not find File: " + args[0] + "\n");
        } catch ( IOException e) {
            System.out.print("Error while reading file: " + args[0] + "\n");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Error can't access array index: " + args[0] + "\n");
        } catch (NumberFormatException e) {
            System.out.print("Error number expected: " + e.getMessage());
        } finally {
         //   Logger.getLogger().close();
        }
    }
}
