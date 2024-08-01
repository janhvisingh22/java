//interfaces
interface Bicycle
{
    int a=45;
    void applyBrake(int dec);
    void speedup(int inc);
}
interface HornBicycle
{
    int a=45;
    void BlowHornk3g();
    void BlowHornmhn();
}
class AvonCycle implements HornBicycle,Bicycle
{
    int speed=7;
    public void applyBrake(int dec)
    {
        System.out.println("Decrement");
    }
    public void speedup(int inc)
    {
        System.out.println("Increment");
    }
    void BlowHorn()
    {
        System.out.println("hi");
    }
    public void BlowHornk3g()
    {
        System.out.println("Kabhi khushi kabhi gham");
    }
    public void BlowHornmhn()
    {
        System.out.println("mai Hoon na");
    }
}
public class intfces
{
    public static void main(String args[])
    {
        AvonCycle j=new AvonCycle();
        j.BlowHorn();
        j.BlowHornk3g();
        j.BlowHornmhn();
    }
}
