package Latihan5_Encapsulation;

//Created by 21343050_Heri Ramadhan

public class ujiBus{
    public static void main(String[] args) {
        //membuat objek busMini dari kelas bus
        Bus busMini = new Bus();

        //memasukkan nilai jumlah penumpang dan
        //penumpang maksimal ke dalam obkel busMini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;

        //memanggil method cetak pada kelas bus
        busMini.cetak();

        //menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil method cetak pada kelas bus
        busMini.cetak();

        //mengurangi jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang - 2;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();

        //menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
}
