package animal;

public class Tigru implements Carnivor {
    @Override
    public void manancaCarne() {
        System.out.println("mananca carne Tigru");
    }

    @Override
    public void vineaza() {
        System.out.println("vineaza din Tigru");
    }

    @Override
    public void afiseazaHranaPreferata(String hrana) {
        System.out.println("Tigru..." + hrana);
    }

    @Override
    public int spuneVarsta() {
        return 5;
    }
}
