package device;

public class Device  {
    // static final = clasa poate seta variabila o singura data la definire
    // static = clasa poate seta variabila de mai multe ori
    // final = obiectul poate seta valoarea o singura data

    public static int anProducere = 2020;
    public int price;

    public int getAnProducere() {
        return anProducere;
    }

    public void setAnProducere(int an) {
        anProducere = an;
    }
}
