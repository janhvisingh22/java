import java.util.Scanner;
public class mazegrid_normal
{
    public static int countPath(int i, int j, int n, int m) 
    {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 || j == m - 1) {
            return 1;
        }
        // move Downward
        int downward = countPath(i + 1, j, n, m);
        // move Right
        int right = countPath(i, j + 1, n, m);
        return (downward + right);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Rows:");
        int n = sc.nextInt();
        System.out.println("Enter the Length of the Column");
        int m = sc.nextInt();
        // Note:initially We take positon is (0,0):
        System.out.println("Total path through maze travel:" + countPath(0, 0, n, m));
        sc.close();
    }
}