import java.util.Scanner;
class calender 
{
    public static void main ()
    {
         Scanner br=new Scanner (System.in);
        int h=0;
        String g []={"January","February","March","April","May","June","July","August","September","October","November","December"};
        int d[]={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println ("Enter the year");
        int z=br.nextInt();
        if(z%4==0)
        {
            d[1]=29;
        }
       
        System.out.println ("Enter N");
        int N= br.nextInt ();int sum=0; int b; int l=0;int s=0;
        for (int i=0;i<12;i++)
        {
             b=i*30;
             sum+=d[i];
             l+=d[i];
             if (N%10==0&&N>h&&N<=b)
            {
                System.out.print (g[i-1]+",");
                break;
            }
            if (N>h&&N<b)
            {
                l=l-(d[i]+d[i-1]);
                sum-=d[i];
                int j=sum-l;
                int k=sum-N;
                 s=j-k;
                
                 if (s==0)
                 {
                     System.out.print(g[i-2]+",");
                     break;
                 }
                
                System.out.print (g[i-1]+",");
                
              break;
            }
            if (N>=335)
            {
            System.out.print (g[11]);
            break;
            }
            
            h=b;

        }
        
       if (N%3==0&&N%10==0)
            {
                System.out.print ("30,");
                
            }
         if (s==0&&N%10!=0)
         {
             if(z%4==0)
             System.out.print("1,");
             else
             System.out.print("31,");
         }
          else if(N%10!=0)
          {
              if(z%4==0)
             System.out.print("31,");
             else
         System.out.print(s+",");
        }
        System.out.print(z);
    }
    
}