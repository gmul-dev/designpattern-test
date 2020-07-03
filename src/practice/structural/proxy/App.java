package practice.structural.proxy;

public class App {
    public static void main(String[] args) {

        var proxy = new WizardTowerProxy(new IvoryTower());
        proxy.enter(new Wizard("red"));
        proxy.enter(new Wizard("white"));
        proxy.enter(new Wizard("black"));
        proxy.enter(new Wizard("green"));
        proxy.enter(new Wizard("brown"));
        proxy.enter(new Wizard("yellow"));
    }
}
