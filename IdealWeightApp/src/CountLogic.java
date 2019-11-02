import java.math.BigDecimal;
import java.math.RoundingMode;
public class CountLogic {
    public double hitungDrUmur(int umur, double t){
        double berat = 0;
        if(umur <= 10){
            berat =(umur*2)+8;
        }
        else if(umur > 10 && umur <= 70){
            berat = (t-100)*0.9;//(t-100)*0.1;
        }
        return berat;
    }
    public String isNormal (double bb, double bbi){
        String[] araistatus = {
            "Kurus \nAnda harus banyak makan makanan yang mengandung karbohidrat",
            "Normal\nTetaplah makan makanan yang bergizi ", 
            "OverWeight \nPerbanyaklah olahraga dan kurangi makanan yang berlemak", 
            "Obesity \nAnda harus mengurangi berat badan anda\nsupaya terhindar dari penyakit berbahaya" 
        };
        String status = "";
        if(bb < bbi - (bbi*0.1)){
            status = araistatus[0];
        }else if(bb >= bbi - (bbi*0.1) && (bb <= bbi + (bbi*0.1))){
            status = araistatus[1];
        }else if(bb >= bbi + (bbi*0.1) && (bb <= bbi + (bbi*0.2))){
            status = araistatus[2];
        }else if(bb > bbi + (bbi*0.3)){
            status = araistatus[3];
        }
        return status;
    }
    public static void main(String[] args) {
        System.out.println(new CountLogic().hitungDrUmur(30, 165));
    }
}
