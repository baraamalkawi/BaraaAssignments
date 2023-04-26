package Assignment3;

public class Arrays
{
    static int[] num = {10, 90, 324, 9808, 45};

    public static void main(String[] args)
    {

        System.out.println("Largest in geven array is=" + largest());
        System.out.println("Smallest in geven array is=" + smallest());
        System.out.println("the avarg is="+avg());
        int[] sortedArr = SortedArray();
        for (int i = 0; i < sortedArr.length; i++)
            System.out.print(sortedArr[i] + " ");
        }





         public static  int largest(){

                int i;
                int max=num[0];
                for ( i=1;i < num.length ; i++)
                    if (num[i]>max)
                        max=num[i];
                return max;}



   public static int smallest(){

        int i;
        int min=num[0];
        for ( i=1;i < num.length ; i++)
            if (num[i]<min)
                min=num[i];
        return min;}

    public static double avg(){

            int sum=0;
            int i;
        for( i=0;i< num.length ;i++){
            sum += num[i]; //0+num[0]=0+10 = 10= sum
            //=10+num [1] = 10 + 90 = 100
            // 100+num[2]=100+324 = 424
            // 424+num[3]=424+9808= x
            // =x + num[4] = sum
        }
        double avg=(double) sum / num.length;
        return avg;
    }


    public static int[] SortedArray() {
        int[] sortedArr = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            sortedArr[i] = num[i];
        }

        for (int i = 0; i < sortedArr.length - 1; i++) {
            for (int j = i + 1; j < sortedArr.length; j++) {
                if (sortedArr[i] > sortedArr[j]) {
                    int temp = sortedArr[i];
                    sortedArr[i] = sortedArr[j];
                    sortedArr[j] = temp;
                }
            }
        }

        return  sortedArr;
    }
    }


