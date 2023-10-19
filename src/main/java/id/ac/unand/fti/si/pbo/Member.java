package id.ac.unand.fti.si.pbo;

public class Member {
    protected Integer poin = 0;
    
    public Integer getPoin(){
        return poin;
    }

    public void redeemPoin(Integer hargaSouvenir){
        this.poin = this.poin - hargaSouvenir;
    }

    protected Integer getBonusPoin(Integer totalBayar){
        Integer poin = (int) (totalBayar / 10000);
        return poin;
    }
}
