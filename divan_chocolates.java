import java.util.*;
public class divan_chocolates
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int c = 0;
        while(c < input)
        {
            String data = sc.nextLine();
            String cost = sc.nextLine();
            String[] data_arr = data.split("\\s+");
            String[] cost_arr = cost.split("\\s+");
            int n, l, r, k;
            if( data_arr.length != 4)
            {
                System.out.println("Not enough data!");
            }
            else
            {
                n = Integer.parseInt(data_arr[0]);
                l = Integer.parseInt(data_arr[1]);
                r = Integer.parseInt(data_arr[2]);
                k = Integer.parseInt(data_arr[3]);
                int count = 0;
                if( n != cost_arr.length)
                {
                    System.out.println("Wrong amount of chocolates entered!");
                }
                else
                {
                    for(int i = 0; i < cost_arr.length; i++)
                    {
                        int choco_cost = Integer.parseInt(cost_arr[i]);
                        if((choco_cost <= r) && (choco_cost >= l))
                        {
                            if(choco_cost <= k)
                            {
                                count++;
                                k -= choco_cost;
                            }
                        else
                        continue;
                        }
                    }
                 System.out.println(count);
                }
            }
            c++;
        }

    }
}