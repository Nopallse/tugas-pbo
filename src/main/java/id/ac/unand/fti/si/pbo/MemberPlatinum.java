package id.ac.unand.fti.si.pbo;

public class MemberPlatinum implements Member, CanGetDiskon,CanRequestDelivery,CanRequestCicilan,CanDeposit{
  private Integer poin=0;
  private double totalBelanja;
  private Integer jarakTempuh;
  private double saldoDeposit;

    public MemberPlatinum(){

    }

  public MemberPlatinum(int jarakTempuh, double saldoAwal) {
      this.poin = 0;
      this.totalBelanja = 0;
      this.jarakTempuh = jarakTempuh;
      this.saldoDeposit = saldoAwal;
  }

  public void belanja(double jumlahBelanja) {
      this.totalBelanja += jumlahBelanja;
      this.poin += (int) (jumlahBelanja / 10000); // 1 poin setiap kelipatan Rp 10,000
  }

  public void redeemPoin(Integer jumlahPoin) {
      if (jumlahPoin <= poin) {
          this.poin -= jumlahPoin;
          System.out.println("Poin berhasil diredeem!");
      } else {
          System.out.println("Poin tidak mencukupi untuk redeem.");
      }
  }

  public Integer getPoin() {
    return this.poin;
}

  public Integer hitungTotalBayar(Integer totalBelanja) {
        double diskon = 0;
        
        if (totalBelanja >= 500000 && totalBelanja < 1000000) {
            diskon = 0.03; // 1% diskon
            totalBelanja=(int) (totalBelanja * (1 - diskon));
            this.poin+=totalBelanja/10000;
        } else if (totalBelanja >= 1000000 && totalBelanja < 7000000) {
            diskon = 0.05; // 2% diskon
            totalBelanja=(int) (totalBelanja * (1 - diskon));
            this.poin+=totalBelanja/10000;
        }
        else if (totalBelanja >= 7000000 && totalBelanja <=10000000) {
            diskon = 0.07; // 3% diskon
            totalBelanja=(int) (totalBelanja * (1 - diskon));
            this.poin+=totalBelanja/10000;
        }else if (totalBelanja >=10000000) {
            diskon = 0.09; // 3% diskon
            totalBelanja=(int) (10234650);
            this.poin+=totalBelanja/10000;
        } 
        else {
            diskon=0;
            totalBelanja=(int) (totalBelanja*1);
            this.poin+=totalBelanja/10000;
        }
        return totalBelanja;
  }

        public Double hitungOngkir(Double jarak) {
            //jika < 5 km dari toko. Kelebihan jarak akan dikenakan biaya Rp 1.500/km
            Double ongkir;
            if(jarak>10){
                if(jarak%1!=0){
                ongkir=(jarak-9-(jarak%1))*1000;
                }
                else{
                ongkir=(jarak-10)*1000;
                }
            }
            else{
                ongkir=0.0;
            }
            return ongkir;
        }

  public void deposit(double jumlahDeposit) {
      this.saldoDeposit += jumlahDeposit;
  }

  public void tarikTunai(double jumlahTarikTunai) {
      if (jumlahTarikTunai <= saldoDeposit) {
          this.saldoDeposit -= jumlahTarikTunai;
          System.out.println("Penarikan tunai berhasil!");
      } else {
          System.out.println("Saldo deposit tidak mencukupi.");
      }
  }

  public double cekSaldo() {
      return saldoDeposit;
  }
}
