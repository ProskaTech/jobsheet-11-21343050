package Latihan3_Inheritance;

//Created by 21343050_Heri Ramadhan

public class Gajah extends Hewan{
    public static void testClassMethod() {
        System.out.println("The Class Method in Hewan");
    }

    //meng-overwrite method pada class hewan
    public void testInstanceMethod() {
        System.out.println("The Instance Method in Gajah");
    }

    public static void main(String args[]) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
