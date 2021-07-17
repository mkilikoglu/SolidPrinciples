package solid.dependecyinversion;

public class OnayManager {
    private IOnay onay;

    public OnayManager(IOnay onay){
        this.onay=onay;
    }

    public void onayla(){
        onay.onayla();

    }
}
