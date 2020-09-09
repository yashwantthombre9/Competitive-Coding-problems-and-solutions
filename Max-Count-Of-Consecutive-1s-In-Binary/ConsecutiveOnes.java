

public class ConsecutiveOnes {
    public static int MaxCount(String BinaryString){
     int maxCount = 0;
     int count = 0;
     for(int i = 0;i<BinaryString.length();i++)
     {
         if(BinaryString.charAt(i) == '1'){
             count += 1;
         }
         else{
             if(count>maxCount)
             maxCount = count;
             count = 0;
         }
     }
        return maxCount;
    }
    public static void main(String args[])
    {
       String BinaryString = "110011100011110000";
       System.out.println(MaxCount(BinaryString));
    }
}
