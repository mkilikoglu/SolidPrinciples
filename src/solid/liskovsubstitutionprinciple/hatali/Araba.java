package solid.liskovsubstitutionprinciple.hatali;

public class Araba extends Vasita{
    @Override
    public void hareketEt() {
        System.out.println("Araba Hareket Etti");
    }

    @Override
    public void frenYap() {
        System.out.println("Araba fren yaptı");
    }

    @Override
    public void pedalCevir() {
        //Arac pedal ceviremez
    }

    @Override
    public void gazaBas() {
        System.out.println("Araba gaza bastı");
    }
}
