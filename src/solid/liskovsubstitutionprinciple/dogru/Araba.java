package solid.liskovsubstitutionprinciple.dogru;


public class Araba extends MotorluArac {
    @Override
    public void hareketEt() {
        System.out.println("Araba Hareket Etti");
    }

    @Override
    public void frenYap() {
        System.out.println("Araba fren yaptı");
    }

    @Override
    public void gazaBasa() {
        System.out.println("Araba Gaza Bastı");
    }


}
