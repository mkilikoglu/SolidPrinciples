package solid.dependecyinversion;

public class SmsOnay implements IOnay{
    @Override
    public void onayla(){
        System.out.println("Kullanıcı Sms ile onayladı");
    }
}
