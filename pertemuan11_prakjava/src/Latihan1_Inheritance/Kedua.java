package Latihan1_Inheritance;

//Created by 21343050_Heri Ramadhan

public class Kedua extends Pertama{
    private int b = 8;

    protected void BacaSuper() {
        System.out.println("Nilai b = " + b);
        terprotek();
        info();
    }
}
