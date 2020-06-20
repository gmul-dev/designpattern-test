package practice.creational.prototype;

public class HeroFactoryImpl implements HeroFactory{
    // stored objects
    // clone instance
    
    private Mage mage;
    private Warlord warlord;
    private Beast beast;

    public HeroFactoryImpl(Mage mage, Warlord warlord, Beast beast) {
        this.mage = mage;
        this.warlord = warlord;
        this.beast = beast;
    }

    @Override
    public Mage createMage() {
        return mage.copy();
    }

    @Override
    public Warlord createWarlord() {
        return warlord.copy();
    }

    @Override
    public Beast createBeast() {
        return beast.copy();
    }
}
