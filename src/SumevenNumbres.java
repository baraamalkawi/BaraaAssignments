public class SumevenNumbres {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                sum += i;
        }
        {
            System.out.println(("sum of even number forloop=" + sum));
        }

//
        int sum1 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1)
                sum1 += i;
        }
        {
            System.out.println("sum of odd number forloop=" + sum1);
        }


        int sum2 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 7 == 0)
                sum2 += i;
        }

        {
            System.out.println("sum of number that is dividable by 7 forloop= " + sum2);

        }

        //sum of even number whileloop
        int sumx = 0;
        int t = 0;
        while (t <= 100) {
            if (t % 2 == 0) {
                sumx += t;

            }
            t++;

        }
            System.out.println("sum of even number whileloop=" + sumx);

//sum of odd number whileloop

        int sumy= 0;
        int w = 0;
        while (w <= 100) {
            if (w % 2 == 1) {
                sumy += w;

            }
            w++;

        }
        System.out.println("sum of odd number whileloop=" + sumy);

        //sum of number that is dividable by 7 whileloop

        int sumz= 0;
        int b = 0;
        while (b <= 100) {
            if (b % 7 == 0) {
                sumz += b;

            }
            b++;

        }
        System.out.println("sum of number that is dividable by 7 whileloop=" + sumz);


        //sum of even number do-while
        int sumf=0;
        int a=0;
        do { if (a % 2 == 0)
            sumf += a;
            a++;}
        while (a<=100);
            System.out.println("sum of even number do-while=" + sumf);




        //sum of odd number do-while

        int sumg=0;
        int k=0;
        do { if (k % 2 == 1)
            sumg += k;
            k++;}
        while (k<=100);
        System.out.println("sum of odd number do-while=" + sumg);


        //sum of number that is dividable by 7 do-while

        int suml=0;
        int m=0;
        do { if (m % 7 == 0)
            suml += m;
            m++;}
        while (m<=100);
        System.out.println("sum of odd number do-while=" + suml);

        }











    }


























