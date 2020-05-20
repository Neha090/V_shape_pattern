public class V_shape_pattern{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number to get pattern")
         int n=sc.nextInt();
         for(int i=1;i<=n;i++)
         {
             get_pattern(1,i,n);
             System.out.println();
         }
     }
     
    static void  get_pattern(int num,int i,int n)
     {
         if(num==n+1)
         {
             return;
         }
         if(num<=i)
         {
             System.out.print(num);
             get(num+1,i,n);
             System.out.print(num);
         }
         if(num>i)
         {
             System.out.print(" ");
             get(num+1,i,n);
             System.out.print(" ");
         }
     }
}
