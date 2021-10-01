import static java.lang.Math.min;
import java.util.Scanner;
class distance
{
    public static int abs(int x)
    {
        if(x<0)
            x=x*-1;
        return x;
    }
    public static void main(String[] args)
    {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sr.nextInt();
        }
        int X = sr.nextInt(); int Y = sr.nextInt(); 
        int min_dist = 10000000;
        int i = 0, j = 0;
        while(i < n)
        {
            if(arr[i] == X)
            {
                while( j < n && arr[j] != Y)
                    j++;
                if(j < n && arr[j] == Y)
                    min_dist = min(min_dist,abs(i-j));
                i = j;
            }
            else if(arr[i] == Y)
            {
                while( j < n && arr[j] != X)
                    j++;
                if(j < n && arr[j] == X)
                    min_dist = min(min_dist,abs(i-j));
                i = j;
            }
            else
                i++;
        }
        System.out.println(min_dist);
    }
}