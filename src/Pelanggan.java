class Pelanggan {
    //buat atribut menggunakan modifier private
    //buat atribut nama pengirim, alamat pengirim, nama penerima, alamat penerima
    //buat atribut nomor pengirim, nomor penerima
    private String namaPengirim;
    private String alamatPengirim;
    private String namaPenerima;
    private String alamatPenerima;
    private int nomorPengirim;
    private int nomorPenerima;


    //buat constructor untuk mengisi data ke atribut
    public Pelanggan(String namaPengirim, String alamatPengirim, int nomorPengirim, String namaPenerima, String alamatPenerima, int nomorPenerima) {
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = namaPengirim;
        this.nomorPengirim = nomorPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.nomorPenerima = nomorPenerima;
    }

    //buat getter untuk pengambilan data
    public String getNamaPengirim() {
        return this.namaPengirim;
    }

    public String getAlamatPengirim() {
        return this.alamatPengirim;
    }

    public String getNamaPenerima() {
        return this.namaPenerima;
    }

    public String getAlamatPenerima() {
        return this.alamatPenerima;
    }

    public int getNomorPengirim() {
        return this.nomorPengirim;
    }

    public int getNomorPenerima() {
        return this.nomorPenerima;
    }

    public void setReceiptNumber(int nomorPenerima) {
        this.nomorPenerima = nomorPenerima;
    }

}