class Biaya {
    //buat atribut menggunakan modifier private
    //buat atribut biaya pengiriman dan biaya tambahan
    private double biayaPengiriman;
    private double biayaTambahan;

    // buat setter untuk mengisi data ke atribut
    public void setShippingCost(double biayaPengiriman) {
        this.biayaPengiriman = biayaPengiriman;
    }

    public void setAdditionalCost(double biayaTambahan) {
        this.biayaTambahan = biayaTambahan;
    }
    
    //buat getter untuk pengambilan data
    public double getBiayaPengiriman() {
        return this.biayaPengiriman;
    }

    public double getBiayaTambahan() {
        return this.biayaTambahan;
    }
}
