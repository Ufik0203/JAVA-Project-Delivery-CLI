public interface CustomerInfo {
    String getSenderName();
    String getSenderAddress();
    int getSenderPhoneNumber();
    String getReceiverName();
    String getReceiverAddress();
    int getReceiverPhoneNumber();
    
    void setReceiverPhoneNumber(int nomorPenerima);
}
