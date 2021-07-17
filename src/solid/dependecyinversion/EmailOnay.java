package solid.dependecyinversion;

public class EmailOnay implements IOnay {
    @Override
    public void onayla(){
        System.out.println("Kullanıcı Email ile onayladı");
    }
}
