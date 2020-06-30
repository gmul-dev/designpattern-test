package practice.structural.facade;

public class App {
    public static void main(String[] args) {
        var facade = new DwarvenGoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }
}
