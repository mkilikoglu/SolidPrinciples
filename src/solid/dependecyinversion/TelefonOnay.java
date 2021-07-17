package solid.dependecyinversion;

public class TelefonOnay implements IOnay {
    @Override
    public void onayla() {
        System.out.println("Kullanıcı Email ile onayladı");
    }
}
