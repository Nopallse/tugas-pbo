package id.ac.unand.fti.si.pbo;

public class App {
    
    public static void main(String[] args) {
    
    MemberSilver memberSilver = new MemberSilver();
    MemberPlatinum member = new MemberPlatinum();
    member.hitungTotalBayar(11005000);
    member.getPoin();
    
    System.out.println("Poin value: " + memberSilver.getPoin());

    System.out.println("Total bayar: : 0");
    System.out.println("Total bayar: " + memberSilver.hitungTotalBayar(50000));
    System.out.println("Poin after calculation: " + memberSilver.getPoin());
    
    System.out.println("Total bayar: : 5");
    System.out.println("Total bayar: " + memberSilver.hitungTotalBayar(550000));
    System.out.println("Poin after calculation: " + memberSilver.getPoin());
    
    System.out.println("Total bayar: : 59");
    System.out.println("Total bayar: " + memberSilver.hitungTotalBayar(2000000));
    System.out.println("Poin after calculation: " + memberSilver.getPoin());
    
    System.out.println("Total bayar: : 253");
    System.out.println("Actual: " + memberSilver.hitungTotalBayar(8000000));
    System.out.println("Poin after calculation: " + memberSilver.getPoin());
    
    System.out.println("Total bayar: : 0");
    System.out.println("Actual: " + memberSilver.hitungOngkir(4.9));
    
    System.out.println("Total bayar: : 4500");
    System.out.println("Actual: " + memberSilver.hitungOngkir(7.3));

    

System.out.println("total belanja: 50000");
System.out.println("Actual: " + memberSilver.hitungTotalBayar(50000));
System.out.println("Poin after calculation: " + memberSilver.getPoin());

System.out.println("total belanja: 550000");
System.out.println("Actual: " + memberSilver.hitungTotalBayar(550000));
System.out.println("Poin after calculation: " + memberSilver.getPoin());

System.out.println("total belanja: 2000000");
System.out.println("Actual: " + memberSilver.hitungTotalBayar(2000000));
System.out.println("Poin after calculation: " + memberSilver.getPoin());

System.out.println("total belanja: 8000000");
System.out.println("Actual: " + memberSilver.hitungTotalBayar(8000000));
System.out.println("point yang di dapatkan: " + memberSilver.getPoin());

System.out.println("Jarak: 4.9");
System.out.println("Ongkos Kirim: " + memberSilver.hitungOngkir(4.9));

System.out.println("Jarak: 7.3");
System.out.println("Ongkos Kirim:: " + memberSilver.hitungOngkir(7.3));

    
    }
}