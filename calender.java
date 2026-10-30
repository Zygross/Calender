import java.util.Scanner;
class calender 
{
    public static void main ()
    {
        int h=0;
        String g []={"January","February","March","April","May","June","July","August","September","October","November","December"};
        int d[]={31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner br=new Scanner (System.in);
        System.out.println ("Enter N");
        int N= br.nextInt ();int sum=0; int b; int l=0;
        for (int i=0;i<12;i++)
        {
             b=i*30;
             sum+=d[i];
             l+=d[i];
             
            if (N>h&&N<b)
            {
                
                System.out.print (g[i-1]+",");
                l=l-(d[i]+d[i-1]);
                sum-=d[i];
              break;
            }
            if (N>=335)
            {
            System.out.println (g[11]);
            break;
            }
            
            h=b;

        }
        int j=sum-l;
        int k=sum-N;
        int s=j-k;
       
         System.out.println(sum);
          System.out.println(l);
           System.out.println(j);
            
         System.out.println(s);
         
    }
    
}