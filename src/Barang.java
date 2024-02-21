class Barang {
    //buat atribut menggunakan modifier private
    //buat atribut nama dan deskripsi barang
    //buat atribut berat barang, jumlah barang, harga
    private String namaBarang, deskripsiBarang;
    private double beratBarang, harga;
    private int jumlahBarang;


    //buat constructor untuk mengisi data ke atribut
    public Barang(String namaBarang, String deskripsiBarang, double beratBarang, int jumlahBarang, double harga ) {
        this.namaBarang = namaBarang;
        this.deskripsiBarang = deskripsiBarang;
        this.beratBarang = jumlahBarang;
        this.jumlahBarang = jumlahBarang;
        this.harga = harga;
    }

    //buat getter untuk pengambilan data
    public String getNamaBarang() {
        return this.namaBarang;
    }

    public String getDeskripsiBarang() {
        return this.deskripsiBarang;
    }

    public double getBeratBarang() {
        return this.beratBarang;
    }

    public int getJumlahBarang() {
        return this.jumlahBarang;
    }

    public double getHarga() {
        return this.harga;
    }
}