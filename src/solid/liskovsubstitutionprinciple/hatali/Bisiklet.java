package solid.liskovsubstitutionprinciple.hatali;

public class Bisiklet extends Vasita{
    @Override
    public void hareketEt() {
        System.out.println("Bisiklet Hareket Etti");
    }

    @Override
    public void frenYap() {
        System.out.println("Bisiklet Fren Yaptı");
    }

    @Override
    public void pedalCevir() {
        System.out.println("Bisiklet Pedal Çevirdi");
    }

    @Override
    public void gazaBas() {
    //bisiklet ile gaza basamayız
    }
}
