public class Apple extends Fruit implements SeedRemovable{

    @Override
    public boolean hasSeeds() {
        return false;
    }

    @Override
    public void removeSeeds() {

    }
}
