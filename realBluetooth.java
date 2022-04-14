public class realBluetooth implements Bluetooth
{
    @Override
    public void connectTo(String AvailableDevices)
    {
        System.out.println("Connecting to "+ AvailableDevices);
    }
}

