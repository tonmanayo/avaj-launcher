package wtc.avajLauncher.simulator.vehicles;

import wtc.avajLauncher.weather.Coordinates;

public class Aircraft {
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private long idCounter;

    protected Aircraft(String name, Coordinates coordinates) {

    }

    private long nextId() {
        return 0;
    }


}
