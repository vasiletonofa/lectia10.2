package animal;

public interface Carnivor { // contract

   public final static int a = 2; // variabila 'a' poate fi setata o singura data de interfata

   public final static String descriereInterfata = "Interfata Carnivor face 1, 2, 3....";

   public abstract void manancaCarne();

   public abstract void vineaza();

   public abstract void afiseazaHranaPreferata(String hrana);

   public int spuneVarsta();

}
