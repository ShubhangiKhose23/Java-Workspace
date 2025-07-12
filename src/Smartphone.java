/*1. Create an abstract class `Device` with abstract method `powerOn()` and a concrete method `connectWifi()`.
2. Implement the `Device` class as `Smartphone` and demonstrate method calls.
3. Show how a class can implement two interfaces: `Bluetooth`, `Wi-fi`.
4. Demonstrate the use of final method and variable in a class.
*/

abstract class Device {

abstract void powerOn();

public void connectWifi(){
    System.out.println("Connection .......");
}
}
interface Bluetooth
{
    void connectBluetooth();
}
interface Wifi
{
    void connectWifi();
}
class Smartphone extends Device implements Bluetooth, Wifi{

    @Override
    public void connectBluetooth() {
        System.out.println("Bluetooth connected.");
    }

    @Override
    void powerOn() {
        System.out.println("Power On");
    }

    @Override
    public void connectWifi() {
        System.out.println("Wifi connected.");
    }

    final void abc(){
    final int a=12;
    System.out.println(a);
    }


    public static void main(String[] args)
    {
    Smartphone sm=new Smartphone();
    sm.connectBluetooth();
    sm.connectWifi();
    sm.powerOn();
    sm.abc();
    }
}
