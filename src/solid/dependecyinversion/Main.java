package solid.dependecyinversion;

public class Main {
    public static void main(String args[]){

        OnayManager onaylama = new OnayManager(new EmailOnay());
        onaylama.onayla();
        OnayManager onaylama2 = new OnayManager(new SmsOnay());
        onaylama2.onayla();

    }
}
