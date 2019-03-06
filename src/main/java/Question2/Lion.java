package Question2;

public class Lion implements Behaviour{


    @Override
    public String roar(String a) {
        return a;
    }

    @Override
    public String bite(String b) {
        return b;
    }

    @Override
    public String run(String c) {
        return c;
    }

    @Override
    public String sleep(String d) {
        return d;
    }
}
