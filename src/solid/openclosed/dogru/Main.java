package solid.openclosed.dogru;

public class Main {
    public static void main(String args[]){

        KrediManager manager = new KrediManager(new BayramKredisi());
        manager.KrediHesaplama();
    }
}
