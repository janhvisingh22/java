import java.util.*;
public class practise
{
    public static void main(String args[])
    {
        ArrayList<Float> list=new ArrayList<Float>();//Creating arraylist
        list.add((float) 5);//Adding 5 to the arraylist
        list.add((float)10.5);
        list.add((float)9.3);
        //Traversing list through iterator
        Iterator<Float> itr=list.iterator();
        while(itr.hasNext())
        System.out.println(itr.next());
    }
}