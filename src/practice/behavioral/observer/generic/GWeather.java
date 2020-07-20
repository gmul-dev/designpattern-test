package practice.behavioral.observer.generic;

import practice.behavioral.observer.Weather;
import practice.behavioral.observer.WeatherType;

public class GWeather extends Observable<GWeather, Race, WeatherType> {

    private WeatherType currentWeather;

    public GWeather() {
        currentWeather = WeatherType.SUNNY;
    }

    public void timePasses() {
        var enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        System.out.println("The weather changed to " + currentWeather);
        notifyObservers(currentWeather);
    }
}
