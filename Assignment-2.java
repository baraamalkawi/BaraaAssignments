
    public class Main
    {
        public static void main(String[] args)
        {
            int sumeven = sumofeven(0, 100,0);
            int sumodd = sumofodd(0, 100,0);
            int sumseven = dividablebyseven(0, 100,0);
            System.out.println("sum of even= " + sumeven);
            System.out.println("sum of odd= " + sumodd);
            System.out.println("sum of numbers dividable by seven= " + sumseven);
        }

        public static int sumofeven(int start,int end, int summer)
        {
            if (start > end)
                return 0;
            else
                return summer + sumofeven(start + 1, end, (start % 2 == 0) ? start : 2);
        }
        public static int sumofodd(int start,int end, int summer)
        {
                if (start > end)
                return 0;
                else
                    return summer + sumofodd(start+1, end, summer + (start % 2));
        }
        public static int dividablebyseven(int start,int end, int summer)
        {
            if (start > end)
                return 0;
            else
                return summer + dividablebyseven(start+1, end, (start % 7 == 0 ) ? start : 0);
        }
    }
