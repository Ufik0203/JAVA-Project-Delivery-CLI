abstract class Transaction implements ProductInfo, ShippingInfo, CostInfo, CustomerInfo {
    }

    class Pemrosesan extends Transaction {
        // Attribut product, shippingInfo, costInfo, customerInfo
        private Barang product;
        private Pengiriman shippingInfo;
        private Biaya costInfo;
        private Pelanggan customerInfo;
    
        // Constructor untuk pengisian data
        public Pemrosesan(Barang product, Pengiriman shippingInfo, Biaya costInfo, Pelanggan customerInfo) {
            this.product = product;
            this.shippingInfo = shippingInfo;
            this.costInfo = costInfo;
            this.customerInfo = customerInfo;
        }
    
        // Override method sesuai dengan implementasi interface
        @Override
        public String getProductName() {
            return product.getNamaBarang();
        }
    
        @Override
        public String getProductDescription() {
            return product.getDeskripsiBarang();
        }
    
        @Override
        public double getProductWeight() {
            return product.getBeratBarang();
        }
    
        @Override
        public int getProductQuantity() {
            return product.getJumlahBarang();
        }
    
        @Override
        public double getProductPrice() {
            return product.getHarga();
        }
    
        @Override
        public String getShippingType() {
            return shippingInfo.getTipeLayanan();
        }
    
        @Override
        public String getShippingStatus() {
            return shippingInfo.getStatusPengiriman();
        }
    
        @Override
        public String getShippingDestination() {
            return shippingInfo.getTujuanPengiriman();
        }
    
        @Override
        public String getPaymentMethod() {
            return shippingInfo.getMetodePembayaran();
        }
    
        @Override
        public int getReceiptNumber() {
            return shippingInfo.getReceiptNumber();
        }
    
        @Override
        public double getShippingCost() {
            return costInfo.getBiayaPengiriman();
        }
    
        @Override
        public double getAdditionalCost() {
            return costInfo.getBiayaTambahan();
        }
    
        @Override
        public String getSenderName() {
            return customerInfo.getNamaPengirim();
        }
    
        @Override
        public String getSenderAddress() {
            return customerInfo.getAlamatPengirim();
        }
    
        @Override
        public int getSenderPhoneNumber() {
            return customerInfo.getNomorPengirim();
        }
    
        @Override
        public String getReceiverName() {
            return customerInfo.getNamaPenerima();
        }
    
        @Override
        public String getReceiverAddress() {
            return customerInfo.getAlamatPenerima();
        }
    
        @Override
        public int getReceiverPhoneNumber() {
            return customerInfo.getNomorPenerima();
        }

        @Override
        public void setReceiverPhoneNumber(int nomorPenerima) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setReceiverPhoneNumber'");
        }
    }