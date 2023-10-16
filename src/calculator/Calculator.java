package calculator;

public class Calculator implements Electronice {

    private int kw;
    private boolean areBaterie;

    private int greutate;

    private int procentIncarcareBaterie = 0;

    @Override
    public int getKw() {
        return kw;
    }


    @Override
    public void setKw(int kw) {
        this.kw = kw;
    }

    public void setKw(Integer kw) {
        this.kw = kw;
    }

    @Override
    public boolean areBaterie() {
        return areBaterie;
    }

    @Override
    public void setAreBaterie(boolean areBaterie) {
        this.areBaterie = areBaterie;
    }

    @Override
    public void incarca() {
        procentIncarcareBaterie++;
    }

    public int getProcentIncarcareBaterie() {
        return procentIncarcareBaterie;
    }


    @Override
    public void setGreutate(int setGreutate) {
        this.greutate = greutate;
    }
}
