import java.util.Scanner;
class Flight_SeatNumber_Analysis
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int seat_no = sc.nextInt(); //input as 7126
        String s = String.valueOf(seat_no);
        /**
         * "7126" => '7' '2' '1' '6'
         */

        int even_sum = 0;
        int odd_sum = 0;

        for(int i=0; i<s.length();i++)
        {
            if(i%2==0){
                even_sum += (int)s.charAt(i);
            }
            else{
                odd_sum += (int)s.charAt(i);
            }
        }
        System.out.println(even_sum>odd_sum?"Primum":"Standard");
        sc.close();
    }
}



