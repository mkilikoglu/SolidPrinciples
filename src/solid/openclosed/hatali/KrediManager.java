package solid.openclosed.hatali;

public class KrediManager {


    public void krediHesapla(int tip ){

        if(tip==1){
            BayramKredisi by=new BayramKredisi();
            by.hesapla();
        }
        else if(tip==2){
            IhtiyacKredisi ih=new IhtiyacKredisi();
            ih.hesapla();
        }
        else if(tip==3){
            EvKredisi ev=new EvKredisi();
            ev.hesapla();
        }

    }
}
