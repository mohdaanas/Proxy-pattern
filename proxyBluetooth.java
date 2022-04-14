import java.util.ArrayList;
import java.util.List;


public class proxyBluetooth implements Bluetooth
//proxy pattern is used here by declaring a class as proxyBluetooth
{
    private Bluetooth bluetooth = new realBluetooth();
    private static List<String> bannedSites;

    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("appledevice");
        bannedSites.add("windowsdevice");
    }

    @Override
    public void connectTo(String AvailableDevices) throws Exception
    {
        if(bannedSites.contains(AvailableDevices.toLowerCase()))
        {
            throw new Exception("Access Denied");
        }

        bluetooth.connectTo(AvailableDevices);
    }

}