package solid.interfacesegration;

public class FileLogger implements IFileLogger,ILogger{

    @Override
    public void pathKontrol() {
        System.out.println("Path kontrol edildi");
    }

    @Override
    public void sizeKontrol() {
        System.out.println("Size Kontrol Edildi");

    }

    @Override
    public void logla() {
        System.out.println("File içerisine loglama yapıldı");
    }
}
