import java.util.Scanner;

public class maze_grid 
{
    static int Push_count(int n,int m)
    {
        int[][] p= new int[n+1][m+1];
        for(int i=1;i<=n;i++)
        {
            p[i][0]=i;
        }
        for(int j=1;j<=m;j++)
        {
            p[0][j]=j;
        }
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                p[i][j]=Math.min(p[i-1][j],p[i][j-1])+1;
            }
        }
        return p[n][m];
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter value of m: ");
        int m = scanner.nextInt();
        //int n=5;
        //int m=5;
        int pushes=Push_count(n,m);
        System.out.println("Total pushes in maze="+pushes);
        sc.close();
    }
}
