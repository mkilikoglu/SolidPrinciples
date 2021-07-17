package solid.singleresponsibility;

public class KullaniciService {
    public void ekle(){
        System.out.println("Kullanıcı Eklendi");
    }
    public void sil(){
        System.out.println("Kullanıcı Silindi");
    }
    public void guncelle(){
        System.out.println("Kullanıcı Güncellendi.");
    }
    //ahatalı
    public void mailGonder(){
        System.out.println("Kullanıcıya Mail Gönderildi.");
    }
}
