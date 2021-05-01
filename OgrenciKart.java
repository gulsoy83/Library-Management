
package h6uyg;

public class OgrenciKart extends Kart {
    
    private double Bonus;

    public OgrenciKart(int id, String Sahip, double Bakiye) {
        super(id, Sahip, Bakiye);
        this.Bonus = 0;
    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double Bonus) {
        this.Bonus = Bonus;
    }

    
    
    @Override
    public boolean odemeYap(double fiyat) {
         if (getBakiye() >= fiyat){
             setBakiye(getBakiye() - fiyat);
             Bonus += fiyat * 0.2;
//             setBonus(getBonus() + fiyat * 0.2);
             return true;
         }
         else if (getBonus() >= fiyat){
             setBonus(getBonus() - fiyat);
             return true;
         }
         return false;
    }

    @Override
    public String toString() {
        return super.toString() + "Bonus=" + Bonus + '}';
    }
    
    
}
