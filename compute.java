/*
compute a^n(Exponent / power Function)
*/

import java.util.Scanner;
class compute
{
        static int computePower(int base, int exp)
        {
            if(base == 0)
                return 0;
            else if (exp == 0)
                return 1;
            else if( exp == 1)
             return base;
             else
              return base*computePower(base,exp-1);

        }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();

        int res = computePower(base,exponent);
        System.out.println("result "+res);
    }
}