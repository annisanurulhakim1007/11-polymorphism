public class VirtualDemo {
    public static void main(String[] args) 
    {
        //Polymorphism
        Gaji gajiPegawai = new Gaji("Annisa Nurul Hakim", "Padang", 107, 1000000);
        gajiPegawai.mailCheck();

        Pegawai pegawai = new Gaji("Muhammad Luthfi Kamil", "Bukittinggi", 134, 5000000);
        pegawai.mailCheck();

        double pay = gajiPegawai.computePay();
        System.out.println("Pembayaran Gaji: Rp " + pay);
    }
}