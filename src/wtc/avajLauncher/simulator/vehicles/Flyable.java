package wtc.avajLauncher.simulator.vehicles;

import wtc.avajLauncher.simulator.WeatherTower;

public interface Flyable {
    public void updateConditions();
    public void registerTower(WeatherTower weatherTower);
}
