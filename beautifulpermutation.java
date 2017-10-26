public class beautifulpermutation
{
    static int c=0;
    public static void main(String[] args)
    {
        String str = "1221";
        int n = str.length();
        beautifulpermutation permutation = new beautifulpermutation();
        permutation.permute(str, 0, n-1);
        System.out.println(c);
    }
    private void permute(String str, int l, int r)
    {
        if (l == r)
        {
            System.out.println(str);
            int cc=0;
            for(int i=0;i<str.length()-1;i++)
            {
               if((str.charAt(i)-'0')-(str.charAt(i+1)-'0')==0)
               {
            //    System.out.println(str);
                   cc=1;
                   break;
               }
            }
            if(cc==0)
            {
                c++;
            }
        
    }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
 
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
 
}
 
