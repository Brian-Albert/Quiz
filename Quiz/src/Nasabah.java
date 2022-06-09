public class Nasabah{

    public String nama;
    public String rek;
    public int saldo;
    public int jumlah;
    
    public Nasabah (String nama, String rek, int saldo, int jumlah){
    this.nama = nama;
    this.rek = rek;
    this.saldo = saldo;
    this.jumlah = jumlah;
    } 


    @Override
    public String toString() {
        return "{" +
            " nama='" + nama + "'" +
            ", rek='" + rek + "'" +
            ", saldo='" + saldo + "'" +
            ", jumlah='" + jumlah + "'" +
            "}";
    } 
        
}