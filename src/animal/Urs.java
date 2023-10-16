package animal;

public class Urs extends Animal implements Carnivor, Erbivor  {

    @Override
    public void manancaCarne() {
        System.out.println("mananca carne Urs");
    }

    @Override
    public void vineaza() {
        System.out.println("vineaza din Urs");
    }

    @Override
    public void afiseazaHranaPreferata(String hrana) {
        System.out.println("Tigru..." + hrana);
    }

    @Override
    public int spuneVarsta() {
        return 0;
    }

    @Override
    public void manancaIarba() {
        System.out.println("Mananca iarba Urs");
    }

    @Override
    public void mananceFructe() {
        System.out.println("manance fructe Urs");
    }

}
