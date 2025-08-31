import java.util.*;
public class assignmentarray{
    public static int trapped(int height[] ){
        int collection=0;
        int maxleft[]=new int[height.length];
        maxleft[0]=height[0];
        int maxright[]=new int[height.length];
        maxright[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++){
            maxleft[i]=Math.max(height[i],maxleft[i-1]);
        }
        for(int i=height.length-2;i>=0;i--){
            maxright[i]=Math.max(height[i],maxright[i+1]);
        }
        for(int i=0;i<height.length;i++){
            int waterlevel=Math.min(maxleft[i],maxright[i]);
            int collected=waterlevel-height[i];
            collection+=collected;
        }
        return collection;
    }
    public static void main(String[] args) {
    int height[]={2,81,23,34,65,65,34,96,42,86,54,98};
        System.out.print("water collected:"+trapped(height));
    }
}
/*{
    public static int maximumprofit(int stocks[]){
        int max=Integer.MIN_VALUE;
        int n=stocks.length-1;
        int buy=stocks[0];
        for(int i=0;i<=n-1;i++){
            if(buy>stocks[i]){
                buy=stocks[i];
            }
            else{
                int profit=0;
                profit=stocks[i]-buy;
                max=Math.max(profit,max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int stocks[]={7,1,5,3,6,4};
        System.out.print(maximumprofit(stocks));
    }
}*/

/*    public static int sorted(int number[],int target){
        int start=0;
        int end=number.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(number[mid]==target){
                return mid;
            }
            if(number[start]<=number[mid]){
                if(number[start]<=target&&target<=number[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(number[mid]<=target&& target<=number[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int number[]={4,5,6,7,0,1,2};
        System.out.print(sorted(number,3));
    }*/
/*public class assignmentarray {
    public static boolean check(int given[]){
        for(int i=0;i<given.length;i++){
            for(int k=i+1;k<given.length;k++){
                if(given[i]==given[k]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int given[]={1,2,3,4};
        System.out.print(check(given));
    }
}*/
