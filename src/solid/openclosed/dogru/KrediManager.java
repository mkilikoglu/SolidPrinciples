package solid.openclosed.dogru;

public class KrediManager {
    private IKredi kredi;

    public KrediManager(IKredi kredi){
        this.kredi=kredi;
    }
    public void KrediHesaplama(){

        kredi.hesapla();
    }


}
