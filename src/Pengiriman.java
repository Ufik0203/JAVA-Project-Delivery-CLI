class Pengiriman {
    //buat atribut menggunakan modifier private
    //buat atribut tujuan pengiriman, tipe layanan, status pengiriman, dan metode pembayaran
    //buat atribut no resi
    private String tujuanPengiriman, statusPengiriman, tipeLayanan, metodePembayaran;
    private int noResi;

    //buat getter untuk pengambilan data
    public String getTujuanPengiriman() {
        return this.tujuanPengiriman;
    }

    public String getStatusPengiriman() {
        return this.statusPengiriman;
    }

    public String getTipeLayanan() {
        return this.tipeLayanan;
    }

    public String getMetodePembayaran() {
        return this.metodePembayaran;
    }

    public int getReceiptNumber() {
        return this.noResi;
    }

    public void setShippingType(String tipeLayanan) {
        this.tipeLayanan = tipeLayanan;
    }

    public void setShippingStatus(String statusPengiriman) {
        this.statusPengiriman = statusPengiriman;
    }

    public void setPaymentMethod(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public void setShippingDestination(String tujuanPengiriman) {
        this.tujuanPengiriman = tujuanPengiriman;
    }

    public void setReceiptNumber(int noResi) {
        this.noResi = noResi;
    }
    // (Kurang stter)
}
