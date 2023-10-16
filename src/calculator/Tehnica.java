package calculator;

public interface Tehnica {

    public abstract void setGreutate(int setGreutate);

    public default int getGreutate() {
        return 5;
    }

}
