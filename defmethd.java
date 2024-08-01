//default method using interface
interface MyCamera
{
    void takesnap();
    void recvideo();
    default void rec4kvideo()
    {
        System.out.println("Record in 4k");
    }
}
interface MyWifi
{
    String[] getNetworks();
    void ConnectToNetwork(String netork);
}
class MyCellPhone
{
    void callNumber(int phone_number)
    {
        System.out.println("Calling"+phone_number);
    }
    void pickCall()
    {
    System.out.println("Connecting....");
    }
}
class Smartphone extends MyCellPhone implements MyWifi,MyCamera
{
    public void takesnap()
    {
        System.out.println("Taking snap");
    }
    public void recvideo()
    {
        System.out.println("Recording video");
    }
    public void rec4kvideo()
    {
        greet();
        System.out.println("Recording in 4k");   
    }
    private void greet()
    {
        System.out.println("Good Morning");
    }
    public String[] getNetworks()
    {
        System.out.println("Getting list of networks");
        String[] networklist={"abc","xyz","jkl"};
        return networklist;
    }
    public void ConnectToNetwork(String network)
    {
        System.out.println("Connecting to..."+network);
    }
}
public class defmethd
{
    public static void main(String[]args)
    {
        Smartphone ms=new Smartphone();
        ms.rec4kvideo();
        String[] ar= ms.getNetworks();
        for(int item=0;item<=ar.length;item++)
        {
            System.out.println(ar[item]);
        }
        MyCamera cam1=new Smartphone();
        cam1.rec4kvideo();
    }
}