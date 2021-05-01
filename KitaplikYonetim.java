
package h6uyg;

public class KitaplikYonetim {
    private Kitaplik kitaplık;

    public KitaplikYonetim(Kitaplik kitaplık) {
        this.kitaplık = kitaplık;
    }
    
    public boolean kitapSat(Kitap kitap, Kart k){
        
        int rafNo = kitaplık.kitapAra(kitap.getAd());
        
        if(rafNo == -1){
            return false;
        }
        else if(k.odemeYap(kitap.getFiyat())){
            System.out.println("Satış gerçekleşti.");
            return true;
        }
        else{
            System.out.println("Yetersiz Bakiye");
            return false;          
        }

    }
    
}
