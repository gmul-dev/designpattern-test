package practice.behavioral.observer;

import practice.behavioral.observer.generic.GHobbits;
import practice.behavioral.observer.generic.GOrcs;
import practice.behavioral.observer.generic.GWeather;

public class App {

    public static void main(String[] args) {
        var weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();

        // Generic observer inspired by Java Generics and Collection by Naftalin & Wadler
        System.out.println("--Running generic version--");
        var genericWeather = new GWeather();
        genericWeather.addObserver(new GOrcs());
        genericWeather.addObserver(new GHobbits());

        genericWeather.timePasses();
        genericWeather.timePasses();
        genericWeather.timePasses();
        genericWeather.timePasses();
    }
}
