/*
nCr
*/

import java.util.Scanner;
class nCr
{
    if(r > n)
      return 0;
    if(n==r || r == 0)
      return 1;
    else if (r == 1)
      return n;
    else
     return (nCr(n-1,r-1) + nCr(n-1,r));
}
