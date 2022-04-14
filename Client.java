public class Client
{
    public static void main (String[] args)
    {
        Bluetooth bluetooth = new proxyBluetooth();
        try
        {
            bluetooth.connectTo("androiddevice");
            bluetooth.connectTo("appledevice");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
