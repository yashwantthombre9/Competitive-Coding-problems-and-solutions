public class PrefixSum{


    public static int SumBetweenGivenRange(int numbers[],int start,int end){
         for(int i = 1;i<numbers.length;i++){

            numbers[i] += numbers[i-1];

         }
if(start <= 0)
return numbers[end];

         return (numbers[end] - numbers[start-1]);
        
    }
    public static void main(String args[])
    {
        //problem statement will be given like this.
        /*
           you will be given an array and range queries will be given which will ask to find out 
           the sum of the array elements within the given range

           So normal bruteforce solution will take O(n^2) time complexity;
           and using this prefix-sum method we can reduce it to O(n) time;

           So lets discuss...

        */

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(SumBetweenGivenRange(arr, 0, 2));


    }
}