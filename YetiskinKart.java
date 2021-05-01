package h6uyg;

public class YetiskinKart extends Kart {

    public YetiskinKart(int id, String Sahip, double Bakiye) {
        super(id, Sahip, Bakiye);
    }

    @Override
    public boolean odemeYap(double fiyat) {
         if (getBakiye() >= fiyat){
             setBakiye(getBakiye() - fiyat);
             return true;
         }
         return false;
    }
    
}
