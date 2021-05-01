
package h6uyg;

public abstract class Kart {
    private int id;
    private String Sahip;
    private double Bakiye;

    public Kart(int id, String Sahip, double Bakiye) {
        this.id = id;
        this.Sahip = Sahip;
        this.Bakiye = Bakiye;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSahip() {
        return Sahip;
    }

    public void setSahip(String Sahip) {
        this.Sahip = Sahip;
    }

    public double getBakiye() {
        return Bakiye;
    }

    public void setBakiye(double Bakiye) {
        this.Bakiye = Bakiye;
    }

    @Override
    public String toString() {
        return "Kart{" + "id=" + id + ", Sahip=" + Sahip + ", Bakiye=" + Bakiye + '}';
    }
    
    public abstract boolean odemeYap(double fiyat);
}
