public class Mango extends Fruit implements Peelable, SeedRemovable{
    @Override
    public boolean hasPeel() {
        return false;
    }

    @Override
    public void peelOff() {

    }

    @Override
    public boolean hasSeeds() {
        return false;
    }

    @Override
    public void removeSeeds() {

    }
}
