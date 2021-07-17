package solid.interfacesegration;

public class DbLogger implements IDblogger, ILogger {
    @Override
    public void baglantiAc() {
        System.out.println("Bağlantı Açıldı");
    }

    @Override
    public void baglantiKapat() {
    System.out.println("Bağlantı Kapatıldı");
    }


    @Override
    public void logla() {
        System.out.println("Veri Tabanına loglandı.");
    }
}
