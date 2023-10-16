package calculator;

public interface Electronice extends Tehnica  {

    public abstract int getKw();

    public abstract void setKw(int kw);

    public abstract boolean areBaterie();

    public abstract void setAreBaterie(boolean areBaterie);

    public abstract void incarca();

}
