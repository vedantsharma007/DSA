package BinarySearch;

public class firstAndLastPos {
    public int firstPos(int[] nums,int target){
        int first=-1;
        int st=0,e=nums.length-1;
        while(st<=e){
            int m=(st+e)/2;
            if(nums[m]==target){
                first=m;
                e=m-1;
            }
            else if(nums[m]<target){
                st=m+1;
            }
            else{
                e=m-1;
            }
        }
        return first;
    }
    public int lastPos(int[] nums,int target){
        int last=-1;
        int s=0,e=nums.length-1;
        while(s<=e){
            int m=(s+e)/2;
            if(nums[m]==target){
                last=m;
                s=m+1;
            }
            else if(nums[m]<target){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return last;
    }
    public static void main(String[] args){
        int[] nums={1,1,2,2,2,2,3,3,4,5,6};
        int target =2;
        firstAndLastPos obj=new firstAndLastPos();
        int first=obj.firstPos(nums,target);

        firstAndLastPos obj1=new firstAndLastPos();
        int last=obj1.lastPos(nums,target);

        System.out.println("first position is: "+first);
        System.out.println("last position is: "+last);
    }
}
