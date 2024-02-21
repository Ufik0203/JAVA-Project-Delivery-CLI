import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        //buat object Pelanggan dengan nama "userid"
        Pelanggan userid;
        //buat objetc Barang dengan nama "brg"
        Barang brg;
        //buat object Pengiriman dengan nama "kirim"
        Pengiriman kirim;
        //Buat object Biaya dengan bya
        Biaya bya;

        Transaction[] express = new Pemrosesan[50];
        String nam1, alt1, nam2, alt2, nambrg, desbrg;
        int pilih, telp1, telp2, beratbrg, jumbrg, hargabrg;
        int urut = 0;
        int simpan;
        Random rand = new Random();
        int upperbound = 9999999;

        Scanner keyboard = new Scanner(System.in);
        clrscr();
        while(true){
            System.out.println("##################################");
            System.out.println("########## SECEPAT DATA ##########");
            System.out.println("##################################");
            System.out.println("1. Masukkan Data Baru");
            System.out.println("2. Tampilkan Semua Data");
            System.out.println("3. Exit");
            System.out.print("Masukkan Pilihan: ");
            pilih = keyboard.nextInt();
            switch(pilih){
            case 1:
                clrscr();
                keyboard.nextLine();
                urut = urut + 1;

                //buat object baru Pengiriman
                kirim = new Pengiriman();
                //buat object baru Biaya
                bya = new Biaya();

                System.out.println("##########################################");
                System.out.println("########## INPUT DATA PELANGGAN ##########");
                System.out.println("##########################################");
                System.out.print("Nama Pengirim        : ");
                nam1 = keyboard.nextLine();
                System.out.print("Alamat Pengirim      : ");
                alt1 = keyboard.nextLine();
                System.out.print("No Telp Pengirim     : ");
                telp1 = keyboard.nextInt();
                System.out.print("Nama Penerima        : ");
                keyboard.nextLine();
                nam2 = keyboard.nextLine();
                System.out.print("Alamat Penerima      : ");
                alt2 = keyboard.nextLine();
                System.out.print("Nomor Telp Penerima  : ");
                telp2 = keyboard.nextInt();
                //buat object baru Pelanggan dengan memasukkan semua argumen untuk contructor
                userid =  new Pelanggan(nam1, alt1, telp1, nam2, alt2, telp2);
                
                clrscr();
                keyboard.nextLine();
                System.out.println("#######################################");
                System.out.println("########## INPUT DATA BARANG ##########");
                System.out.println("#######################################");
                System.out.print("Nama Barang         : ");
                nambrg = keyboard.nextLine();
                System.out.print("Deskripsi Barang    : ");
                desbrg = keyboard.nextLine();
                System.out.print("Berat Barang(kg)    : ");
                beratbrg = keyboard.nextInt();
                System.out.print(" Jumlah Barang      : ");
                jumbrg = keyboard.nextInt();
                System.out.print("Harga Barang        : ");
                hargabrg = keyboard.nextInt();
                //buat object baru Barang dengan memasukkan semua argumen untuk contructor
                brg = new Barang(nambrg, desbrg, beratbrg, jumbrg, hargabrg);

                clrscr();
                System.out.println("###########################################");
                System.out.println("########## INPUT DATA PENGIRIMAN ##########");
                System.out.println("###########################################");
                System.out.println("Jenis Layanan?");
                System.out.println("1. Regular");
                System.out.println("2. Express");
                System.out.print("Masukkan Pilihan: ");
                pilih = keyboard.nextInt();
                switch(pilih){
                case 1:
                    //set tipe pembayaran "Reguler"
                    kirim.setShippingType("Reguler");
                    //set data biaya pembayaran dengan nilai 20000
                    bya.setShippingCost(20000);
                    break;
                case 2:
                    //set tipe pembayaran "Express"
                    kirim.setShippingType("Ekspress");
                    //set data biaya pembayaran dengan nilai 50000
                    bya.setShippingCost(50000);
                    break;
                }
                clrscr();
                System.out.println("###########################################");
                System.out.println("########## INPUT DATA PENGIRIMAN ##########");
                System.out.println("###########################################");
                System.out.println("Status Pengiriman?");
                System.out.println("1. Belum Dikirim");
                System.out.println("2. Sedang Dikirim");
                System.out.println("3. Sudah Diterima");
                System.out.print("Masukkan Pilihan: ");
                pilih = keyboard.nextInt();
                switch(pilih){
                case 1:
                    //set status pengiriman "Belum Dikirim"
                    kirim.setShippingStatus("Belum Dikirim");
                    break;
                case 2:
                    //set status pengiriman "Sedang Dikirim"
                    kirim.setShippingStatus("Sedang Dikirim");
                    break;
                case 3:
                    //set status pengiriman "Sudah Diterima"
                    kirim.setShippingStatus("Sudah Dikirim");
                    break;
                }
                clrscr();
                System.out.println("###########################################");
                System.out.println("########## INPUT DATA PENGIRIMAN ##########");
                System.out.println("###########################################");
                System.out.println("Metode Pembayaran?");
                System.out.println("1. CASH");
                System.out.println("2. PAYLATER");
                System.out.print("Masukkan Pilihan: ");
                pilih = keyboard.nextInt();
                switch(pilih){
                case 1:
                    //set metode pembayaran "CASH"
                    kirim.setPaymentMethod("CASH");
                    //set biaya tambahan 1000
                    bya.setAdditionalCost(1000);
                    break;
                case 2:
                    //set metode pembayaran "PAYLATER"
                    kirim.setPaymentMethod("PAYLATER");
                    //set biaya tambahan 5000
                    bya.setAdditionalCost(5000);
                    break;
                }
                simpan = rand.nextInt(upperbound);
                kirim.setReceiptNumber(simpan);
                kirim.setShippingDestination(alt2);

                express[urut-1] = new Pemrosesan(brg, kirim, bya, userid);
                //buat object baru Express dengan memasukkan semua argumen untuk contructor
                

                clrscr();
                break;
            case 2:
                clrscr();
                clrscr();
                System.out.println("###################################");
                System.out.println("########## SHOW ALL DATA ##########");
                System.out.println("###################################");
                for( int a = 0; a < urut; a++){

                    System.out.println("nomor : " + a+1);
                    System.out.println("## PENGIRIM ##");
                    System.out.println("Nama      : " + express[a].getSenderName());
                    System.out.println("Alamat    : " + express[a].getSenderAddress());
                    System.out.println("no HP     : " + express[a].getSenderPhoneNumber());
                    System.out.println("## PENERIMA ##");
                    System.out.println("Nama      : " + express[a].getReceiverName());
                    System.out.println("Alamat    : " + express[a].getReceiverAddress());
                    System.out.println("no HP     : " + express[a].getReceiverPhoneNumber());
                    System.out.println();
                    System.out.println("## BARANG ##");
                    System.out.println("Nama      : " + express[a].getProductName());
                    System.out.println("Deskripsi :" + express[a].getProductDescription());
                    System.out.println("Berat     :" + express[a].getProductWeight());
                    System.out.println("Jumlah    : " + express[a].getProductQuantity());
                    System.out.println("Harga     :" + express[a].getProductPrice());
                    System.out.println();
                    System.out.println("## DETAIL ##");
                    System.out.println("No Resi                   : " + express[a].getReceiptNumber());
                    System.out.println("Tujuan                    : " + express[a].getShippingDestination());
                    System.out.println("Jenis Layanan             : " + express[a].getShippingType());
                    System.out.println("Status Pengiriman         : " + express[a].getShippingStatus());
                    System.out.println("Metode Pembayaran         : " + express[a].getPaymentMethod());
                    double aa = express[a].getShippingCost();
                    double bb = express[a].getAdditionalCost();
                    double cc = aa + bb;
                    System.out.println("Total Biaya Pengiriman    : " + cc);
                    System.out.println("###################################");
                    }
                    keyboard.nextLine();
                    keyboard.nextLine();
                    System.out.println();
                    System.out.println("press enter to return back");
                    clrscr();
                    break;
                    
                case 3:
                    System.exit(0);
                    break;

            }
        }
    }


    //biarkan code di bawah ini atau hapus jika tidak di perlukan
    public static void clrscr(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}