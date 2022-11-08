public class Banana extends Fruit implements Peelable{
    String color="yellow";

    @Override
    public boolean hasPeel() {
        return false;
    }

    @Override
    public void peelOff() {

    }
}
