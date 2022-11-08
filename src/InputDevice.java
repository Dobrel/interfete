public class InputDevice {

    int weight=0, sugar=0;

    public Fruit[] readFruit(){
        Fruit[] a=new Fruit[20];
        return a;
    }

    public void computeWeight(Fruit[] fruits){
        for (Fruit i:fruits)
            weight+=i.weight;
    }

    public void computeSugarContent(Fruit[] fruits){
        for (Fruit i:fruits){
            sugar+=i.sugar;
        }
    }
}
